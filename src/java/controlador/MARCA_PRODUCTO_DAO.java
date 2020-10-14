package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.MARCA_PRODUCTO;

public class MARCA_PRODUCTO_DAO {

    public String AdicionarMarcaProducto(MARCA_PRODUCTO MarcaProducto) {
        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        PreparedStatement sentencia;

        try {
            String Query = "insert MARCA_PRODUCTO (nombre_marca_producto)" + "values (?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, MarcaProducto.getNombre_marca_producto());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("ocurrio un error en AdicionarMarcaProducto_MARCA_PRODUCTO_DAO\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    public String ModificarMarcaProducto(MARCA_PRODUCTO MarcaProducto) {

        String miRespuesta = "";
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        PreparedStatement sentencia;

        try {
            String Query = "update MARCA_PRODUCTO set nombre_marca_producto=? where id_marca_producto=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, MarcaProducto.getNombre_marca_producto());
            sentencia.setInt(2, MarcaProducto.getId_marca_producto());
            sentencia.executeUpdate();

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en ActualizarMarcaProducto_MARCA_PRODUCTO_DAO\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    public MARCA_PRODUCTO ConsultarMarcaProducto(int id_marca_producto) {

        MARCA_PRODUCTO mimarcaproducto = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_marca_producto, nombre_marca_producto from MARCA_PRODUCTO where id_marca_producto = " + id_marca_producto;
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                mimarcaproducto = new MARCA_PRODUCTO();
                mimarcaproducto.setId_marca_producto(rs.getInt(1));
                mimarcaproducto.setNombre_marca_producto(rs.getString(2));

            }
            return mimarcaproducto;

        } catch (Exception ex) {

            System.out.println("ocurrio un problema en ConsultarMarcaProducto_MARCA_PRODUCTO_DAO_CONSULTAR\n" + ex.getMessage());
            return mimarcaproducto;

        }

    }

    public ArrayList<MARCA_PRODUCTO> ConsultarListadoMarcaProducto(int id_marca_producto, String nombre_marca_producto) {

        ArrayList<MARCA_PRODUCTO> mi_lista_marcaproducto = new ArrayList<MARCA_PRODUCTO>();
        MARCA_PRODUCTO mi_marcaproducto;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro" + nombre_marca_producto);

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select  id_marca_producto, nombre_marca_producto"
                    + " from MARCA_PRODUCTO"
                    + " where id_marca_producto like '%" + id_marca_producto + "%'"
                    + "  or (nombre_marca_producto) like ('%" + nombre_marca_producto + "%')"
                    + "  or (nombre_marca_producto) like ('%" + nombre_marca_producto + "%') ORDER BY id_marca_producto;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                mi_marcaproducto = new MARCA_PRODUCTO();
                mi_marcaproducto.setId_marca_producto(rs.getInt(1));
                mi_marcaproducto.setNombre_marca_producto(rs.getString(2));

                mi_lista_marcaproducto.add(mi_marcaproducto);

            }

            return mi_lista_marcaproducto;

        } catch (Exception ex) {

            System.out.println("Error en la consulta de listado en la marca producto" + "\n" + ex.getMessage());
            return mi_lista_marcaproducto;

        }

    }
    
    public String EliminarMarcaProducto(MARCA_PRODUCTO MarcaProducto) {

        String miRespuesta;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "delete from MARCA_PRODUCTO  where nombre_marca_producto = ? and id_marca_producto = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, MarcaProducto.getNombre_marca_producto());
            sentencia.setInt(2, MarcaProducto.getId_marca_producto());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en MARCA_PRODUCTO_DAO.EliminarMarcaProducto" + ex.getMessage());
        }
        return miRespuesta;

    }

}


