/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.USUARIOS_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.USUARIOS;

/**
 *
 * @author AndresSaenz
 */
@WebServlet(name = "IniciarSesion", urlPatterns = {"/IniciarSesion"})
public class IniciarSesion extends HttpServlet {

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
            
        String Identificacion = request.getParameter("identificacion");
        String Clave = request.getParameter("clave");
            
            try{

            
            USUARIOS_DAO mi_usario_dao = new USUARIOS_DAO();

            USUARIOS mi_usuario = new USUARIOS();
            mi_usuario = mi_usario_dao.ConsultarUsuarios(Identificacion);

            if (mi_usuario == null) {

                System.out.println(Identificacion);
                out.println("<script type=\"text/javascript\">");
                out.println("alert(' " + " El número de identificacion - " + Identificacion + " no existe" + "');");
                out.println("window.location.href ='autenticaciondeusuarios.jsp';");
                out.println("</script>");

            } else {
                
                System.out.println(mi_usuario.getClave());
                System.out.println(Clave);

                if (mi_usuario.getClave().equals(Clave)) {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert ('" + " Bienvenid@ - " + mi_usuario.getNombres_usuario()+ "-" + mi_usuario.getApellidos_usuario() + "-" +  mi_usuario.getIdentificacion_usuario() + "');");
                    out.println("window.location.href ='menu.jsp';");
                    out.println("</script>");
                    
                } else {

                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "La clave es incorrecta" + "');");
                    out.println("window.location.href ='autenticaciondeusuarios.jsp';");
                    out.println("</script>");

                }

            }

        }catch(NumberFormatException ex){
            
            out.println("<script type=\"text/javascript\">");
            out.println("alert ('" + "La identificacion debe tener valores numerios : " + Identificacion+ "');");
            out.println("</script>");
            

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

}
