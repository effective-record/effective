
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexion {
    
    private Connection conn;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String password = "";
    private String baseDatos = "effective";
    private String url = "jdbc:mysql://localhost:3306/"+ baseDatos + "?useTimezone=true&serverTimezone=UTC";
    
 
public conexion(){
    
    conn = null;
    
    try{
        
        Class.forName(driver);
        
        conn = DriverManager.getConnection(url,user,password);
        if(conn==null) {
            
            System.out.println("No se establecio la conexión" + "\n" + url);
           
        }else{
            
            System.out.println("Conexión establecida con la base de datos effective");
            
        }
   
    }catch(Exception ex){
        
        System.err.println(ex.getMessage());
    
    
    }
        

}

 public Connection getConn(){
     
     return conn;
 
 }
 
 public void CerrarConexion() throws SQLException{
     
     if(conn != null){
         
         conn.close();
     
     }
 
 }
    
   
    
}
