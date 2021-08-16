<%-- 
    Document   : Chirugical
    Created on : 10-Aug-2021, 1:56:30 PM
    Author     : SAAD
--%>

<%@page import="com.ws.Operation"%>
<%@page import="com.ws.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%


    

 String erorr =" "; 
  erorr= (String) session.getAttribute("Error");


    java.util.List<com.ws.Operation> operat = null;
    try {
        com.ws.Chirurgical_Service service = new com.ws.Chirurgical_Service();
        com.ws.Chirurgical port = service.getChirurgicalPort();
        // TODO process result here
        operat = port.listeOperation();

    } catch (Exception ex) {

    }
    

%>

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <meta name="viewport" content="width=device-width, initial-scale=1">
             <link rel="stylesheet" href="asset/css/bootstrap.min.css">
            <script src="asset/js/jquery-3.6.0.min.js"></script>
            <script src="asset/js/bootstrap.min.js"></script>
            <script src="asset/jss/popper.min.js"></script>
            <title>med app</title>
        </head>

        <body>




        <nav class="navbar navbar-light bg-light">
            <div class="container-fluid">
                <span class="navbar-brand mb-0 h1">Medical APP</span>

                <div class="dropdown">
                    <img src="https://mdbootstrap.com/img/new/avatars/2.jpg" class="rounded-circle"  height="25"         alt="" loading="lazy"
                         />
                   Profile
                    <button type="button" class="btn  dropdown-toggle" data-toggle="dropdown">

                    </button>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="logout.jsp">LogOut</a>

                    </div>
                </div>
            </div>

        </nav>

        </br>
        </br>
        <!-- Button trigger modal -->
        <!-- Button trigger modal -->
<div   class="alert alert-success" role="alert">
 <%=erorr%>
</div>
</div>
        <div class="main-content">
            <div class="section__content section__content--p30">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="table-responsive table--no-card m-b-30">
                                <table class="table table-borderless table-striped table-earning">


                                    <div class="row">
                                        <div class="col-md-12">
                                            <!-- DATA TABLE -->


                                            <div class="table-responsive table-responsive-data2">
                                                <table id="example" class="table table-striped table-bordered" style="width:100%">
                                                    <thead>
                                                        <tr>
                                                            <th>Etat Opération</th>
                                                            <th>Num Operation</th>
                                                            <th>Cause médicale</>
                                                            <th>Nom médecin Prv</th>
                                                            <th>compt rendu</th>
                                                            <th>billan</th>
                                                            <th>Nom médecin Operation</th>
                                                            <th>Date Opération</th>
                                                            <th>Nom & Prenom</th>
                                                            <th>date de naissance</th>
                                                            <th>Sex</th>
                                                            <th>TEl</th>
                                                            <th>
                                                                Action 
                                                            </th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <% for (Operation op : operat) {%>
                                                        <tr>
                                                            <td><% if (op.getEtatChu().equals("Valider")) {

                                                                    out.println("<span class=\"text-success\">" + op.getEtatChu() + "</span>");
                                                                } else {
                                                                    out.print("<span class=\"text-warning\">" + op.getEtatChu() + "</span>");
                                                                }%></td>
                                                            <td><%= op.getIdOperation()%></td>
                                                            <td><%= op.getCauseMedecal()%></td>
                                                            <td><%= op.getNomMedecinPrv()%></td>
                                                            <td><%= op.getCompteRendu()%></td>
                                                            <td><%= op.getBillan()%></td>
                                                            <td><%= op.getMedecinOperation()%></td>
                                                            <td><%= op.getDateOperation()%></td>

                                                            <td><%= op.getNom() + " " + op.getPrenom()%></td>
                                                            <td><%= op.getDateN()%></td>
                                                            <td><%= op.getSex()%></td>
                                                            <td><%= op.getTel()%></td>

                                                            <td> <% if (!op.getEtatChu().equals("Valider")) {%>
                                                                <form action="validerOp" method="post">
                                                                    <input  name="id" type="hidden" value="<%= op.getIdOperation()%>" />
                                                                    <button type="submit"  name="v" class="btn btn-success ">Valider</button>
                                                                </form>
                                                                <%}%>
                                                            </td>
                                                        </tr>
                                                        <%}%> 
                                                    </tbody>

                                                </table>
                                            </div>
                                            <!-- END DATA TABLE -->
                                        </div>

                                        </tbody>
                                </table>
                            </div>
                            <!-- END DATA TABLE-->
                        </div>
                    </div>

                </div>
            </div>
        </div>
        </div>

        </div>



        </body>
    </html>
</f:view>
