
package pruebas;

import controlador.USUARIOS_DAO;
import java.util.Scanner;
import modelo.USUARIOS;

/**
 *
 * @author AndresSaenz
 */
public class pruebaModificarUSUARIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        USUARIOS_DAO mi_usuario_dao = new USUARIOS_DAO();
        USUARIOS mi_usuario = new USUARIOS();

        Scanner teclado = new Scanner(System.in);

        String nombresusuario = "";
        String apellidosusuario = "";
        String identificacionusuario;
        String claveusuario = "";
        String telefonousuario;
        String direccionusuario = "";
        String correousuario = "";

        System.out.println("Ingrese el número de identificación del usuario para modificar los datos");
        identificacionusuario = teclado.nextLine();

        System.out.println("Ingrese los nombres del usuario");
        nombresusuario = teclado.nextLine();

        System.out.println("Ingrese los apellidos del usuario");
        apellidosusuario = teclado.nextLine();

        System.out.println("Ingrese la nueva clave del usuario");
        claveusuario = teclado.nextLine();

        System.out.println("Ingrese la dirección del usuario");
        direccionusuario = teclado.nextLine();

        System.out.println("Ingrese el correo del usuario");
        correousuario = teclado.nextLine();
        
        System.out.println("Ingrese el teléfono del usuario");
        telefonousuario = teclado.next();

 

        mi_usuario.setIdentificacion_usuario(identificacionusuario);
        mi_usuario.setNombres_usuario(nombresusuario);
        mi_usuario.setApellidos_usuario(apellidosusuario);
        mi_usuario.setClave(claveusuario);
        mi_usuario.setTelefono_usuario(telefonousuario);
        mi_usuario.setDireccion_usuario(direccionusuario);
        mi_usuario.setCorreo_usuario(correousuario);

        mi_usuario.setIdentificacion_usuario(identificacionusuario); //Ingreso la identificación de la cual quiero cambiar los datos

        mi_usuario.setTIPO_USUARIO_id_tipo_usuario(2);
        mi_usuario.setESTADO_USUARIO_id_estado_usuario(2);
        mi_usuario.setGENERO_USUARIO_id_genero_usuario(2);
        mi_usuario.setTIPO_DOC_IDENTIFICACION_USUARIO_id_doc_identificacion_usuario(2);
        String miRespuesta = mi_usuario_dao.ModificarUsuarios(mi_usuario);

        if (miRespuesta.length() == 0) {

            System.out.println("Modificación exitosa");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }

    }

}
