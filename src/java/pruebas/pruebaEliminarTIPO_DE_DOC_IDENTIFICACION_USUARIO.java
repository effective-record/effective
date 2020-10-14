
package pruebas;

import controlador.TIPO_DOC_IDENTIFICACION_USUARIO_DAO;
import java.util.ArrayList;
import modelo.TIPO_DOC_IDENTIFICACION_USUARIO;



/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarTIPO_DE_DOC_IDENTIFICACION_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TIPO_DOC_IDENTIFICACION_USUARIO_DAO mi_doc_usuario_dao = new TIPO_DOC_IDENTIFICACION_USUARIO_DAO();
        ArrayList<TIPO_DOC_IDENTIFICACION_USUARIO> mi_lista_doc_usuario = mi_doc_usuario_dao.ConsultarListadoTipo_doc_usuario(3, "");

        for (TIPO_DOC_IDENTIFICACION_USUARIO C : mi_lista_doc_usuario) {

            System.out.println("Número de id - " + C.getId_doc_identificacion_usuario() + "\n" + "Descripción tipo usuario - " + C.getTipo_doc_identificacion_usuario());
        }
        System.out.println("El registro se elimino satisfactoriamnete");
        mi_doc_usuario_dao.EliminarTipo_doc_usuario(mi_lista_doc_usuario.get(0));
        mi_lista_doc_usuario = mi_doc_usuario_dao.ConsultarListadoTipo_doc_usuario(1, "");

        for (TIPO_DOC_IDENTIFICACION_USUARIO C : mi_lista_doc_usuario) {

            System.out.println("Número de id - " + C.getId_doc_identificacion_usuario() + "\n" + "Descripción tipo usuario - " + C.getTipo_doc_identificacion_usuario());

        }

        
       
    }
    
}
