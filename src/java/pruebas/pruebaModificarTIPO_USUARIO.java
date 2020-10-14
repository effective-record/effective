package pruebas;

import controlador.TIPO_USUARIO_DAO;
import java.util.Scanner;
import modelo.TIPO_USUARIO;

public class pruebaModificarTIPO_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TIPO_USUARIO_DAO mi_tipo_usuario_dao = new TIPO_USUARIO_DAO();
        TIPO_USUARIO mi_tipo_usuario = new TIPO_USUARIO();

        Scanner teclado = new Scanner(System.in);

        String generousuario = "";

        System.out.println("Por favor ingrese el nuevo tipo de usuario");
        generousuario = teclado.nextLine();

        mi_tipo_usuario.setDescripcion_tipo_usuario(generousuario);

        mi_tipo_usuario.setId_tipo_usuario(3);
        String miRespuesta = mi_tipo_usuario_dao.ModificarTipo_usuario(mi_tipo_usuario);//Ingreso el estado del cual quiero cambiar los datos

        if (miRespuesta.length() == 0) {

            System.out.println("Modificación exitoso");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }

    }

}
