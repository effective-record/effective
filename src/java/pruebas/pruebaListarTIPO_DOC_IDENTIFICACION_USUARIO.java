package pruebas;

import controlador.TIPO_DOC_IDENTIFICACION_USUARIO_DAO;
import java.util.ArrayList;
import modelo.TIPO_DOC_IDENTIFICACION_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarTIPO_DOC_IDENTIFICACION_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TIPO_DOC_IDENTIFICACION_USUARIO_DAO mi_tipo_doc_usuario_dao = new TIPO_DOC_IDENTIFICACION_USUARIO_DAO();
        ArrayList<TIPO_DOC_IDENTIFICACION_USUARIO> mi_doc_usuario = new ArrayList<TIPO_DOC_IDENTIFICACION_USUARIO>();
        mi_doc_usuario = mi_tipo_doc_usuario_dao.ConsultarListadoTipo_doc_usuario(1, "");

        int size = mi_doc_usuario.size();
        System.out.println("<table border=\"1\")><br><td>id_doc_identificacion_usuario</td><td>tipo_doc_identificacion_usuario</td>");

        for (TIPO_DOC_IDENTIFICACION_USUARIO U : mi_doc_usuario) {

            System.out.println("<tr>");
            System.out.println("<td>" + U.getId_doc_identificacion_usuario() + "</td>");
            System.out.println("<td>" + U.getTipo_doc_identificacion_usuario() + "</td>");
            System.out.println("</tr>");

        }

        System.out.println("</table>");

    }

}
