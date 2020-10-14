package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.PROVEEDORES;

public class PROVEEDORES_DAO {

    public String AdicionarProveedores(PROVEEDORES Proveedores) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "Insert PROVEEDORES (identificacion_proveedor,nombre_proveedor,correo_proveedor,direccion_proveedor,telefono_1_proveedor,telefono_2_proveedor)" + "values (?,?,?,?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Proveedores.getIdentificacion_proveedor());
            sentencia.setString(2, Proveedores.getNombre_proveedor());
            sentencia.setString(3, Proveedores.getCorreo_proveedor());
            sentencia.setString(4, Proveedores.getDireccion_proveedor());
            sentencia.setString(5, Proveedores.getTelefono_1_proveedor());
            sentencia.setString(6, Proveedores.getTelefono_2_proveedor());

            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en AdicionarPROVEEDORES_DAO\n" + miRespuesta);

        }

        return miRespuesta;

    }
    public String ModificarProveedores(PROVEEDORES Proveedores) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "update PROVEEDORES set identificacion_proveedor=?, nombre_proveedor=?, correo_proveedor=?, direccion_proveedor=?, telefono_1_proveedor=?,telefono_2_proveedor=? where identificacion_proveedor=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Proveedores.getIdentificacion_proveedor());
            sentencia.setString(2, Proveedores.getNombre_proveedor());
            sentencia.setString(3, Proveedores.getCorreo_proveedor());
            sentencia.setString(4, Proveedores.getDireccion_proveedor());
            sentencia.setString(5, Proveedores.getTelefono_1_proveedor());
            sentencia.setString(6, Proveedores.getTelefono_2_proveedor());
            sentencia.setString(7, Proveedores.getIdentificacion_proveedor());

            sentencia.executeUpdate();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en ModificarProveedores_PROVEEDORES_DAO_MODIFICAR\n" + miRespuesta);

        }

        return miRespuesta;

    }
    public PROVEEDORES ConsultarProveedor(String identificacion_proveedor) {
        
        PROVEEDORES miproveedor = null;
        
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        try {
            
            Statement sentencia = nuevaCon.createStatement();
            
            String Query = "select id_proveedor, nombre_proveedor, correo_proveedor, direccion_proveedor, telefono_1_proveedor, telefono_2_proveedor from PROVEEDORES where identificacion_proveedor = " + identificacion_proveedor;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
                
                miproveedor = new PROVEEDORES();
                miproveedor.setId_proveedor(rs.getInt(1));
                miproveedor.setIdentificacion_proveedor(rs.getString(2));
                miproveedor.setNombre_proveedor(rs.getString(3));
                miproveedor.setCorreo_proveedor(rs.getString(4));
                miproveedor.setDireccion_proveedor(rs.getString(5));
                miproveedor.setTelefono_1_proveedor(rs.getString(6));
                miproveedor.setTelefono_2_proveedor(rs.getString(7));
                
            }
            
            return miproveedor;
            
        } catch (Exception ex) {
            
            System.out.println("ocurrio un problema en ConsultarProveedor_PROVEEDORES_DAO_CONSULTAR\n" + ex.getMessage());
            return miproveedor;
            
        }
        
    }
    public ArrayList<PROVEEDORES> ConsultarListadoProveedor ( String identificacion_proveedor, String nombre_proveedor) {

         

        ArrayList<PROVEEDORES> mi_lista_proveedor = new ArrayList<PROVEEDORES>();
        PROVEEDORES mi_proveedor;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

       System.out.println("Buscando parametro" + identificacion_proveedor);

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_proveedor,identificacion_proveedor, nombre_proveedor,"
                    + " correo_proveedor, direccion_proveedor, telefono_1_proveedor, telefono_2_proveedor"
                    + " from PROVEEDORES"
                    + " where identificacion_proveedor like '%" + identificacion_proveedor + "%'"
                    + "  or (nombre_proveedor) like ('%" + nombre_proveedor + "%')"
                    + "  or (nombre_proveedor) like ('%" + nombre_proveedor + "%') ORDER BY identificacion_proveedor;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                mi_proveedor = new PROVEEDORES();
                mi_proveedor.setId_proveedor(rs.getInt(1));
                mi_proveedor.setIdentificacion_proveedor(rs.getString(2));
                mi_proveedor.setNombre_proveedor(rs.getString(3));
                mi_proveedor.setCorreo_proveedor(rs.getString(4));
                mi_proveedor.setDireccion_proveedor(rs.getString(5));
                mi_proveedor.setTelefono_1_proveedor(rs.getString(6));
                mi_proveedor.setTelefono_2_proveedor(rs.getString(7));
                mi_lista_proveedor.add(mi_proveedor);

                 }

            return mi_lista_proveedor;

        } catch (Exception ex) {

            System.out.println("Error en la consulta de listado proveedores" + "\n" + ex.getMessage());
            return mi_lista_proveedor;

        }

    }  
    public String EliminarProveedores(PROVEEDORES Proveedores) {

        String miRespuesta;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "delete from PROVEEDORES where identificacion_proveedor = ? and id_proveedor= ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Proveedores.getIdentificacion_proveedor());
            sentencia.setInt(2, Proveedores.getId_proveedor());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en PROVEEDORES_DAO.EliminarProveedor" + ex.getMessage());
        }
        return miRespuesta;

    }
    
}





