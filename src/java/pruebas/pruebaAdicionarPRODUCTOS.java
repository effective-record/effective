
package pruebas;

import controlador.PRODUCTOS_DAO;
import java.util.Scanner;
import modelo.PRODUCTOS;


public class pruebaAdicionarPRODUCTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PRODUCTOS_DAO mi_producto_dao = new PRODUCTOS_DAO();
        PRODUCTOS mi_producto = new PRODUCTOS();

        Scanner teclado = new Scanner(System.in);

        String nombre_producto;
        double precio_producto;
        String descripcion_producto;
        int cantidad_producto;
        double iva_producto;
        int PROVEEDORES_id_proveedor;
        int CATEGORIA_PRODUCTO_id_categoria_producto;
        int ESTADO_PRODUCTO_id_estado_producto;
        int MARCA_PRODUCTO_id_marca_producto;
        int INVENTARIO_id_inventario;
        int UNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto;

        System.out.println("ingrese el Nombre del producto");
        nombre_producto = teclado.nextLine();

        System.out.println("ingrese la descripcion del producto");
        descripcion_producto = teclado.nextLine();

        System.out.println("Ingrese el Precio");
        precio_producto = teclado.nextDouble();

        System.out.println("ingrese el iva del producto");
        iva_producto = teclado.nextDouble();

        System.out.println("ingrese la cantidad del producto");
        cantidad_producto = teclado.nextInt();

        System.out.println("ingrese el id de proveedor");
        PROVEEDORES_id_proveedor = teclado.nextInt();

        System.out.println("ingrese el id de la categoria del producto");
        CATEGORIA_PRODUCTO_id_categoria_producto = teclado.nextInt();

        System.out.println("ingrese el id del  estado del producto");
        ESTADO_PRODUCTO_id_estado_producto = teclado.nextInt();

        System.out.println("ingrese la marca del producto");
        MARCA_PRODUCTO_id_marca_producto = teclado.nextInt();

        System.out.println("ingrese el id del inventario");
        INVENTARIO_id_inventario = teclado.nextInt();

        System.out.println(" ingrese el id de la unidad de medida del producto");
        UNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto = teclado.nextInt();

        mi_producto.setNombre_producto(nombre_producto);
        mi_producto.setDescripcion_producto(descripcion_producto);
        mi_producto.setPrecio_producto(precio_producto);
        mi_producto.setIva_producto(iva_producto);
        mi_producto.setCantidad_producto(cantidad_producto);
        mi_producto.setPROVEEDORES_id_proveedor(PROVEEDORES_id_proveedor);
        mi_producto.setCATEGORIA_PRODUCTO_id_categoria_producto(CATEGORIA_PRODUCTO_id_categoria_producto);
        mi_producto.setESTADO_PRODUCTO_id_estado_producto(ESTADO_PRODUCTO_id_estado_producto);
        mi_producto.setMARCA_PRODUCTO_id_marca_producto(MARCA_PRODUCTO_id_marca_producto);
        mi_producto.setINVENTARIO_id_inventario(INVENTARIO_id_inventario);
        mi_producto.setUNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto(UNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto);
        String miRespuesta = mi_producto_dao.AdicionarProductos(mi_producto);

        if (miRespuesta.length() == 0) {

            System.out.println("Registro exitoso");

        } else {
            System.out.println("Ocurrio un error");

        }
        
        
        
        
        
     
    }
    
}
