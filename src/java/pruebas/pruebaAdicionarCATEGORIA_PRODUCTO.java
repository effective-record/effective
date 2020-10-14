
package pruebas;

import controlador.CATEGORIA_PRODUCTO_DAO;
import java.util.Scanner;
import modelo.CATEGORIA_PRODUCTO;

public class pruebaAdicionarCATEGORIA_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CATEGORIA_PRODUCTO_DAO mi_categoria_producto_dao = new CATEGORIA_PRODUCTO_DAO();
        CATEGORIA_PRODUCTO mi_categoria_producto = new CATEGORIA_PRODUCTO();

        Scanner teclado = new Scanner(System.in);

        String categoriaproducto = "";

        System.out.println("Ingrese el nombre de la categoria del producto");
        categoriaproducto = teclado.next();

        mi_categoria_producto.setNombre_categoria_producto(categoriaproducto);
        String miRespuesta = mi_categoria_producto_dao.AdicionarCategoria_producto(mi_categoria_producto);

        if (miRespuesta.length() == 0) {

            System.out.println("Registro exitoso");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }

       
    }
    
}
