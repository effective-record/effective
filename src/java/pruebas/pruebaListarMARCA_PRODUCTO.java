package pruebas;

import controlador.MARCA_PRODUCTO_DAO;
import java.util.ArrayList;
import modelo.MARCA_PRODUCTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarMARCA_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MARCA_PRODUCTO_DAO marcaproducto_dao = new MARCA_PRODUCTO_DAO();
        ArrayList<MARCA_PRODUCTO> mi_marcaproducto = new ArrayList<MARCA_PRODUCTO>();
        mi_marcaproducto = marcaproducto_dao.ConsultarListadoMarcaProducto(1, "");

        int size = mi_marcaproducto.size();
        System.out.println("<table border=\"1\")><br><td>id_marca_producto</td><td>nombre_marca_producto</td>");

        for (MARCA_PRODUCTO M : mi_marcaproducto) {

            System.out.println("<tr>");
            System.out.println("<td>" + M.getId_marca_producto() + "</td>");
            System.out.println("<td>" + M.getNombre_marca_producto() + "</td>");

            System.out.println("</tr>");

        }

        System.out.println("</table>");

    }

}


