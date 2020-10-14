package pruebas;

import controlador.GENERO_USUARIO_DAO;
import java.util.Scanner;
import modelo.GENERO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaAdicionarGENERO_USUARIO {

    public static void main(String[] args) {

        GENERO_USUARIO_DAO mi_genero_usuario_dao = new GENERO_USUARIO_DAO();
        GENERO_USUARIO mi_genero_usuario = new GENERO_USUARIO();

        Scanner teclado = new Scanner(System.in);

        String generousuario = "";

        System.out.println("Por favor ingrese el genero del usuario");
        generousuario = teclado.next();

        mi_genero_usuario.setDescripcion_genero_usuario(generousuario);
        String miRespuesta = mi_genero_usuario_dao.AdicionarGenero_usuario(mi_genero_usuario);

        if (miRespuesta.length() == 0) {

            System.out.println("Registro exitoso");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }

    }

}
