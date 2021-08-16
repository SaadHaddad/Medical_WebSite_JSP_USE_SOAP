<%-- 
    Document   : AddComptrendu
    Created on : 10-Aug-2021, 11:05:53 AM
    Author     : SAAD
--%>

<%@page import="com.ws.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
                  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <meta name="viewport" content="width=device-width, initial-scale=1">
       <link rel="stylesheet" href="asset/css/bootstrap.min.css">
            <script src="asset/jss/jquery-3.6.0.min.js"></script>
            <script src="asset/jss/bootstrap.min.js"></script>
                <script src="asset/jss/popper.min.js"></script>
            <title>med app</title>
        </head>
        <body>
            <%
    User u = (User) session.getAttribute("user");
    if (u == null) {
        response.sendRedirect("Login.jsp");
    }
    String name = u.getUser();%>
   <div class="container col-md-5">
            <div class="card">
                <div class="card-body">

                    <caption>
                        <h2>

                            Ajouter compt rendu 


                        </h2>
                    </caption>
                    <form action="medical" method="post">
                            <div class="form-group">
                                <input  name="id" type="hidden" value="<%=request.getParameter("id")%>" />
                            <label class="col-md-12 control-label">Compte rendu</label>
                            <div class="col-md-12 inputGroupContainer">
                                <div class="input-group">
                            <textarea class="form-control" name="comtp" id="exampleFormControlTextarea1" rows="3"></textarea>
                            </div>
                        </div>
                                <div class="form-group">
                        <button type="submit" class="btn btn-outline-primary float-right">Ajouter</button>
</div>
                    </form>
                </div>
            </div>
        </div>
        </body>
    </html>
</f:view>
