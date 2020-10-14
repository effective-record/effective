package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.ESTADO_PRODUCTO;


public class ESTADO_PRODUCTO_DAO {

    public String AdicionarEstadoProducto(ESTADO_PRODUCTO EstadoProduto) {
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        PreparedStatement sentencia;

        try {
            String Query = "insert ESTADO_PRODUCTO (descripcion_estado_producto)" + "values (?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, EstadoProduto.getDescripcion_estado_producto());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("ocurrio un error en AdicionarEstadoProducto_ESTADO_PRODUCTO_DAO\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    public String ActualizarEstadoProducto(ESTADO_PRODUCTO EstadoProducto) {

        String miRespuesta = "";
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "update ESTADO_PRODUCTO set descripcion_estado_producto=? where id_estado_producto=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, EstadoProducto.getDescripcion_estado_producto());
            sentencia.setInt(2, EstadoProducto.getId_estado_producto());
            sentencia.executeUpdate();
        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("ocurrio un problema en la ActualizarEstadoProducto_ESTADO_PRODUCTO_DAO\n" + ex.getMessage());
        }
        return miRespuesta;

    }

    public ESTADO_PRODUCTO ConsultarEstadoProducto(int id_estado_producto) {

        ESTADO_PRODUCTO miestadoproducto = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_estado_producto, descripcion_estado_producto from ESTADO_PRODUCTO where id_estado_producto = " + id_estado_producto;
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                miestadoproducto = new ESTADO_PRODUCTO();
                miestadoproducto.setId_estado_producto(rs.getInt(1));
                miestadoproducto.setDescripcion_estado_producto(rs.getString(2));

            }
            return miestadoproducto;

        } catch (Exception ex) {

            System.out.println("ocurrio un problema en ConsultarEstadoProducto_ESTADO_PRODUCTO_DAO_CONSULTAR\n" + ex.getMessage());
            return miestadoproducto;

        }

    }
    
    public ArrayList<ESTADO_PRODUCTO> ConsultarListadoEstadoProducto(int id_estado_producto,String descripcion_estado_producto) {

        ArrayList<ESTADO_PRODUCTO> mi_lista_estado_producto = new ArrayList<ESTADO_PRODUCTO>();
        ESTADO_PRODUCTO mi_estadoproducto;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro" + descripcion_estado_producto);

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_estado_producto, descripcion_estado_producto "
                    + " from ESTADO_PRODUCTO"
                    + " where id_estado_producto like '%" + id_estado_producto + "%'"
                    + "  or (descripcion_estado_producto) like ('%" + descripcion_estado_producto + "%')"
                    + "  or (descripcion_estado_producto) like ('%" + descripcion_estado_producto + "%') ORDER BY id_estado_producto;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                mi_estadoproducto = new ESTADO_PRODUCTO();
                mi_estadoproducto.setId_estado_producto(rs.getInt(1));
                mi_estadoproducto.setDescripcion_estado_producto(rs.getString(2));
                mi_lista_estado_producto.add(mi_estadoproducto);

            }

            return mi_lista_estado_producto;

        } catch (Exception ex) {

            System.out.println("Error en la consulta de listado en el estado producto" + "\n" + ex.getMessage());
            return mi_lista_estado_producto;

        }

    }
    
    public String EliminarEstado_producto(ESTADO_PRODUCTO Estado_producto) {

        String miRespuesta;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "delete from ESTADO_PRODUCTO where descripcion_estado_producto = ? and id_estado_producto = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Estado_producto.getDescripcion_estado_producto());
            sentencia.setInt(2, Estado_producto.getId_estado_producto());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en ESTADO_PRODUCTO_DAO.EliminarEstado_producto" + ex.getMessage());
        }
        return miRespuesta;

    }
    
  
}


   

