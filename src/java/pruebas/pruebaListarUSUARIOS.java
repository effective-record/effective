package pruebas;

import controlador.USUARIOS_DAO;
import java.util.ArrayList;
import modelo.USUARIOS;
/**
 *
 * @author AndresSaenz
 */
public class pruebaListarUSUARIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        USUARIOS_DAO usuarios_dao = new USUARIOS_DAO();
        ArrayList<USUARIOS> mi_usuario = new ArrayList<USUARIOS>();
        mi_usuario = usuarios_dao.ConsultarListadoUsuario("", "", "");

        int size = mi_usuario.size();
        System.out.println("<table border=\"1\")><br><td>id_usuario</td><td>nombres_usuario</td><td>apellidos_usuario</td><td>identificacion_usuario</td>" + "<td>clave</td><td>telefono_usuario</td><td>direccion_usuario</td><td>correo_usuario</td><td>TIPO_USUARIO_id_tipo_usuario</td><td>ESTADO_USUARIO_id_estado_usuario</td><td>GENERO_USUARIO_id_genero_usuario</td><td>TIPO_DOC_IDENTIFICACION_USUARIO_id_doc_identificacion_usuario</td>");

        for (USUARIOS U : mi_usuario) {

            System.out.println("<tr>");
            System.out.println("<td>" + U.getId_usuario() + "</td>");
            System.out.println("<td>" + U.getNombres_usuario() + "</td>");
            System.out.println("<td>" + U.getApellidos_usuario() + "</td>");
            System.out.println("<td>" + U.getIdentificacion_usuario() + "</td>");
            System.out.println("<td>" + U.getClave() + "</td>");
            System.out.println("<td>" + U.getTelefono_usuario() + "</td>");
            System.out.println("<td>" + U.getDireccion_usuario() + "</td>");
            System.out.println("<td>" + U.getCorreo_usuario() + "</td>");
            System.out.println("<td>" + U.getTIPO_USUARIO_id_tipo_usuario() + "</td>");
            System.out.println("<td>" + U.getESTADO_USUARIO_id_estado_usuario() + "</td>");
            System.out.println("<td>" + U.getGENERO_USUARIO_id_genero_usuario() + "</td>");
            System.out.println("<td>" + U.getTIPO_DOC_IDENTIFICACION_USUARIO_id_doc_identificacion_usuario() + "</td>");

            System.out.println("</tr>");

        }

        System.out.println("</table>");

    }

}
