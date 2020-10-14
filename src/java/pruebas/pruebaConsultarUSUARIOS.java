package pruebas;


import controlador.USUARIOS_DAO;
import modelo.USUARIOS;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarUSUARIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        USUARIOS_DAO usuarioDao = new USUARIOS_DAO();
        USUARIOS mi_usuario = usuarioDao.ConsultarUsuarios("1000254779");

        if (mi_usuario != null) {

            System.out.println("Se realizo la consulta satisfactoriamente del numero de identificación - " + mi_usuario.getIdentificacion_usuario());
            System.out.println("Id el usuario - " + mi_usuario.getId_usuario());
            System.out.println("Nombre - " + mi_usuario.getNombres_usuario());
            System.out.println("Apellidos - " + mi_usuario.getApellidos_usuario());
            System.out.println("Clave - " + mi_usuario.getClave());
            System.out.println("Teléfono - " + mi_usuario.getTelefono_usuario());
            System.out.println("Dirección - " + mi_usuario.getDireccion_usuario());
            System.out.println("Correo - " + mi_usuario.getCorreo_usuario());
            System.out.println("Tipo de usuario - " + mi_usuario.getTIPO_USUARIO_id_tipo_usuario());
            System.out.println("Estado usuario - " + mi_usuario.getESTADO_USUARIO_id_estado_usuario());
            System.out.println("Genero del usuario - " + mi_usuario.getGENERO_USUARIO_id_genero_usuario());
            System.out.println("Tipo de documento del usuario - " + mi_usuario.getTIPO_DOC_IDENTIFICACION_USUARIO_id_doc_identificacion_usuario());
            

        } else {

            System.out.println("Ha ocurrido un error durante la consulta");

        }

    }

}
