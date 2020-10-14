
package pruebas;


import controlador.TIPO_DOC_IDENTIFICACION_USUARIO_DAO;
import java.util.Scanner;
import modelo.TIPO_DOC_IDENTIFICACION_USUARIO;


/**
 *
 * @author AndresSaenz
 */
public class pruebaModificarTIPO_DOC_IDENTIFICACION_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TIPO_DOC_IDENTIFICACION_USUARIO_DAO mi_tipo_de_documento_dao = new TIPO_DOC_IDENTIFICACION_USUARIO_DAO();
        TIPO_DOC_IDENTIFICACION_USUARIO mi_tipo_de_documento = new TIPO_DOC_IDENTIFICACION_USUARIO();

        Scanner teclado = new Scanner(System.in);

        String tipodedocumentousuario = "";

        System.out.println("Por favor ingrese el nuevo tipo de documento del ususario");
        tipodedocumentousuario = teclado.nextLine();

        mi_tipo_de_documento.setTipo_doc_identificacion_usuario(tipodedocumentousuario);

        mi_tipo_de_documento.setId_doc_identificacion_usuario(1);
        String miRespuesta = mi_tipo_de_documento_dao.ModificarTipo_de_documento_de_identificacion(mi_tipo_de_documento);

        if (miRespuesta.length() == 0) {

            System.out.println("Modificación exitoso");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }
        
        
      
    }
    
}
