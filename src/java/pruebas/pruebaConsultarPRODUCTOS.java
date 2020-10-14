package pruebas;


import controlador.PRODUCTOS_DAO;
import modelo.PRODUCTOS;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarPRODUCTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PRODUCTOS_DAO productoDao = new PRODUCTOS_DAO();
        PRODUCTOS miproducto = productoDao.ConsultarProductos(1);

        if (miproducto != null) {

            System.out.println("Se realizo la consulta satisfactoriamente del producto - " + miproducto.getNombre_producto());
            System.out.println("Precio - " + miproducto.getPrecio_producto());
            System.out.println("Descripción - " + miproducto.getDescripcion_producto());
            System.out.println("Cantidad - " + miproducto.getCantidad_producto());
            System.out.println("Iva - " + miproducto.getIva_producto());
            System.out.println("Unidad de medida del producto - " + miproducto.getUNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto());
            System.out.println("Proveedor - " + miproducto.getPROVEEDORES_id_proveedor());
            System.out.println("Categoria - " + miproducto.getCATEGORIA_PRODUCTO_id_categoria_producto());
            System.out.println("Estado producto - " + miproducto.getESTADO_PRODUCTO_id_estado_producto());
            System.out.println("Marca producto - " + miproducto.getMARCA_PRODUCTO_id_marca_producto());
            System.out.println("Inventario - " + miproducto.getINVENTARIO_id_inventario());

        } else {

            System.out.println("Ha ocurrido un error durante la consulta");

        }

    }

}
