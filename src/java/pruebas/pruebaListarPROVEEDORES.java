
package pruebas;

import controlador.PROVEEDORES_DAO;
import java.util.ArrayList;
import modelo.PROVEEDORES;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarPROVEEDORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PROVEEDORES_DAO proveedor_dao = new PROVEEDORES_DAO();
        ArrayList<PROVEEDORES> mi_proveedor = new ArrayList<PROVEEDORES>();
        mi_proveedor = proveedor_dao.ConsultarListadoProveedor("", "");

        int size = mi_proveedor .size();
        System.out.println("<table border=\"1\")><br><td>id_proveedor</td><td>nombre_proveedor</td><td>correo_proveedor</td><td>direccion_proveedor</td>" + "<td>clave</td><td>telefono1_proveedor</td><td>telefono2_proveedor</td>");

        for (PROVEEDORES U : mi_proveedor) {

            System.out.println("<tr>");
            System.out.println("<td>" + U.getIdentificacion_proveedor() + "</td>");
            System.out.println("<td>" + U.getNombre_proveedor() + "</td>");
            System.out.println("<td>" + U.getCorreo_proveedor() + "</td>");
            System.out.println("<td>" + U.getDireccion_proveedor() + "</td>");
            System.out.println("<td>" + U.getTelefono_1_proveedor() + "</td>");
            System.out.println("<td>" + U.getTelefono_2_proveedor() + "</td>");
            System.out.println("</tr>");

        }

        System.out.println("</table>");

    }

}

        
        
       
    
    

