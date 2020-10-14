
package pruebas;

import controlador.TIPO_DOC_IDENTIFICACION_USUARIO_DAO;
import modelo.TIPO_DOC_IDENTIFICACION_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarTIPO_DOC_IDENTIFICACION_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TIPO_DOC_IDENTIFICACION_USUARIO_DAO  mi_tipo_doc_usuario_dao = new TIPO_DOC_IDENTIFICACION_USUARIO_DAO ();
        TIPO_DOC_IDENTIFICACION_USUARIO mi_tipo_doc_usuario = mi_tipo_doc_usuario_dao.ConsultarTipo_doc_usuario(1);
        
        if (mi_tipo_doc_usuario != null) {

            System.out.println("Se realizo la consulta satisfactoriamente del tipo de documento del usuario - " + mi_tipo_doc_usuario.getId_doc_identificacion_usuario());
            System.out.println("Descripción del tipo de documento del usuario - " + mi_tipo_doc_usuario.getTipo_doc_identificacion_usuario());

        } else {

            System.out.println("Ha ocurrido un error durante la consulta");

        }
        
        
   
    }
    
}
