package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.USUARIOS;

/**
 *
 * @author AndresSaenz
 */
public class USUARIOS_DAO {

    public String AdicionarUsuarios(USUARIOS Usuarios) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "Insert into USUARIOS (nombres_usuario, apellidos_usuario, identificacion_usuario, clave, telefono_usuario, direccion_usuario, correo_usuario, TIPO_USUARIO_id_tipo_usuario, ESTADO_USUARIO_id_estado_usuario, GENERO_USUARIO_id_genero_usuario, TIPO_DOC_IDENTIFICACION_USUARIO_id_doc_identificacion_usuario)" + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setString(1, Usuarios.getNombres_usuario());
            sentencia.setString(2, Usuarios.getApellidos_usuario());
            sentencia.setString(3, Usuarios.getIdentificacion_usuario());
            sentencia.setString(4, Usuarios.getClave());
            sentencia.setString(5, Usuarios.getTelefono_usuario());
            sentencia.setString(6, Usuarios.getDireccion_usuario());
            sentencia.setString(7, Usuarios.getCorreo_usuario());
            sentencia.setInt(8, Usuarios.getTIPO_USUARIO_id_tipo_usuario());
            sentencia.setInt(9, Usuarios.getESTADO_USUARIO_id_estado_usuario());
            sentencia.setInt(10, Usuarios.getGENERO_USUARIO_id_genero_usuario());
            sentencia.setInt(11, Usuarios.getTIPO_DOC_IDENTIFICACION_USUARIO_id_doc_identificacion_usuario());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en AdicionarTipo_usuario_USUARIO_DAO\n" + miRespuesta);

        }

        return miRespuesta;

    }

    public String ModificarUsuarios(USUARIOS Usuarios) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "update USUARIOS set nombres_usuario=?, apellidos_usuario=?, identificacion_usuario=?, clave=?,telefono_usuario=?, direccion_usuario=?, correo_usuario=?, TIPO_USUARIO_id_tipo_usuario=?, ESTADO_USUARIO_id_estado_usuario=?, GENERO_USUARIO_id_genero_usuario=?, TIPO_DOC_IDENTIFICACION_USUARIO_id_doc_identificacion_usuario=? where identificacion_usuario=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Usuarios.getNombres_usuario());
            sentencia.setString(2, Usuarios.getApellidos_usuario());
            sentencia.setString(3, Usuarios.getIdentificacion_usuario());
            sentencia.setString(4, Usuarios.getClave());
            sentencia.setString(5, Usuarios.getTelefono_usuario());
            sentencia.setString(6, Usuarios.getDireccion_usuario());
            sentencia.setString(7, Usuarios.getCorreo_usuario());
            sentencia.setInt(8, Usuarios.getTIPO_USUARIO_id_tipo_usuario());
            sentencia.setInt(9, Usuarios.getESTADO_USUARIO_id_estado_usuario());
            sentencia.setInt(10, Usuarios.getGENERO_USUARIO_id_genero_usuario());
            sentencia.setInt(11, Usuarios.getTIPO_DOC_IDENTIFICACION_USUARIO_id_doc_identificacion_usuario());
            sentencia.setString(12, Usuarios.getIdentificacion_usuario());

            sentencia.executeUpdate();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en ModificarUsuarios_USUARIO_DAO_MODIFICAR\n" + miRespuesta);

        }

        return miRespuesta;

    }

    public USUARIOS ConsultarUsuarios(String identificacion_usuario) {

        USUARIOS miusuario = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_usuario,nombres_usuario,apellidos_usuario,identificacion_usuario,clave,telefono_usuario,direccion_usuario,correo_usuario,TIPO_USUARIO_id_tipo_usuario,ESTADO_USUARIO_id_estado_usuario,GENERO_USUARIO_id_genero_usuario,TIPO_DOC_IDENTIFICACION_USUARIO_id_doc_identificacion_usuario from USUARIOS where identificacion_usuario = " + identificacion_usuario;
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                miusuario = new USUARIOS();
                miusuario.setId_usuario(rs.getInt(1));
                miusuario.setNombres_usuario(rs.getString(2));
                miusuario.setApellidos_usuario(rs.getString(3));
                miusuario.setIdentificacion_usuario(rs.getString(4));
                miusuario.setClave(rs.getString(5));
                miusuario.setTelefono_usuario(rs.getString(6));
                miusuario.setDireccion_usuario(rs.getString(7));
                miusuario.setCorreo_usuario(rs.getString(8));
                miusuario.setTIPO_USUARIO_id_tipo_usuario(rs.getInt(9));
                miusuario.setESTADO_USUARIO_id_estado_usuario(rs.getInt(10));
                miusuario.setGENERO_USUARIO_id_genero_usuario(rs.getInt(11));
                miusuario.setTIPO_DOC_IDENTIFICACION_USUARIO_id_doc_identificacion_usuario(rs.getInt(12));

            }
            return miusuario;

        } catch (Exception ex) {

            System.out.println("ocurrio un problema en ConsultarUsuarios_USUARIOS_DAO_CONSULTAR\n" + ex.getMessage());
            return miusuario;

        }

    }

    public ArrayList<USUARIOS> ConsultarListadoUsuario(String identificacion_usuario, String nombres_usuario, String apellidos_usuario) {

        ArrayList<USUARIOS> mi_lista_usuarios = new ArrayList<USUARIOS>();
        USUARIOS mi_usuario;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro" + identificacion_usuario);

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_usuario,nombres_usuario,apellidos_usuario,identificacion_usuario,clave, "
                    + " telefono_usuario,direccion_usuario,correo_usuario,TIPO_USUARIO_id_tipo_usuario,ESTADO_USUARIO_id_estado_usuario, "
                    + " GENERO_USUARIO_id_genero_usuario,TIPO_DOC_IDENTIFICACION_USUARIO_id_doc_identificacion_usuario"
                    + " from USUARIOS"
                    + " where identificacion_usuario like '%" + identificacion_usuario + "%'"
                    + "  or (nombres_usuario) like ('%" + nombres_usuario + "%')"
                    + "  or (apellidos_usuario) like ('%" + apellidos_usuario + "%') ORDER BY identificacion_usuario;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                mi_usuario = new USUARIOS();
                mi_usuario.setId_usuario(rs.getInt(1));
                mi_usuario.setNombres_usuario(rs.getString(2));
                mi_usuario.setApellidos_usuario(rs.getString(3));
                mi_usuario.setIdentificacion_usuario(rs.getString(4));
                mi_usuario.setClave(rs.getString(5));
                mi_usuario.setTelefono_usuario(rs.getString(6));
                mi_usuario.setDireccion_usuario(rs.getString(7));
                mi_usuario.setCorreo_usuario(rs.getString(8));
                mi_usuario.setTIPO_USUARIO_id_tipo_usuario(9);
                mi_usuario.setESTADO_USUARIO_id_estado_usuario(rs.getInt(10));
                mi_usuario.setGENERO_USUARIO_id_genero_usuario(rs.getInt(11));
                mi_usuario.setTIPO_DOC_IDENTIFICACION_USUARIO_id_doc_identificacion_usuario(rs.getInt(12));
                mi_lista_usuarios.add(mi_usuario);

            }

            return mi_lista_usuarios;

        } catch (Exception ex) {

            System.out.println("Error en la consulta de listado en el usuario" + "\n" + ex.getMessage());
            return mi_lista_usuarios;

        }

    }

    public String EliminarUsuarios(USUARIOS usuarios) {

        String miRespuesta;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "delete from USUARIOS where identificacion_usuario = ? and id_usuario = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, usuarios.getIdentificacion_usuario());
            sentencia.setInt(2, usuarios.getId_usuario());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en USUARIOS_DAO.EliminarUsuario" + ex.getMessage());
        }
        return miRespuesta;

    }

}
