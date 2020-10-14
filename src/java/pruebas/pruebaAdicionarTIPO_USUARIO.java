package pruebas;

import controlador.TIPO_USUARIO_DAO;
import java.util.Scanner;
import modelo.TIPO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaAdicionarTIPO_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TIPO_USUARIO_DAO mi_tipo_usuario_dao = new TIPO_USUARIO_DAO();
        TIPO_USUARIO mi_tipo_usuario = new TIPO_USUARIO();
        
        Scanner teclado = new Scanner(System.in);
        
        String tipousuario = "";
        
        System.out.println("Ingrese el tipo de usuario");
        tipousuario = teclado.nextLine();
        
        mi_tipo_usuario.setDescripcion_tipo_usuario(tipousuario);
        String miRespuesta = mi_tipo_usuario_dao.AdicionarTipo_usuario(mi_tipo_usuario);
        
        if (miRespuesta.length() == 0) {
            
            System.out.println("Registro exitoso");
            
        } else {
            
            System.out.println("Ocurrio un error" + miRespuesta);
            
        }
        
    }
    
}
