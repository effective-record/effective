package pruebas;


import controlador.ESTADO_USUARIO_DAO;
import java.util.Scanner;
import modelo.ESTADO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaModificarESTADO_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ESTADO_USUARIO_DAO mi_estado_usuario_dao = new ESTADO_USUARIO_DAO();
        ESTADO_USUARIO mi_estado_usuario = new ESTADO_USUARIO();

        Scanner teclado = new Scanner(System.in);

        String estadousuario = "";

        System.out.println("Por favor ingrese el nuevo estado");
        estadousuario = teclado.nextLine();

        mi_estado_usuario.setDescripcion_estado_usuario(estadousuario);

        mi_estado_usuario.setId_estado_usuario(2);
        String miRespuesta = mi_estado_usuario_dao.ModificarEstado_usuario(mi_estado_usuario);//Ingreso el estado del cual quiero cambiar los datos

        if (miRespuesta.length() == 0) {

            System.out.println("Modificación exitoso");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }

    }

}
