package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.PRODUCTOS;

public class PRODUCTOS_DAO {

    public String AdicionarProductos(PRODUCTOS Productos) {
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        PreparedStatement sentencia;

        try {
            String Query = "insert PRODUCTOS ( nombre_producto,precio_producto,descripcion_producto,cantidad_producto,iva_producto,PROVEEDORES_id_proveedor,CATEGORIA_PRODUCTO_id_categoria_producto,ESTADO_PRODUCTO_id_estado_producto,MARCA_PRODUCTO_id_marca_producto,INVENTARIO_id_inventario,UNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto)" + "values (?,?,?,?,?,?,?,?,?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Productos.getNombre_producto());
            sentencia.setDouble(2, Productos.getPrecio_producto());
            sentencia.setString(3, Productos.getDescripcion_producto());
            sentencia.setInt(4, Productos.getCantidad_producto());
            sentencia.setDouble(5, Productos.getIva_producto());
            sentencia.setInt(6, Productos.getPROVEEDORES_id_proveedor());
            sentencia.setInt(7, Productos.getCATEGORIA_PRODUCTO_id_categoria_producto());
            sentencia.setInt(8, Productos.getESTADO_PRODUCTO_id_estado_producto());
            sentencia.setInt(9, Productos.getMARCA_PRODUCTO_id_marca_producto());
            sentencia.setInt(10, Productos.getINVENTARIO_id_inventario());
            sentencia.setInt(11, Productos.getUNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("ocurrio un error en AdicionarProductos_PRODUCTOS_DAO\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    public String ModificarProductos(PRODUCTOS Productos) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "update PRODUCTOS set nombre_producto=?,descripcion_producto=?,precio_producto=?,  cantidad_producto=?, iva_producto=?, PROVEEDORES_id_proveedor=?,CATEGORIA_PRODUCTO_id_categoria_producto=?, ESTADO_PRODUCTO_id_estado_producto=?, MARCA_PRODUCTO_id_marca_producto=?,INVENTARIO_id_inventario=?,UNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto=?  where id_producto=? ";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Productos.getNombre_producto());
            sentencia.setString(2, Productos.getDescripcion_producto());
            sentencia.setDouble(3, Productos.getPrecio_producto());
            sentencia.setDouble(4, Productos.getIva_producto());
            sentencia.setInt(5, Productos.getCantidad_producto());
            sentencia.setInt(6, Productos.getPROVEEDORES_id_proveedor());
            sentencia.setInt(7, Productos.getCATEGORIA_PRODUCTO_id_categoria_producto());
            sentencia.setInt(8, Productos.getESTADO_PRODUCTO_id_estado_producto());
            sentencia.setInt(9, Productos.getMARCA_PRODUCTO_id_marca_producto());
            sentencia.setInt(10, Productos.getINVENTARIO_id_inventario());
            sentencia.setInt(11, Productos.getUNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto());
            sentencia.setInt(12, Productos.getId_producto());
            sentencia.executeUpdate();
            miRespuesta = "";
        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("ocurrio un problema en ActualizarProsductos_PRODUCTOS_DAO \n" + ex.getMessage());
        }
        return miRespuesta;

    }

    public PRODUCTOS ConsultarProductos(int id_producto) {

        PRODUCTOS miproducto = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_producto, nombre_producto, precio_producto, descripcion_producto, cantidad_producto, iva_producto, UNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto, PROVEEDORES_id_proveedor, CATEGORIA_PRODUCTO_id_categoria_producto, ESTADO_PRODUCTO_id_estado_producto, MARCA_PRODUCTO_id_marca_producto, INVENTARIO_id_inventario from PRODUCTOS where id_producto = " + id_producto;
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {
                miproducto = new PRODUCTOS();
                miproducto.setId_producto(rs.getInt(1));
                miproducto.setNombre_producto(rs.getString(2));
                miproducto.setPrecio_producto(rs.getDouble(3));
                miproducto.setDescripcion_producto(rs.getString(4));
                miproducto.setCantidad_producto(rs.getInt(5));
                miproducto.setIva_producto(rs.getDouble(6));
                miproducto.setUNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto(rs.getInt(7));
                miproducto.setPROVEEDORES_id_proveedor(rs.getInt(8));
                miproducto.setCATEGORIA_PRODUCTO_id_categoria_producto(rs.getInt(9));
                miproducto.setESTADO_PRODUCTO_id_estado_producto(rs.getInt(10));
                miproducto.setMARCA_PRODUCTO_id_marca_producto(rs.getInt(11));
                miproducto.setINVENTARIO_id_inventario(rs.getInt(12));

            }
            return miproducto;
        } catch (Exception ex) {

            System.out.println("ocurrio un problema en ConsultarProductos_PRODUCTOS_DAO_CONSULTAR\n" + ex.getMessage());
            return miproducto;

        }

    }
    
    public ArrayList<PRODUCTOS> ConsultarListadoProductos(int id_producto,String nombre_producto) {

        ArrayList<PRODUCTOS> mi_lista_productos = new ArrayList<PRODUCTOS>();
        PRODUCTOS mi_producto;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro" + nombre_producto);

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_producto,nombre_producto,precio_producto,descripcion_producto, "
                    + " cantidad_producto,iva_producto,PROVEEDORES_id_proveedor, "
                    + " CATEGORIA_PRODUCTO_id_categoria_producto,ESTADO_PRODUCTO_id_estado_producto,MARCA_PRODUCTO_id_marca_producto,INVENTARIO_id_inventario,UNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto"
                    + " from PRODUCTOS"
                    + " where id_producto like '%" + id_producto + "%'"
                    + "  or (nombre_producto) like ('%" + nombre_producto + "%')"
                    + "  or (nombre_producto) like ('%" + nombre_producto + "%') ORDER BY nombre_producto;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                mi_producto = new PRODUCTOS();
               
                mi_producto.setId_producto(rs.getInt(1));
                mi_producto.setNombre_producto(rs.getString(2));
                mi_producto.setPrecio_producto(rs.getDouble(3));
                mi_producto.setDescripcion_producto(rs.getString(4));
                mi_producto.setCantidad_producto(rs.getInt(5));
                mi_producto.setIva_producto(rs.getDouble(6));
                mi_producto.setPROVEEDORES_id_proveedor(rs.getInt(7));
                mi_producto.setCATEGORIA_PRODUCTO_id_categoria_producto(rs.getInt(8));
                mi_producto.setESTADO_PRODUCTO_id_estado_producto(rs.getInt(9));
                mi_producto.setMARCA_PRODUCTO_id_marca_producto(rs.getInt(10));
                mi_producto.setINVENTARIO_id_inventario(rs.getInt(11));
                mi_producto.setUNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto(rs.getInt(12));
                mi_lista_productos.add(mi_producto);
                
            }

            return mi_lista_productos;

        } catch (Exception ex) {

            System.out.println("Error en la consulta de listado productos" + "\n" + ex.getMessage());
            return mi_lista_productos;

        }

    }
    
    
    
    public String EliminarProductos(PRODUCTOS Productos) {

        String miRespuesta;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "delete from PRODUCTOS where nombre_producto = ? and id_producto = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Productos.getNombre_producto());
            sentencia.setInt(2, Productos.getId_producto());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en PRODUCTOS_DAO.EliminarProductos" + ex.getMessage());
        }
        return miRespuesta;

    }
    
    
    
   
}
