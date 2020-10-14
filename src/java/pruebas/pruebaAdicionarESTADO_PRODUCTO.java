
package pruebas;

import controlador.ESTADO_PRODUCTO_DAO;
import java.util.Scanner;
import modelo.ESTADO_PRODUCTO;


public class pruebaAdicionarESTADO_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ESTADO_PRODUCTO_DAO mi_estado_producto_dao = new ESTADO_PRODUCTO_DAO ();
        ESTADO_PRODUCTO mi_estado_producto = new ESTADO_PRODUCTO();
         
        
       Scanner teclado = new Scanner(System.in);
       
       String descripcion_estado_producto = "";
       
        System.out.println("Por favor ingrese el estado del producto Activo o Inactivo");
        descripcion_estado_producto = teclado.next();
        mi_estado_producto.setDescripcion_estado_producto(descripcion_estado_producto);
        String miRespuesta = mi_estado_producto_dao.AdicionarEstadoProducto(mi_estado_producto);
        
        if (miRespuesta.length() == 0){
        
            System.out.println("Registro exitoso!");
        } else {
        
            System.out.println("Ocurrio un error"+ miRespuesta);
            
          
        }
        
        

    }
    
}
