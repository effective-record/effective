package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.TIPO_DE_DOCUMENTO_CONTABLE;

public class TIPO_DE_DOCUMENTO_CONTABLE_DAO {

    public String AdicionarTipo_de_Documento_Contable(TIPO_DE_DOCUMENTO_CONTABLE Tipo_de_Documento_Contable) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "Insert into TIPO_DE_DOCUMENTO_CONTABLE (codigo,descripcion,naturaleza)" + "values (?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Tipo_de_Documento_Contable.getCodigo());
            sentencia.setString(2, Tipo_de_Documento_Contable.getDescripcion());
            sentencia.setString(3, Tipo_de_Documento_Contable.getNaturaleza());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en AdicionarTipo_de_Documento_Contable\n" + miRespuesta);

        }

        return miRespuesta;

    }
    public String ModificarTipo_de_documento_contable(TIPO_DE_DOCUMENTO_CONTABLE Tipo_de_documento_contable) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "update TIPO_DE_DOCUMENTO_CONTABLE set codigo=?,descripcion=?, naturaleza=? where codigo=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Tipo_de_documento_contable.getCodigo());
            sentencia.setString(2, Tipo_de_documento_contable.getDescripcion());
            sentencia.setString(3, Tipo_de_documento_contable.getNaturaleza());
            sentencia.setString(4, Tipo_de_documento_contable.getCodigo());
            sentencia.executeUpdate();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error \n" + miRespuesta);

        }

        return miRespuesta;

    }
    public TIPO_DE_DOCUMENTO_CONTABLE ConsultarDetalleMovimiento(String codigo) {

        TIPO_DE_DOCUMENTO_CONTABLE miTipodeDocumento = null;

        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {

            Statement sentencia = nuevaCon.createStatement();

            String Query = "select id_tipo_de_documento_contable,codigo,descripcion,naturaleza from  TIPO_DE_DOCUMENTO_CONTABLE where codigo  = " + codigo;
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {

                miTipodeDocumento = new TIPO_DE_DOCUMENTO_CONTABLE();
                miTipodeDocumento.setId_tipo_de_documento_contable(rs.getInt(1));
                miTipodeDocumento.setCodigo(rs.getString(2));
                miTipodeDocumento.setDescripcion(rs.getString(3));
                miTipodeDocumento.setNaturaleza(rs.getNString(4));
                
                

            }
            return miTipodeDocumento;

        } catch (Exception ex) {

            System.out.println("ocurrio un problema en la consultaConsultarTipo_documento_contable_TIPO_DOCUMENTO_CONTABLE_DAO_CONSULTAR\n" + ex.getMessage());
            return miTipodeDocumento;

        }

    }
    public ArrayList <TIPO_DE_DOCUMENTO_CONTABLE> ConsultarListadoTipoDocumento (String codigo,String descripcion){
        ArrayList<TIPO_DE_DOCUMENTO_CONTABLE>mi_lista_tipo_de_documento =new ArrayList<TIPO_DE_DOCUMENTO_CONTABLE>();
        TIPO_DE_DOCUMENTO_CONTABLE mi_tipo_documento;
        
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        
                System.out.println("Buscando Parametro" + codigo);
                
     try{
       Statement sentencia= nuevaCon.createStatement(); 
       String Query =" select id_tipo_de_documento_contable,codigo,descripcion,naturaleza"
               + " from TIPO_DE_DOCUMENTO_CONTABLE "
               + " where codigo like '%" + codigo + "%' "
               + " or (descripcion) like ('%" + descripcion + "%')"
               + " or (descripcion) like ('%" + descripcion + "%') ORDER BY codigo; "; 
       
       
       ResultSet rs= sentencia.executeQuery(Query);
       
       while (rs.next()){
           
           mi_tipo_documento =new  TIPO_DE_DOCUMENTO_CONTABLE();
           mi_tipo_documento.setId_tipo_de_documento_contable(rs.getInt(1));
           mi_tipo_documento.setCodigo(rs.getString(2));
           mi_tipo_documento.setDescripcion(rs.getString(3));
           mi_tipo_documento.setNaturaleza(rs.getNString(4));
           mi_lista_tipo_de_documento.add(mi_tipo_documento);
           
                   }
       return mi_lista_tipo_de_documento;
       
     }catch (Exception ex){
         System.out.println("Error en la consulta tipo_de_documento_contable " +ex.getMessage());
         return mi_lista_tipo_de_documento;
     }
    } 
    public String EliminarTipo_de_Documento_Contable(TIPO_DE_DOCUMENTO_CONTABLE Tipo_de_Documento_Contable) {

        String miRespuesta;
        conexion miConexion = new conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {

            String Query = "delete from TIPO_DE_DOCUMENTO_CONTABLE where codigo = ? and descripcion = ? ;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, Tipo_de_Documento_Contable.getCodigo());
            sentencia.setString(2, Tipo_de_Documento_Contable.getDescripcion());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en TIPO_DE_DOCUMENTO_CONTABLE_DAO.EliminarTipo_de_Documento_Contable" + ex.getMessage());
        }
        return miRespuesta;

    }
}




