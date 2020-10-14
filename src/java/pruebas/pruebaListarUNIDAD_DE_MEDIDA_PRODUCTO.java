package pruebas;

import controlador.UNIDAD_DE_MEDIDA_PRODUCTO_DAO;
import java.util.ArrayList;
import modelo.UNIDAD_DE_MEDIDA_PRODUCTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarUNIDAD_DE_MEDIDA_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        UNIDAD_DE_MEDIDA_PRODUCTO_DAO mi_unidad_medida_dao = new UNIDAD_DE_MEDIDA_PRODUCTO_DAO();
        ArrayList<UNIDAD_DE_MEDIDA_PRODUCTO> mi_unidad_medida = new ArrayList<UNIDAD_DE_MEDIDA_PRODUCTO>();
        mi_unidad_medida = mi_unidad_medida_dao.ConsultarListarUnidad_de_medida(1, "");

        int size = mi_unidad_medida.size();
        System.out.println("<table border=\"1\")><br><td>id_tipo_usuario</td><td>descripcion_tipo_usuario</td>");

        for (UNIDAD_DE_MEDIDA_PRODUCTO U : mi_unidad_medida) {

            System.out.println("<tr>");
            System.out.println("<td>" + U.getId_unidad_de_medida_producto() + "</td>");
            System.out.println("<td>" + U.getDescripcion_unidad_de_medida_producto() + "</td>");
            System.out.println("</tr>");

        }

        System.out.println("</table>");

    }

}


