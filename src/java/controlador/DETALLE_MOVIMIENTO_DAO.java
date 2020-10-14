package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.DETALLE_MOVIMIENTO;

public class DETALLE_MOVIMIENTO_DAO {

    public String AdicionarDetalle_movimiento(DETALLE_MOVIMIENTO Detalle_movimiento) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "Insert DETALLE_MOVIMIENTO (cantidad,precio_productos,iva_productos,Total_productos,PRODUCTOS_id_producto)" + "values (?,?,?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, Detalle_movimiento.getCantidad());
            sentencia.setDouble(2, Detalle_movimiento.getPrecio_productos());
            sentencia.setDouble(3, Detalle_movimiento.getIva_productos());
            sentencia.setDouble(4, Detalle_movimiento.getTotal_productos());
            sentencia.setInt(5, Detalle_movimiento.getPRODUCTOS_id_producto());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en AdicionarDetalle_Movimiento\n" + miRespuesta);

        }

        return miRespuesta;

    }

    public String ModificarDetalle_movimiento(DETALLE_MOVIMIENTO Detalle_movimiento) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "update DETALLE_MOVIMIENTO set cantidad=?,precio_productos=?,iva_productos=?,total_productos=?,PRODUCTOS_id_producto=? where id_detalle_movimiento=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, Detalle_movimiento.getCantidad());
            sentencia.setDouble(2, Detalle_movimiento.getPrecio_productos());
            sentencia.setDouble(3, Detalle_movimiento.getIva_productos());
            sentencia.setDouble(4, Detalle_movimiento.getTotal_productos());
            sentencia.setInt(5, Detalle_movimiento.getPRODUCTOS_id_producto());
            sentencia.setInt(6, Detalle_movimiento.getId_detalle_movimiento());
            sentencia.executeUpdate();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error \n" + miRespuesta);

        }

        return miRespuesta;

    }

    public DETALLE_MOVIMIENTO ConsultarDetalleMovimiento(int id_detalle_movimiento) {

        DETALLE_MOVIMIENTO miDetalleMoviemto = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_detalle_movimiento,cantidad,precio_productos,iva_productos,total_productos,PRODUCTOS_id_producto from  DETALLE_MOVIMIENTO where id_detalle_movimiento  = " + id_detalle_movimiento;
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                miDetalleMoviemto = new DETALLE_MOVIMIENTO();
                miDetalleMoviemto.setId_detalle_movimiento(rs.getInt(1));
                miDetalleMoviemto.setCantidad(rs.getInt(2));
                miDetalleMoviemto.setPrecio_productos(rs.getDouble(3));
                miDetalleMoviemto.setIva_productos(rs.getDouble(4));
                miDetalleMoviemto.setTotal_productos(rs.getDouble(5));
                miDetalleMoviemto.setPRODUCTOS_id_producto(rs.getInt(6));

            }
            return miDetalleMoviemto;

        } catch (Exception ex) {

            System.out.println("ocurrio un problema en ConsultarDetalle_movimiento_DETALLE_MOVIMIENTO_DAO_CONSULTAR\n" + ex.getMessage());
            return miDetalleMoviemto;

        }

    }

    public ArrayList<DETALLE_MOVIMIENTO> ConsultarListadoDetalleMovimiento(int id_detalle_movimiento, int cantidad) {
        ArrayList<DETALLE_MOVIMIENTO> mi_lista_detalle_movimiento = new ArrayList<DETALLE_MOVIMIENTO>();
        DETALLE_MOVIMIENTO mi_detalle_movimiento;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando Parametro" + id_detalle_movimiento);

        try {
            Statement sentencia = nuevaCon.createStatement();
            String Query = " select id_detalle_movimiento,cantidad, "
                    + " precio_productos,iva_productos, "
                    + " total_productos,PRODUCTOS_id_producto "
                    + " from DETALLE_MOVIMIENTO "
                    + " where id_detalle_movimiento like '%" + id_detalle_movimiento + "%' "
                    + " or (cantidad) like ('%" + cantidad + "%') ORDER BY id_detalle_movimiento; ";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                mi_detalle_movimiento = new DETALLE_MOVIMIENTO();
                mi_detalle_movimiento.setId_detalle_movimiento(rs.getInt(1));
                mi_detalle_movimiento.setCantidad(rs.getInt(2));
                mi_detalle_movimiento.setPrecio_productos(rs.getDouble(3));
                mi_detalle_movimiento.setIva_productos(rs.getDouble(4));
                mi_detalle_movimiento.setTotal_productos(rs.getDouble(5));
                mi_detalle_movimiento.setPRODUCTOS_id_producto(rs.getInt(6));
                mi_lista_detalle_movimiento.add(mi_detalle_movimiento);

            }
            return mi_lista_detalle_movimiento;

        } catch (Exception ex) {
            System.out.println("Error en la consulta de detalle_movimiento " + ex.getMessage());
            return mi_lista_detalle_movimiento;
        }
    }

    public String EliminarDetalle_movimiento(DETALLE_MOVIMIENTO Detalle_movimiento) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "delete from DETALLE_MOVIMIENTO where id_detalle_movimiento = ? and cantidad = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, Detalle_movimiento.getId_detalle_movimiento());
            sentencia.setInt(2, Detalle_movimiento.getCantidad());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en DETALLE_MOVIMIENTO_DAO_EliminarDetalle_movimiento" + ex.getMessage());
        }
        return miRespuesta;

    }

}
