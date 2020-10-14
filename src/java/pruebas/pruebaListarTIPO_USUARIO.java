package pruebas;

import controlador.TIPO_USUARIO_DAO;
import java.util.ArrayList;
import modelo.TIPO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarTIPO_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TIPO_USUARIO_DAO mi_tipo_usuario_dao = new TIPO_USUARIO_DAO();
        ArrayList<TIPO_USUARIO> mi_tipo_usuario = new ArrayList<TIPO_USUARIO>();
        mi_tipo_usuario = mi_tipo_usuario_dao.ConsultarListarTipo_usuario(1, "");

        int size = mi_tipo_usuario.size();
        System.out.println("<table border=\"1\")><br><td>id_tipo_usuario</td><td>descripcion_tipo_usuario</td>");

        for (TIPO_USUARIO U : mi_tipo_usuario) {

            System.out.println("<tr>");
            System.out.println("<td>" + U.getId_tipo_usuario() + "</td>");
            System.out.println("<td>" + U.getDescripcion_tipo_usuario() + "</td>");
            System.out.println("</tr>");

        }

        System.out.println("</table>");

    }

}
