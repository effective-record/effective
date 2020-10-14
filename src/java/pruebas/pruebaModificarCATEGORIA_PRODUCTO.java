package pruebas;


import controlador.CATEGORIA_PRODUCTO_DAO;
import java.util.Scanner;
import modelo.CATEGORIA_PRODUCTO;

public class pruebaModificarCATEGORIA_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CATEGORIA_PRODUCTO_DAO mi_categoria_producto_dao = new CATEGORIA_PRODUCTO_DAO();
        CATEGORIA_PRODUCTO mi_categoria_producto = new CATEGORIA_PRODUCTO();
        
        Scanner teclado = new Scanner(System.in);
        
        String categoriaproducto = "";
        
        System.out.println("Por favor ingrese la nueva categoria del producto");
        categoriaproducto = teclado.nextLine();
        
        mi_categoria_producto.setNombre_categoria_producto(categoriaproducto);
        
        mi_categoria_producto.setId_categoria_producto(1);
        String miRespuesta = mi_categoria_producto_dao.ModificarCategoria_producto(mi_categoria_producto);//Ingreso el estado del cual quiero cambiar los datos

        if (miRespuesta.length() == 0) {
            
            System.out.println("Modificación exitoso");
            
        } else {
            
            System.out.println("Ocurrio un error" + miRespuesta);
            
        }
        
    }
    
}
