/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.ws.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SAAD
 */
@WebServlet(name = "loginSertvlet", urlPatterns = {"/loginSertvlet"})
public class loginSertvlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    
        HttpSession loginSession=request.getSession();
     loginSession.setMaxInactiveInterval (600);
     
        try (PrintWriter out = response.getWriter()) {
 
            String username =request.getParameter("username");
            String pass =request.getParameter("password"); 
           User u = new User();
           u=null;
           u=login(username,pass);
        
            if(u.getUser()!=null){
              
                 loginSession.setAttribute("user",u);
                 loginSession.setAttribute("loginError",null);
                 
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
                 
               
             }else{
             
                 
                
                 loginSession.setAttribute("loginError"," nom utilisateur ou mot de pass incorrect");
                 response.sendRedirect("Login.jsp");
             }
                 
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static User login(java.lang.String user, java.lang.String pass) {
        com.ws.Login_Service service = new com.ws.Login_Service();
        com.ws.Login port = service.getLoginPort();
        return (User) port.login(user, pass);
    }

   

}
