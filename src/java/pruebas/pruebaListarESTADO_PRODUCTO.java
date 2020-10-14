
package pruebas;

import controlador.ESTADO_PRODUCTO_DAO;
import java.util.ArrayList;
import modelo.ESTADO_PRODUCTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarESTADO_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ESTADO_PRODUCTO_DAO estadoproducto_dao = new ESTADO_PRODUCTO_DAO();
        ArrayList<ESTADO_PRODUCTO> mi_estadoproducto = new ArrayList<ESTADO_PRODUCTO>();
        mi_estadoproducto = estadoproducto_dao.ConsultarListadoEstadoProducto(1, "");

        int size = mi_estadoproducto.size();
        System.out.println("<table border=\"1\")><br><td>id_estado_producto</td><td>descripcion_estado_producto</td>");

        for (ESTADO_PRODUCTO E : mi_estadoproducto) {

            System.out.println("<tr>");
            System.out.println("<td>" + E.getId_estado_producto()+ "</td>");
            System.out.println("<td>" + E.getDescripcion_estado_producto()+ "</td>");
     

            System.out.println("</tr>");

        }

        System.out.println("</table>");

    }

}
        
        
     
    
    

