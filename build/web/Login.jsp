<%-- 
    Document   : Login
    Created on : 7-Aug-2021, 3:37:36 PM
    Author     : SAAD
--%>

<%@page import="com.ws.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String error = null;
    error = (String) session.getAttribute("loginError");
    User u = (User) session.getAttribute("user");
    if (u != null) {
   
        if (u.getRole().equals( "Agent")) {
            response.sendRedirect("AgentPage.jsp");
        }
        if (u.getRole().equals("Medical"))
        {
          response.sendRedirect("medicalPage.jsp");
            
        }if(u.getRole() .equals( "laboratoir")){
        
        response.sendRedirect("lapPage.jsp");
        }
        
        if(u.getRole() .equals( "Chirugical"))
       {
             response.sendRedirect("ChirugicalPage.jsp");
        }
    }
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
          
   <link rel="stylesheet" href="asset/css/bootstrap.min.css">
            <script src="asset/js/jquery-3.6.0.min.js"></script>
            <script src="asset/js/bootstrap.min.js"></script>
 <script src="asset/jss/popper.min.js"></script>
            <title>login</title>
        </head>
        <body>
        <header>
            <nav class="navbar navbar-expand-md navbar-dark"
                 style="background-color: darkturquoise">
                <div>
                    <a href="#" class="navbar-brand"> GAM </a>
                </div>


            </nav>
        </header>
        <br>
        <div class="container col-md-5">
            <div class="card">
                <div class="card-body">

                    <caption>
                        <h2>
                            Connexion 
                        </h2>
                    </caption>
                    <form action="loginSertvlet" method="post">
                        <div class="form-group"> 
                            <% if (error != null) {%>    
                            <div class="alert alert-danger" role="alert">
                                <%= error%>
                            </div>
                            <% }%>  
                        </div>

                        <div class="form-group">
                            <label>Nom d'utilisateur</label>
                            <input type="text"
                                   value="" class="form-control"
                                   name="username">
                        </div>
                        <div class="form-group">
                            <label>Mot de passe</label>
                            <input type="password" value="" class="form-control"  name="password">
                        </div>

                        <button type="submit" class="btn btn-outline-primary float-right">S'identifier</button>

                    </form>
                </div>
            </div>
        </div>
        </body>
    </html>
</f:view>
