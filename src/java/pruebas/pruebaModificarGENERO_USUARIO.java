
package pruebas;

import controlador.GENERO_USUARIO_DAO;
import java.util.Scanner;
import modelo.GENERO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaModificarGENERO_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GENERO_USUARIO_DAO mi_genero_usuario_dao = new GENERO_USUARIO_DAO();
        GENERO_USUARIO mi_genero_usuario = new GENERO_USUARIO();

        Scanner teclado = new Scanner(System.in);

        String generousuario = "";

        System.out.println("Por favor ingrese el nuevo genero");
        generousuario = teclado.nextLine();

        mi_genero_usuario.setDescripcion_genero_usuario(generousuario);

        mi_genero_usuario.setId_genero_usuario(1);
        String miRespuesta = mi_genero_usuario_dao.ModificarGenero_usuario(mi_genero_usuario);

        if (miRespuesta.length() == 0) {

            System.out.println("Modificación exitoso");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }
        
        
        
    }
    
}
