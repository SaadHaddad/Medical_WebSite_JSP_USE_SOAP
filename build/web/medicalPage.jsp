<%-- 
    Document   : medicalPage
    Created on : 10-Aug-2021, 3:05:22 AM
    Author     : SAAD
--%>
<%@page import="com.ws.Patients"%>
<%@page import="java.util.List"%>
<%@page import="com.ws.Operation"%>
<%@page import="com.ws.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
 

   
    List<Operation> opetation = null;
    try {
        com.ws.Medical_Service service = new com.ws.Medical_Service();
        com.ws.Medical port = service.getMedicalPort();
        opetation = port.afficherOperation();
    } catch (Exception ex) {
        // TODO handle custom exceptions here
    }
%>




<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

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
        <script>
            $('#myModal').on('shown.bs.modal', function () {
                $('#myInput').trigger('focus')
            })
        </script>
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
                                                            <th>Id patient</th>
                                                            <th>Nom & Prenom</th>
                                                            <th>date de naissance</th>
                                                            <th>Sex</th>
                                                            <th>TEl</th>
                                                            <th>Adress</th>
                                                            <th>
                                                                Action 
                                                            </th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <% for (Operation op : opetation) {%>
                                                        <tr>
                                                            <td><% if (op.getEtatChu().equals("Valider")) {

                                                                    out.print("<span class=\"text-success\">" + op.getEtatChu() + "</span>");
                                                                } else {
                                                                    out.print("<span class=\"text-warning\">" + op.getEtatChu() + "</span>");
                                                                }%></td>
                                                            <td><%= op.getIdOperation()%></td>
                                                            <td><%= op.getCauseMedecal()%></td>
                                                            <td><%= op.getNomMedecinPrv()%></td>
                                                            <td><%= op.getCompteRendu()%></td>
                                                            <td><%= op.getBillan()%></td>
                                                            <td><%= op.getIdPat()%></td>
                                                            <td><%= op.getNom() + " " + op.getPrenom()%></td>
                                                            <td><%= op.getDateN()%></td>
                                                            <td><%= op.getSex()%></td>
                                                            <td><%= op.getTel()%></td>
                                                            <td><%= op.getAdress()%></td>
                                                            <td> 

                                                                <a href="AddComptrendu.jsp?id=<%= op.getIdOperation()%>"  >Ajouter Compt-rendu</a>

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
