package pruebas;


import controlador.ESTADO_USUARIO_DAO;
import modelo.ESTADO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarESTADO_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ESTADO_USUARIO_DAO mi_estado_usuario_dao = new ESTADO_USUARIO_DAO();
        ESTADO_USUARIO mi_estado_usuario = mi_estado_usuario_dao.ConsultarEstado_usuario(1);
        

        if (mi_estado_usuario != null) {

            System.out.println("Se realizo la consulta satisfactoriamente del estado de usuario - " + mi_estado_usuario.getId_estado_usuario());
            System.out.println("Descripción del estado del usuario - " + mi_estado_usuario.getDescripcion_estado_usuario());

        } else {

            System.out.println("Ha ocurrido un error durante la consulta");

        }

    }

}
