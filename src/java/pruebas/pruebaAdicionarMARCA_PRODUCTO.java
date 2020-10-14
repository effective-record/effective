package pruebas;

import java.util.Scanner;
import modelo.MARCA_PRODUCTO;
import controlador.MARCA_PRODUCTO_DAO;

public class pruebaAdicionarMARCA_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MARCA_PRODUCTO_DAO mi_marca_producto_dao = new MARCA_PRODUCTO_DAO();
        MARCA_PRODUCTO mi_marca_producto = new MARCA_PRODUCTO();

        Scanner teclado = new Scanner(System.in);

        String marcaproducto = "";

        System.out.println("Por favor ingrese la marca del producto");
        marcaproducto = teclado.next();

        mi_marca_producto.setNombre_marca_producto(marcaproducto);
        String miRespuesta = mi_marca_producto_dao.AdicionarMarcaProducto(mi_marca_producto);

        if (miRespuesta.length() == 0) {

            System.out.println("Registro exitoso");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }

    }

}
