
package pruebas;

import controlador.ESTADO_USUARIO_DAO;
import java.util.ArrayList;
import modelo.ESTADO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarESTADO_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ESTADO_USUARIO_DAO mi_estado_usuario_dao = new ESTADO_USUARIO_DAO();
        ArrayList<ESTADO_USUARIO> mi_lista_estado_usuario = mi_estado_usuario_dao.ConsultarListarEstado_usuario(1, "");

        for (ESTADO_USUARIO C : mi_lista_estado_usuario) {

            System.out.println("Número de id - " + C.getId_estado_usuario() + "\n" + "Descripción estado usuario - " + C.getDescripcion_estado_usuario());
        }
        System.out.println("El registro se elimino satisfactoriamnete");
        mi_estado_usuario_dao.EliminarEstado_usuario(mi_lista_estado_usuario.get(0));
        mi_lista_estado_usuario = mi_estado_usuario_dao.ConsultarListarEstado_usuario(1, "");

        for (ESTADO_USUARIO C : mi_lista_estado_usuario) {

            System.out.println("Número de id - " + C.getId_estado_usuario() + "\n" + "Descripción estado usuario - " + C.getDescripcion_estado_usuario());

        }

    }

}

        
        
     
        
    
    

