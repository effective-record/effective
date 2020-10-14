package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.UNIDAD_DE_MEDIDA_PRODUCTO;

/**
 *
 * @author YesidValencia
 */
public class UNIDAD_DE_MEDIDA_PRODUCTO_DAO {

    public String AdicionarUnidad_de_medida_producto(UNIDAD_DE_MEDIDA_PRODUCTO Unidad_de_medida_producto) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "Insert UNIDAD_DE_MEDIDA_PRODUCTO (descripcion_unidad_de_medida_producto)" + "values (?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Unidad_de_medida_producto.getDescripcion_unidad_de_medida_producto());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en AdicionarEstado_usuario_ESTADO_USUARIO_DAO\n" + miRespuesta);

        }

        return miRespuesta;

    }

    public String ModificarUnidad_de_medida_producto(UNIDAD_DE_MEDIDA_PRODUCTO Unidad_de_medida_producto) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "update UNIDAD_DE_MEDIDA_PRODUCTO set descripcion_unidad_de_medida_producto=? where id_unidad_de_medida_producto=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Unidad_de_medida_producto.getDescripcion_unidad_de_medida_producto());
            sentencia.setInt(2, Unidad_de_medida_producto.getId_unidad_de_medida_producto());
            sentencia.execute();
            miRespuesta = "";
            sentencia.executeUpdate();

            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en ModificarUNIDAD_DE_MEDIDA_PRODUCTO_DAO_MODIFICAR\n" + miRespuesta);

        }

        return miRespuesta;

    }

    public UNIDAD_DE_MEDIDA_PRODUCTO Consultarunidad_de_medida_producto(int id_unidad_de_medida_producto) {

        UNIDAD_DE_MEDIDA_PRODUCTO miunidad = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_unidad_de_medida_producto, descripcion_unidad_de_medida_producto from UNIDAD_DE_MEDIDA_PRODUCTO where id_unidad_de_medida_producto = " + id_unidad_de_medida_producto;
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                miunidad = new UNIDAD_DE_MEDIDA_PRODUCTO();
                miunidad.setId_unidad_de_medida_producto(rs.getInt(1));
                miunidad.setDescripcion_unidad_de_medida_producto(rs.getString(2));

            }
            return miunidad;

        } catch (Exception ex) {

            System.out.println("ocurrio un problema en ConsultarUsuarios_USUARIOS_DAO_CONSULTAR\n" + ex.getMessage());
            return miunidad;

        }

    }
    
    public ArrayList<UNIDAD_DE_MEDIDA_PRODUCTO> ConsultarListarUnidad_de_medida(int id_unidad_de_medida_producto, String descripcion_unidad_de_medida_producto) {

        ArrayList<UNIDAD_DE_MEDIDA_PRODUCTO> mi_lista_unidad_medida = new ArrayList<UNIDAD_DE_MEDIDA_PRODUCTO>();
        UNIDAD_DE_MEDIDA_PRODUCTO mi_estado_unidad_medida;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        System.out.println("Buscando parametro" + descripcion_unidad_de_medida_producto);

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_unidad_de_medida_producto,descripcion_unidad_de_medida_producto"
                    + " from UNIDAD_DE_MEDIDA_PRODUCTO"
                    + " where id_unidad_de_medida_producto like '%" + id_unidad_de_medida_producto + "%'"
                    + "  or (descripcion_unidad_de_medida_producto) like ('%" + descripcion_unidad_de_medida_producto + "%')"
                    + "  or (descripcion_unidad_de_medida_producto) like ('%" + descripcion_unidad_de_medida_producto + "%') ORDER BY id_unidad_de_medida_producto;";

            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                mi_estado_unidad_medida = new UNIDAD_DE_MEDIDA_PRODUCTO();
                mi_estado_unidad_medida.setId_unidad_de_medida_producto(rs.getInt(1));
                mi_estado_unidad_medida.setDescripcion_unidad_de_medida_producto(rs.getString(2));
                mi_lista_unidad_medida.add(mi_estado_unidad_medida);

            }
            return mi_lista_unidad_medida;

        } catch (Exception ex) {

            System.out.println("Error en la consulta de listado unidad_de_medida_producto" + "\n" + ex.getMessage());
            return mi_lista_unidad_medida;

        }

    }
    
    public String EliminarUnidad_de_medida_producto(UNIDAD_DE_MEDIDA_PRODUCTO Unidad_de_medida_producto) {

        String miRespuesta;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "delete from UNIDAD_DE_MEDIDA_PRODUCTO where descripcion_unidad_de_medida_producto = ? and id_unidad_de_medida_producto = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Unidad_de_medida_producto.getDescripcion_unidad_de_medida_producto());
            sentencia.setInt(2, Unidad_de_medida_producto.getId_unidad_de_medida_producto());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en UNIDAD_DE_MEDIDA_PRODUCTO.EliminarUnidad_de_medida_producto" + ex.getMessage());
        }
        return miRespuesta;

    }
    
    

}
