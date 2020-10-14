package pruebas;

import controlador.ESTADO_USUARIO_DAO;
import java.util.ArrayList;
import modelo.ESTADO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarESTADO_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ESTADO_USUARIO_DAO mi_estado_usuario_dao = new ESTADO_USUARIO_DAO();
        ArrayList<ESTADO_USUARIO> mi_estado_usuario = new ArrayList<ESTADO_USUARIO>();
        mi_estado_usuario = mi_estado_usuario_dao.ConsultarListarEstado_usuario(1, "");

        int size = mi_estado_usuario.size();
        System.out.println("<table border=\"1\")><br><td>id_estado_usuario</td><td>descripcion_estado_usuario</td>");

        for (ESTADO_USUARIO U : mi_estado_usuario) {

            System.out.println("<tr>");
            System.out.println("<td>" + U.getId_estado_usuario() + "</td>");
            System.out.println("<td>" + U.getDescripcion_estado_usuario() + "</td>");
            System.out.println("</tr>");

        }

        System.out.println("</table>");

    }

}
