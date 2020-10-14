package pruebas;


import controlador.TIPO_USUARIO_DAO;
import modelo.TIPO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarTIPO_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TIPO_USUARIO_DAO mi_tipo_usuario_dao = new TIPO_USUARIO_DAO();
        TIPO_USUARIO mi_tipo_usuario = mi_tipo_usuario_dao.ConsultarTipo_usuario(3);

        if (mi_tipo_usuario != null) {

            System.out.println("Se realizo la consulta satisfactoriamente del tipo de usuario - " + mi_tipo_usuario.getId_tipo_usuario());
            System.out.println("Descripción del tipo de usuario - " + mi_tipo_usuario.getDescripcion_tipo_usuario());

        } else {

            System.out.println("Ha ocurrido un error durante la consulta");

        }

    }

}
