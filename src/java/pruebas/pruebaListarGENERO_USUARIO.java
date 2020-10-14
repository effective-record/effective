package pruebas;

import controlador.GENERO_USUARIO_DAO;
import java.util.ArrayList;
import modelo.GENERO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarGENERO_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GENERO_USUARIO_DAO mi_genero_usuario_dao = new GENERO_USUARIO_DAO();
        ArrayList<GENERO_USUARIO> mi_genero_usuario = new ArrayList<GENERO_USUARIO>();
        mi_genero_usuario = mi_genero_usuario_dao.ConsultarListarGenero_usuario(1, "");

        int size = mi_genero_usuario.size();
        System.out.println("<table border=\"1\")><br><td>id_genero_usuario</td><td>descripcion_genero_usuario</td>");

        for (GENERO_USUARIO U : mi_genero_usuario) {

            System.out.println("<tr>");
            System.out.println("<td>" + U.getId_genero_usuario() + "</td>");
            System.out.println("<td>" + U.getDescripcion_genero_usuario() + "</td>");
            System.out.println("</tr>");

        }

        System.out.println("</table>");

    }

}
