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
@WebServlet(name = "Registrar_usuarios", urlPatterns = {"/Registrar_usuarios"})
public class Registrar_usuarios extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        String Nombres = request.getParameter("nombres");
        String Apellidos = request.getParameter("apellidos");
        String Telefono = request.getParameter("telefono");
        String Direccion = request.getParameter("direccion");
        String Correo = request.getParameter("correo");
        String Identificacion = request.getParameter("identificacion");
        String Clave = request.getParameter("clave");
        String Tipo_documento = request.getParameter("id_tipo_documento");
        String Tipo_usuario = request.getParameter("id_tipo_usuario");
        String Genero_usuario = request.getParameter("id_genero_usuario");
        String Estado_usuario = request.getParameter("id_estado_usuario");
        String BanderaEstado = request.getParameter("BanderaRegistro");

        int id_tipo_documento = Integer.parseInt(Tipo_documento);
        int id_tipo_usuario = Integer.parseInt(Tipo_usuario);
        int id_genero_usuario = Integer.parseInt(Genero_usuario);
        int id_estado_usuario = Integer.parseInt(Estado_usuario);

        USUARIOS_DAO mi_usuario_dao = new USUARIOS_DAO();
        USUARIOS mi_usuario = new USUARIOS();

        mi_usuario.setNombres_usuario(Nombres);
        mi_usuario.setApellidos_usuario(Apellidos);
        mi_usuario.setTelefono_usuario(Telefono);
        mi_usuario.setDireccion_usuario(Direccion);
        mi_usuario.setCorreo_usuario(Correo);
        mi_usuario.setIdentificacion_usuario(Identificacion);
        mi_usuario.setClave(Clave);
        mi_usuario.setTIPO_DOC_IDENTIFICACION_USUARIO_id_doc_identificacion_usuario(id_tipo_documento);
        mi_usuario.setTIPO_USUARIO_id_tipo_usuario(id_tipo_usuario);
        mi_usuario.setGENERO_USUARIO_id_genero_usuario(id_genero_usuario);
        mi_usuario.setESTADO_USUARIO_id_estado_usuario(id_estado_usuario);

        System.out.println("El valor es " + BanderaEstado);

        if (BanderaEstado.equals("Correcto")) {

            String respuestaRegistrada = mi_usuario_dao.AdicionarUsuarios(mi_usuario);
            System.out.println("Res " + respuestaRegistrada);
            System.out.println("Res " + respuestaRegistrada.length());

            if (respuestaRegistrada.length() == 0) {

                out.println("<script type=\"text/javascript\">");
                out.println("alert ('" + "Usuario registrado con exito. " + "');");
                out.println("window.location.href = 'index.html'; ");
                out.println("</script>");

            } else {

                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + respuestaRegistrada + "');");
                out.println("alert('" + "Error Encontrado: "+ respuestaRegistrada.replace("'", "") + "');");
                out.println("window.registrarusuarios.jsp");
                out.println("</script>");

            }

        } else {

            System.out.println("Ell valor no es correcto" + BanderaEstado);

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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }

