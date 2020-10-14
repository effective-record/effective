package pruebas;


import controlador.PRODUCTOS_DAO;
import java.util.Scanner;
import modelo.PRODUCTOS;

public class pruebaModificarPRODUCTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PRODUCTOS_DAO mi_producto_dao = new PRODUCTOS_DAO();
        PRODUCTOS mi_producto = new PRODUCTOS();

        Scanner teclado = new Scanner(System.in);

        String nombre_producto = "";
        String descripcion_producto = "";
        double precio_producto;
        int cantidad_producto;
        double iva_producto;
        

        System.out.println("Ingrese el nuevo Nombre del producto");
        nombre_producto = teclado.nextLine();

        System.out.println("Ingrese  la nueva descripcion del producto");
        descripcion_producto = teclado.nextLine();

        System.out.println("Ingrese el nuevo Precio");
        precio_producto = teclado.nextDouble();

        System.out.println("Ingrese el nuevo iva del producto");
        iva_producto = teclado.nextDouble();

        System.out.println("Ingrese la nueva cantidad del producto");
        cantidad_producto = teclado.nextInt();


        mi_producto.setNombre_producto(nombre_producto);
        mi_producto.setDescripcion_producto(descripcion_producto);
        mi_producto.setPrecio_producto(precio_producto);
        mi_producto.setIva_producto(iva_producto);
        mi_producto.setCantidad_producto(cantidad_producto);
        
        mi_producto.setPROVEEDORES_id_proveedor(1);
        
        mi_producto.setCATEGORIA_PRODUCTO_id_categoria_producto(1);
        mi_producto.setESTADO_PRODUCTO_id_estado_producto(1);
        mi_producto.setMARCA_PRODUCTO_id_marca_producto(1);
        mi_producto.setINVENTARIO_id_inventario(1);
        mi_producto.setUNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto(1);

        mi_producto.setId_producto(1);
        String miRespuesta = mi_producto_dao.ModificarProductos(mi_producto);

        if (miRespuesta.length() == 0) {
            System.out.println("Usuario actualizado");

        } else {
            System.out.println("Error" + miRespuesta);
        }

    }

}
