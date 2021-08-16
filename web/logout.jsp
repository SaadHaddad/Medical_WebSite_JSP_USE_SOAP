<%-- 
    Document   : logout
    Created on : 11-Aug-2021, 2:38:02 PM
    Author     : SAAD
--%>
<%

HttpSession s = request.getSession(false);
if(s != null)
    s.invalidate();
request.getRequestDispatcher("index.jsp").forward(request,response);
%>