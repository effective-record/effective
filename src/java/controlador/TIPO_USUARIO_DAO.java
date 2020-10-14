package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.TIPO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class TIPO_USUARIO_DAO {

    public String AdicionarTipo_usuario(TIPO_USUARIO Tipo_usuario) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "Insert into TIPO_USUARIO (descripcion_tipo_usuario)" + "values (?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Tipo_usuario.getDescripcion_tipo_usuario());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en AdicionarTipo_doc_usuario_TIPO_DOC_IDENTIFICACION_USUARIO_DAO\n" + miRespuesta);

        }

        return miRespuesta;

    }

    public String ModificarTipo_usuario(TIPO_USUARIO Tipo_usuario) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "update TIPO_USUARIO set descripcion_tipo_usuario=? where id_tipo_usuario=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Tipo_usuario.getDescripcion_tipo_usuario());
            sentencia.setInt(2, Tipo_usuario.getId_tipo_usuario());
            sentencia.executeUpdate();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en ModificarTipo_usuario_Tipo_USUARIO_DAO_MODIFICAR\n" + miRespuesta);

        }

        return miRespuesta;

    }

    public TIPO_USUARIO ConsultarTipo_usuario(int id_tipo_usuario) {

        TIPO_USUARIO mitipo_usuario = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_tipo_usuario, descripcion_tipo_usuario from TIPO_USUARIO where id_tipo_usuario = " + id_tipo_usuario;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mitipo_usuario = new TIPO_USUARIO();
                mitipo_usuario.setId_tipo_usuario(rs.getInt(1));
                mitipo_usuario.setDescripcion_tipo_usuario(rs.getString(2));
            }

            return mitipo_usuario;

        } catch (Exception ex) {

            System.out.println("ocurrio un problema en ConsultarTipo_usuarios_TIPO_USUARIOS_DAO_CONSULTAR\n" + ex.getMessage());
            return mitipo_usuario;

        }

    }

    public ArrayList<TIPO_USUARIO> ConsultarListarTipo_usuario(int id_tipo_usuario, String descripcion_tipo_usuario) {

        ArrayList<TIPO_USUARIO> mi_lista_tipo_usuario = new ArrayList<TIPO_USUARIO>();
        TIPO_USUARIO mi_tipo_usurio;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro" + descripcion_tipo_usuario);

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_tipo_usuario,descripcion_tipo_usuario"
                    + " from TIPO_USUARIO"
                    + " where id_tipo_usuario like '%" + id_tipo_usuario + "%'"
                    + "  or (descripcion_tipo_usuario) like ('%" + descripcion_tipo_usuario + "%')"
                    + "  or (descripcion_tipo_usuario) like ('%" + descripcion_tipo_usuario + "%') ORDER BY id_tipo_usuario;";

            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                mi_tipo_usurio = new TIPO_USUARIO();
                mi_tipo_usurio.setId_tipo_usuario(rs.getInt(1));
                mi_tipo_usurio.setDescripcion_tipo_usuario(rs.getString(2));
                mi_lista_tipo_usuario.add(mi_tipo_usurio);

            }
            return mi_lista_tipo_usuario;

        } catch (Exception ex) {

            System.out.println("Error en la consulta de listado tipo usuario" + "\n" + ex.getMessage());
            return mi_lista_tipo_usuario;

        }

    }

    public String EliminarTipo_usuario(TIPO_USUARIO Tipo_usuario) {

        String miRespuesta;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "delete from TIPO_USUARIO where descripcion_tipo_usuario = ? and id_tipo_usuario = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Tipo_usuario.getDescripcion_tipo_usuario());
            sentencia.setInt(2, Tipo_usuario.getId_tipo_usuario());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en TIPO_USUARIO_DAO.EliminarTipo_usuario" + ex.getMessage());
        }
        return miRespuesta;

    }
}
