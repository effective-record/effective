package servlet;

import controlador.PROVEEDORES_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.PROVEEDORES;

/**
 *
 * @author AndresSaenz
 */
@WebServlet(name = "Registrar_proveedores", urlPatterns = {"/Registrar_proveedores"})
public class Registrar_proveedores extends HttpServlet {

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

        String Identificacion = request.getParameter("identificacion");
        String Nombre = request.getParameter("nombre");
        String Correo = request.getParameter("correo");
        String Direccion = request.getParameter("direccion");
        String Telefonouno = request.getParameter("telefonouno");
        String Telefonodos = request.getParameter("telefonodos");
        String BanderaEstado = request.getParameter("banderaestado");

        PROVEEDORES_DAO mi_proveedor_dao = new PROVEEDORES_DAO();
        PROVEEDORES mi_proveedor = new PROVEEDORES();

        mi_proveedor.setIdentificacion_proveedor(Identificacion);
        mi_proveedor.setNombre_proveedor(Nombre);
        mi_proveedor.setCorreo_proveedor(Correo);
        mi_proveedor.setDireccion_proveedor(Direccion);
        mi_proveedor.setTelefono_1_proveedor(Telefonodos);
        mi_proveedor.setTelefono_2_proveedor(Telefonodos);

        System.out.println("El valor es " + BanderaEstado);

        if (BanderaEstado.equals("Correcto")) {

            String respuestaRegistrada = mi_proveedor_dao.AdicionarProveedores(mi_proveedor);
            System.out.println("Res" + respuestaRegistrada);
            System.out.println("Res" + respuestaRegistrada.length());

            if (respuestaRegistrada.length() == 0) {

                out.println("<script type=\"text/javascript\">");
                out.println("alert ('" + "Proveedor registrado con exito. " + "');");
                out.println("window.location.href = 'index.html'; ");
                out.println("</script>");

            } else {

                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + respuestaRegistrada + "');");
                out.println("alert('" + "Error Encontrado: " + respuestaRegistrada.replace("'", "") + "');");
                out.println("window.registrarproveedores.jsp");
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
