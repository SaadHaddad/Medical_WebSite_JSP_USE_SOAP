<%-- 
    Document   : AgentPage
    Created on : 7-Aug-2021, 5:41:27 PM
    Author     : SAAD
--%>


<%@page import="com.ws.Patients"%>
<%@page import="java.util.List"%>
<%@page import="com.ws.Operation"%>
<%@page import="com.ws.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%


   
    List<Patients> patint = null;
    List<String> medecin = null;
    List<Operation> opetation=null;
    try {
        com.ws.Agent_Service service = new com.ws.Agent_Service();
        com.ws.Agent port = service.getAgentPort();
        // TODO process result here
      
        patint = port.listePatiens();
        medecin = port.listeNomMedecins();
        opetation=port.afficherOperation();
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
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
            Ajouter operation 
        </button>
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#idpat">
            Ajouter patient 
        </button>

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
                                                            <th>Nom médecin Operation</th>
                                                            <th>Date Opération</th>
                                                            <th>Id patient</th>
                                                            <th>Nom & Prenom</th>
                                                            <th>date de naissance</th>
                                                            <th>Sex</th>
                                                            <th>TEl</th>
                                                            <th>Adress</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <% for(Operation op:opetation){%>
                                                        <tr>
                                                            <td><% if(op.getEtatChu().equals("Valider")){
                                                                
                                                               out.print("<span class=\"text-success\">"+op.getEtatChu()+"</span>");
                                                            }else{
                                                               out.print("<span class=\"text-warning\">"+op.getEtatChu()+"</span>");  
                                                        } %></td>
                                                            <td><%= op.getIdOperation()%></td>
                                                            <td><%= op.getCauseMedecal()%></td>
                                                            <td><%= op.getNomMedecinPrv()%></td>
                                                            <td><%= op.getMedecinOperation()%></td>
                                                            <td><%= op.getDateOperation()%></td>
                                                            <td><%= op.getIdPat()%></td>
                                                            <td><%= op.getNom()+" "+op.getPrenom()%></td>
                                                            <td><%= op.getDateN()%></td>
                                                            <td><%= op.getSex()%></td>
                                                            <td><%= op.getTel()%></td>
                                                            <td><%= op.getAdress()%></td>
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




        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Ajouter une opération</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form action="addOp" method="post">
                    <div class="modal-body">

                        <div class="form-group">
                            <label class="col-md-4 control-label">Patient</label>
                            <div class="col-md-8 inputGroupContainer">
                                <select class="form-select form-select-lg mb-3"  name="patient" aria-label=".form-select-lg example">
                                    <%  for (Patients p : patint) {%>
                                    <option ><%= p.getIdPat()+":"+p.getNom()%></option>
                                    <%}%>
                                </select>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-4 control-label">Nom medecin</label>
                            <div class="col-md-8 inputGroupContainer">
                                <select class="form-select form-select-lg mb-3"  name="med"aria-label=".form-select-lg example">
                                    <%  for (String p : medecin) {%>
                                    <option value ="<%=p%>"><%=p%></option>
                                    <%}%>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-md-4 control-label">cause médical</label>
                            <div class="col-md-8 inputGroupContainer">
                                <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                                    <input id="cause_med" name="cause_med" class="form-control" required="true" value="" type="text"></div>

                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-4 control-label">num billan</label>
                            <div class="col-md-8 inputGroupContainer">
                                <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                                    <input id="billan" name="num_billan" class="form-control" type="text"></div>
                            </div>
                        </div>  


                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Save changes</button>
                    </div>
                                </form>
                </div>
            </div>
        </div>


        <div class="modal fade" id="idpat" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Ajouter un patient</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
              <form action="addPatient" method="post">
                  
                    <div class="modal-body">
                        <div class="form-group">
                            <label class="col-md-12 control-label">Nom</label>
                            <div class="col-md-12 inputGroupContainer">
                                <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                                    <input id="nom" name="nom" class="form-control" required="true" value="" type="text">
                                </div>
                            </div>
                        </div>
                    
                    
                        <div class="form-group">
                            <label class="col-md-12 control-label">Prenom</label>
                            <div class="col-md-12 inputGroupContainer">
                                <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                                    <input id="prenom" name="prenom" class="form-control" required="true" value="" type="text">
                                </div>
                            </div>
                        </div>
                           <div class="form-group">
                            <label class="col-md-12 control-label">Date de naissance</label>
                            <div class="col-md-12 inputGroupContainer">
                                <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                                    <input id="Date" name="Date" class="form-control" required="true" value="" type="text">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-12 control-label">sex</label>
                            <div class="col-md-12 inputGroupContainer">
                                <select class="form-select form-select-lg mb-12"  name="sex"aria-label=".form-select-lg example">

                                    <option >Homme</option>
                                    <option >Femme</option>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-md-12 control-label">TEl</label>
                            <div class="col-md-12 inputGroupContainer">
                                <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                                    <input id="TEl" name="tel" class="form-control" value="" type="text">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-12 control-label">adresse</label>
                            <div class="col-md-12 inputGroupContainer">
                                <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                                    <input id="adresse" name="adresse" class="form-control"  value="" type="text">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
                        <button type="submit" class="btn btn-primary">Sauvegarder</button>
                    </div>
                  </form>  
                </div>
            </div>
        </div>

        </body>
    </html>
</f:view>
