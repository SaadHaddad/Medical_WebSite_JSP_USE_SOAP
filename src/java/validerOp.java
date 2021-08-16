/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SAAD
 */
public class validerOp extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
    // check desponobility de resource
     boolean  disponibleR=disponinibibiliteResource(1);
String messageError="";
    
    if (disponibleR){
            // get la date disponible de operation
             String DateOP= recupereDateOperation();
                // get le non de medcin disponible de operation
                 String nomMed=disponinibibiliteMedecin(DateOP);
                 //get id de operation
                 int id_op=Integer.parseInt((String)request.getParameter("id"));
     
                 if(nomMed!=null)
                 {
                    
                         // valider operation
                    String   confermed = confirmerOperation(id_op,DateOP,nomMed);
                      // allouer les resource
                      allouerResource(1);
                     messageError=confermed;
                 }else
                 {
                 // il n'est pas de medecin disponible
                  messageError="il y a  pas de médecin disponible";
                 }  
                 
                 
    }else{
    //les resource non disponible
    messageError="ressource non disponible";
    }
    
      HttpSession chSession=request.getSession();
    
      chSession.setAttribute("Error",messageError);
                 response.sendRedirect("ChirugicalPage.jsp");
    
   
    
            
            
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

    private static boolean disponinibibiliteResource(int numCabinet) {
        com.ws.Chirurgical_Service service = new com.ws.Chirurgical_Service();
        com.ws.Chirurgical port = service.getChirurgicalPort();
        return port.disponinibibiliteResource(numCabinet);
    }

    private static String recupereDateOperation() {
        com.ws.Chirurgical_Service service = new com.ws.Chirurgical_Service();
        com.ws.Chirurgical port = service.getChirurgicalPort();
        return port.recupereDateOperation();
    }

    private static String disponinibibiliteMedecin(java.lang.String date) {
        com.ws.Chirurgical_Service service = new com.ws.Chirurgical_Service();
        com.ws.Chirurgical port = service.getChirurgicalPort();
        return port.disponinibibiliteMedecin(date);
    }

    private static String confirmerOperation(int idOp, java.lang.String date, java.lang.String nom) {
        com.ws.Chirurgical_Service service = new com.ws.Chirurgical_Service();
        com.ws.Chirurgical port = service.getChirurgicalPort();
        return port.confirmerOperation(idOp, date, nom);
    }

    private static String allouerResource(int id) {
        com.ws.Chirurgical_Service service = new com.ws.Chirurgical_Service();
        com.ws.Chirurgical port = service.getChirurgicalPort();
        return port.allouerResource(id);
    }

}
