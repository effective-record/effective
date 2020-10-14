
package pruebas;

import controlador.TIPO_DOC_IDENTIFICACION_USUARIO_DAO;
import java.util.Scanner;
import modelo.TIPO_DOC_IDENTIFICACION_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaAdicionarTIPO_DOC_IDENTIFICACION_USUARIO {

    
    public static void main(String[] args) {
        
        TIPO_DOC_IDENTIFICACION_USUARIO_DAO mi_tipo_de_identificacion_usuario_dao = new TIPO_DOC_IDENTIFICACION_USUARIO_DAO();
        TIPO_DOC_IDENTIFICACION_USUARIO mi_tipo_de_identificacion_usuario = new TIPO_DOC_IDENTIFICACION_USUARIO();  
        
        Scanner teclado = new Scanner(System.in);
        
        String tipousuario = "";
        
        System.out.println("Por favor ingrese el tipo de documento del usuario");
        tipousuario = teclado.nextLine();
        
        
        
        mi_tipo_de_identificacion_usuario.setTipo_doc_identificacion_usuario(tipousuario);
        String miRespuesta = mi_tipo_de_identificacion_usuario_dao.AdicionarTipo_doc_usuario(mi_tipo_de_identificacion_usuario);
    
        
        if (miRespuesta.length() == 0) {

            System.out.println("Registro exitoso");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }
        
    }
    
}
