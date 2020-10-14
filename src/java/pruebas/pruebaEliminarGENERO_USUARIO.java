package pruebas;

import controlador.GENERO_USUARIO_DAO;
import java.util.ArrayList;
import modelo.GENERO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarGENERO_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GENERO_USUARIO_DAO mi_genero_usuario_dao = new GENERO_USUARIO_DAO();
        ArrayList<GENERO_USUARIO> mi_lista_genero_usuario = mi_genero_usuario_dao.ConsultarListarGenero_usuario(1, "");

        for (GENERO_USUARIO C : mi_lista_genero_usuario) {

            System.out.println("Número de id - " + C.getId_genero_usuario() + "\n" + "Descripción genero usuario - " + C.getDescripcion_genero_usuario());
        }
        System.out.println("El registro se elimino satisfactoriamnete");
        mi_genero_usuario_dao.EliminarGenero_usuario(mi_lista_genero_usuario.get(0));
        mi_lista_genero_usuario = mi_genero_usuario_dao.ConsultarListarGenero_usuario(1, "");

        for (GENERO_USUARIO C : mi_lista_genero_usuario) {

            System.out.println("Número de id - " + C.getId_genero_usuario() + "\n" + "Descripción genero usuario - " + C.getDescripcion_genero_usuario());

        }

    }

}
