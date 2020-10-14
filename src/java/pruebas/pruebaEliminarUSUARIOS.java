package pruebas;

import controlador.USUARIOS_DAO;
import java.util.ArrayList;
import modelo.USUARIOS;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarUSUARIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        USUARIOS_DAO mi_usuario_dao = new USUARIOS_DAO();
        ArrayList<USUARIOS> mi_lista_usuarios = mi_usuario_dao.ConsultarListadoUsuario("1000254778", "Eduar Felipe", "Lopez Sanchez");

        for (USUARIOS C : mi_lista_usuarios) {

            System.out.println(C.getNombres_usuario() + "\n" + "Apellidos usuario - " + "Número de id - " + C.getId_usuario() + "\n" + "Nombre de usuario - " + C.getApellidos_usuario()+ "\n" + "Identificacion usuario - " + C.getIdentificacion_usuario()+ "\n" + "Clave - " + C.getClave()+ "\n" + "Telefono - " + C.getTelefono_usuario()+ "\n" + "Direccion usuario - " + C.getDireccion_usuario()+ "\n" + "Correo usuario - " + C.getCorreo_usuario()+ "\n" + "Id tipo usuario - " + C.getTIPO_USUARIO_id_tipo_usuario()+ " \n" + "Id estado usuario usuario - " + C.getESTADO_USUARIO_id_estado_usuario()+ "\n" + "Id genero usuario  - " + C.getGENERO_USUARIO_id_genero_usuario()+ "\n" +  "Id tipo de documento identificacion usuario - " + C.getIdentificacion_usuario()+ "\n");

        }

        System.out.println("El registro se elimino satisfactoriamnete");
        mi_usuario_dao.EliminarUsuarios(mi_lista_usuarios.get(0));
        mi_lista_usuarios = mi_usuario_dao.ConsultarListadoUsuario("1000254778", "Eduar Felipe", "Lopez Sanchez");

        for (USUARIOS C : mi_lista_usuarios) {

            System.out.println(C.getNombres_usuario() + "\n" + "Apellidos usuario - " + "Número de id - " + C.getId_usuario() + "\n" + "Nombre de usuario - " + C.getApellidos_usuario()+ "\n" + "Identificacion usuario - " + C.getIdentificacion_usuario()+ "\n" + "Clave - " + C.getClave()+ "\n" + "Telefono - " + C.getTelefono_usuario()+ "\n" + "Direccion usuario - " + C.getDireccion_usuario()+ "\n" + "Correo usuario - " + C.getCorreo_usuario()+ "\n" + "Id tipo usuario - " + C.getTIPO_USUARIO_id_tipo_usuario()+ " \n" + "Id estado usuario usuario - " + C.getESTADO_USUARIO_id_estado_usuario()+ "\n" + "Id genero usuario  - " + C.getGENERO_USUARIO_id_genero_usuario()+ "\n" +  "Id tipo de documento identificacion usuario - " + C.getIdentificacion_usuario()+ "\n");

        }
    }

}
