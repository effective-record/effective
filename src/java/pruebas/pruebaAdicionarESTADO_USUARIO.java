
package pruebas;

import controlador.ESTADO_USUARIO_DAO;
import java.util.Scanner;
import modelo.ESTADO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaAdicionarESTADO_USUARIO {

    public static void main(String[] args) {

        ESTADO_USUARIO_DAO mi_estado_usuario_dao = new ESTADO_USUARIO_DAO();
        ESTADO_USUARIO mi_estado_usuario = new ESTADO_USUARIO();

        Scanner teclado = new Scanner(System.in);

        String estadousuario = "";

        System.out.println("Por favor ingrese el estado del usuario Activo o  Inactivo");
        estadousuario = teclado.next();

        mi_estado_usuario.setDescripcion_estado_usuario(estadousuario);
        String miRespuesta = mi_estado_usuario_dao.ActualizarEstado_usuario(mi_estado_usuario);

        if (miRespuesta.length() == 0) {

            System.out.println("Registro exitoso");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }

    }

}
