package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ws.User;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<f:view>\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("            <link rel=\"stylesheet\"\n");
      out.write("                  href=\"css/\">\n");
      out.write("            <title>JSP Page</title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-expand-md navbar-dark\"\n");
      out.write("                 style=\"background-color: darkturquoise\">\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"#\" class=\"navbar-brand\"> MED APP </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container col-md-5\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                    <caption>\n");
      out.write("                        <h2>\n");
      out.write("\n");
      out.write("                            Connexion \n");
      out.write("\n");
      out.write("\n");
      out.write("                        </h2>\n");
      out.write("                    </caption>\n");
      out.write("                    <form action=\"loginSertvlet\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\"> \n");
      out.write("                            ");
 if (error != null) {
      out.write("    \n");
      out.write("                            <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                                ");
      out.print( error);
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            ");
 }
      out.write("  \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Nom d'utilisateur</label>\n");
      out.write("                            <input type=\"text\"\n");
      out.write("                                   value=\"\" class=\"form-control\"\n");
      out.write("                                   name=\"username\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Mot de passe</label>\n");
      out.write("                            <input type=\"password\" value=\"\" class=\"form-control\"  name=\"password\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-outline-primary float-right\">S'identifier</button>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
      out.write("</f:view>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
