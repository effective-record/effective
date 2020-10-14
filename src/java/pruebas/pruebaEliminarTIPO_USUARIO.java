package pruebas;

import controlador.TIPO_USUARIO_DAO;
import java.util.ArrayList;
import modelo.TIPO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarTIPO_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TIPO_USUARIO_DAO mi_tipo_usuario_dao = new TIPO_USUARIO_DAO();
        ArrayList<TIPO_USUARIO> mi_lista_tipo_usuario = mi_tipo_usuario_dao.ConsultarListarTipo_usuario(1, "");

        for (TIPO_USUARIO C : mi_lista_tipo_usuario) {

            System.out.println("Número de id - " + C.getId_tipo_usuario() + "\n" + "Descripción tipo usuario - " + C.getDescripcion_tipo_usuario());
        }
        System.out.println("El registro se elimino satisfactoriamnete");
        mi_tipo_usuario_dao.EliminarTipo_usuario(mi_lista_tipo_usuario.get(0));
        mi_lista_tipo_usuario = mi_tipo_usuario_dao.ConsultarListarTipo_usuario(1, "");

        for (TIPO_USUARIO C : mi_lista_tipo_usuario) {

            System.out.println("Número de id - " + C.getId_tipo_usuario() + "\n" + "Descripción tipo usuario - " + C.getDescripcion_tipo_usuario());

        }

    }

}
