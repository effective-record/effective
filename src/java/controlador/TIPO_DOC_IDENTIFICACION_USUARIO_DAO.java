package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.TIPO_DOC_IDENTIFICACION_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class TIPO_DOC_IDENTIFICACION_USUARIO_DAO {

    public String AdicionarTipo_doc_usuario(TIPO_DOC_IDENTIFICACION_USUARIO Tipo_doc_usuario) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "Insert TIPO_DOC_IDENTIFICACION_USUARIO (tipo_doc_identificacion_usuario)" + "values (?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Tipo_doc_usuario.getTipo_doc_identificacion_usuario());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en AdicionarTipo_doc_usuario_TIPO_DOC_IDENTIFICACION_USUARIO_DAO\n" + miRespuesta);

        }

        return miRespuesta;

    }

    public String ModificarTipo_de_documento_de_identificacion(TIPO_DOC_IDENTIFICACION_USUARIO Tipo_de_documento_de_identificacion) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "update TIPO_DOC_IDENTIFICACION_USUARIO set tipo_doc_identificacion_usuario=? where id_doc_identificacion_usuario=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Tipo_de_documento_de_identificacion.getTipo_doc_identificacion_usuario());
            sentencia.setInt(2, Tipo_de_documento_de_identificacion.getId_doc_identificacion_usuario());
            sentencia.executeUpdate();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en ModificarTipo_de_documento_de_identificacion_IPO_DOC_IDENTIFICACION_USUARIO_DAO_MODIFICAR\n" + miRespuesta);

        }

        return miRespuesta;

    }

    public TIPO_DOC_IDENTIFICACION_USUARIO ConsultarTipo_doc_usuario(int id_doc_identificacion_usuario) {

        TIPO_DOC_IDENTIFICACION_USUARIO mi_doc_usuario = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_doc_identificacion_usuario, tipo_doc_identificacion_usuario from TIPO_DOC_IDENTIFICACION_USUARIO where id_doc_identificacion_usuario = " + id_doc_identificacion_usuario;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                mi_doc_usuario = new TIPO_DOC_IDENTIFICACION_USUARIO();
                mi_doc_usuario.setId_doc_identificacion_usuario(rs.getInt(1));
                mi_doc_usuario.setTipo_doc_identificacion_usuario(rs.getString(2));

            }

            return mi_doc_usuario;

        } catch (Exception ex) {

            System.out.println("ocurrio un problema en ConsultarConsultarTipo_doc_usuario_IPO_DOC_IDENTIFICACION_USUARIO_DAO_CONSULTAR\n" + ex.getMessage());
            return mi_doc_usuario;

        }

    }

    public ArrayList<TIPO_DOC_IDENTIFICACION_USUARIO> ConsultarListadoTipo_doc_usuario(int id_doc_identificacion_usuario, String tipo_doc_identificacion_usuario) {

        ArrayList<TIPO_DOC_IDENTIFICACION_USUARIO> mi_lista_doc_usuarios = new ArrayList<TIPO_DOC_IDENTIFICACION_USUARIO>();
        TIPO_DOC_IDENTIFICACION_USUARIO mi_doc_usuario;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro" + tipo_doc_identificacion_usuario);

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_doc_identificacion_usuario,tipo_doc_identificacion_usuario"
                    + " from TIPO_DOC_IDENTIFICACION_USUARIO"
                    + " where id_doc_identificacion_usuario like '%" + id_doc_identificacion_usuario + "%'"
                    + "  or (tipo_doc_identificacion_usuario) like ('%" + tipo_doc_identificacion_usuario + "%')"
                    + "  or (tipo_doc_identificacion_usuario) like ('%" + tipo_doc_identificacion_usuario + "%') ORDER BY id_doc_identificacion_usuario;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                mi_doc_usuario = new TIPO_DOC_IDENTIFICACION_USUARIO();
                mi_doc_usuario.setId_doc_identificacion_usuario(rs.getInt(1));
                mi_doc_usuario.setTipo_doc_identificacion_usuario(rs.getString(2));
                mi_lista_doc_usuarios.add(mi_doc_usuario);

            }

            return mi_lista_doc_usuarios;

        } catch (Exception ex) {

            System.out.println("Error en la consulta de listado en el tipo de documento del usuario" + "\n" + ex.getMessage());
            return mi_lista_doc_usuarios;

        }

    }
    
    public String EliminarTipo_doc_usuario(TIPO_DOC_IDENTIFICACION_USUARIO Tipo_doc_usuario) {

        String miRespuesta;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "delete from TIPO_DOC_IDENTIFICACION_USUARIO where tipo_doc_identificacion_usuario = ? and id_doc_identificacion_usuario = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Tipo_doc_usuario.getTipo_doc_identificacion_usuario());
            sentencia.setInt(2, Tipo_doc_usuario.getId_doc_identificacion_usuario());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en TIPO_DOC_IDENTIFICACION_USUARIODAO.EliminarTipo_doc_usuario" + ex.getMessage());
        }
        return miRespuesta;

    }
}
