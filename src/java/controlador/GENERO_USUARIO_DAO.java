package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.GENERO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class GENERO_USUARIO_DAO {

    public String AdicionarGenero_usuario(GENERO_USUARIO Genero_usuario) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "Insert GENERO_USUARIO (descripcion_genero_usuario)" + "values (?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Genero_usuario.getDescripcion_genero_usuario());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en AdicionarGenero_usuario_GENERO_USUARIO_DAO\n" + miRespuesta);

        }

        return miRespuesta;

    }

    public String ModificarGenero_usuario(GENERO_USUARIO Genero_usuario) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "update GENERO_USUARIO set descripcion_genero_usuario=? where id_genero_usuario=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Genero_usuario.getDescripcion_genero_usuario());
            sentencia.setInt(2, Genero_usuario.getId_genero_usuario());
            sentencia.executeUpdate();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en ModificarGenero_usuario_GENERO_USUARIO_DAO_MODIFICAR\n" + miRespuesta);

        }

        return miRespuesta;

    }

    public GENERO_USUARIO ConsultarGenero_usuario(int id_genero_usuario) {

        GENERO_USUARIO migenero_usuario = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_genero_usuario, descripcion_genero_usuario from GENERO_USUARIO where id_genero_usuario =" + id_genero_usuario;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                migenero_usuario = new GENERO_USUARIO();
                migenero_usuario.setId_genero_usuario(rs.getInt(id_genero_usuario));
                migenero_usuario.setDescripcion_genero_usuario(rs.getString(2));

            }

            return migenero_usuario;

        } catch (Exception ex) {

            System.out.println("ocurrio un problema en ConsultarGenero_usuarios_GENERO_USUARIO_DAO_CONSULTAR\n" + ex.getMessage());
            return migenero_usuario;

        }

    }

    public ArrayList<GENERO_USUARIO> ConsultarListarGenero_usuario(int id_genero_usuario, String descripcion_genero_usuario) {

        ArrayList<GENERO_USUARIO> mi_lista_genero_usuario = new ArrayList<GENERO_USUARIO>();
        GENERO_USUARIO mi_genero_usurio;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro" + descripcion_genero_usuario);

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_genero_usuario,descripcion_genero_usuario"
                    + " from GENERO_USUARIO"
                    + " where id_genero_usuario like '%" + id_genero_usuario + "%'"
                    + "  or (descripcion_genero_usuario) like ('%" + descripcion_genero_usuario + "%')"
                    + "  or (descripcion_genero_usuario) like ('%" + descripcion_genero_usuario + "%') ORDER BY id_genero_usuario;";

            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                mi_genero_usurio = new GENERO_USUARIO();
                mi_genero_usurio.setId_genero_usuario(rs.getInt(1));
                mi_genero_usurio.setDescripcion_genero_usuario(rs.getString(2));
                mi_lista_genero_usuario.add(mi_genero_usurio);

            }
            return mi_lista_genero_usuario;

        } catch (Exception ex) {

            System.out.println("Error en la consulta de listado del genero usuario" + "\n" + ex.getMessage());
            return mi_lista_genero_usuario;

        }

    }
    
    public String EliminarGenero_usuario(GENERO_USUARIO Genero_usuario) {

        String miRespuesta;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "delete from GENERO_USUARIO where descripcion_genero_usuario = ? and id_genero_usuario = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Genero_usuario.getDescripcion_genero_usuario());
            sentencia.setInt(2, Genero_usuario.getId_genero_usuario());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en GENERO_USUARIO_DAO.EliminarGenero_usuario" + ex.getMessage());
        }
        return miRespuesta;

    }
}
