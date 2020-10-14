
package pruebas;

import controlador.conexion;
import java.sql.Connection;


public class pruebaconexion {

    
    public static void main(String[] args) {
        
        conexion con = new conexion();
        
        Connection reg = con.getConn();
        
       
    }
    
}
