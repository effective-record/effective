package pruebas;


import controlador.MARCA_PRODUCTO_DAO;
import java.util.Scanner;
import modelo.MARCA_PRODUCTO;

public class pruevaModificarMARCA_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MARCA_PRODUCTO_DAO mi_marca_producto_dao = new MARCA_PRODUCTO_DAO();
        MARCA_PRODUCTO mi_marca_producto = new MARCA_PRODUCTO();
        
        Scanner teclado = new Scanner(System.in);
        
        String nombre_marca_producto = "";
        
        System.out.println("Ingrese el nuevo nombre de la marca");
        nombre_marca_producto = teclado.nextLine();
        
        mi_marca_producto.setNombre_marca_producto(nombre_marca_producto);
        
        mi_marca_producto.setId_marca_producto(1);
        String miRespuesta = mi_marca_producto_dao.ModificarMarcaProducto(mi_marca_producto);
        
        if (miRespuesta.length() == 0) {
            System.out.println("Usuario actualizado");
            
        } else {
            System.out.println("Error" + miRespuesta);
        }
        
    }
}
