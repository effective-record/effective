package pruebas;

import controlador.CATEGORIA_PRODUCTO_DAO;
import java.util.ArrayList;
import modelo.CATEGORIA_PRODUCTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarCATEGORIA_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CATEGORIA_PRODUCTO_DAO mi_Categoria_producto_dao = new CATEGORIA_PRODUCTO_DAO();
        ArrayList<CATEGORIA_PRODUCTO> mi_Categoria_producto = new ArrayList<CATEGORIA_PRODUCTO>();
        mi_Categoria_producto = mi_Categoria_producto_dao.ConsultarListadoCategoria_producto(1, "");
        ;
        int size = mi_Categoria_producto.size();
        System.out.println("<table border=\"1\")><br><td>id_categoria_producto</td><td>nombre_categoria_producto</td>");

        for (CATEGORIA_PRODUCTO U : mi_Categoria_producto) {

            System.out.println("<tr>");
            System.out.println("<td>" + U.getId_categoria_producto() + "</td>");
            System.out.println("<td>" + U.getNombre_categoria_producto() + "</td>");
            System.out.println("</tr>");

        }

        System.out.println("</table>");

    }
}
