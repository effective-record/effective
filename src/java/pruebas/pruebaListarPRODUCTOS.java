package pruebas;

import controlador.PRODUCTOS_DAO;
import java.util.ArrayList;
import modelo.PRODUCTOS;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarPRODUCTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PRODUCTOS_DAO productos_dao = new PRODUCTOS_DAO();
        ArrayList<PRODUCTOS> mi_producto = new ArrayList<PRODUCTOS>();
        mi_producto = productos_dao.ConsultarListadoProductos(1, "");

        int size = mi_producto.size();
        System.out.println("<table border=\"1\")><br><td>id_producto</td><td>nombre_producto</td><td>precio_producto</td><td>descripcion_producto</td><td>cantidad_producto</td><td>iva_producto</td><td>PROVEEDORES_id_proveedor</td><td>CATEGORIA_PRODUCTO_id_categoria_producto</td><td>ESTADO_PRODUCTO_id_estado_producto</td><td>MARCA_PRODUCTO_id_marca_producto</td><td>INVENTARIO_id_inventario</td><td>UNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto</td>");

        for (PRODUCTOS P : mi_producto) {

            System.out.println("<tr>");
            System.out.println("<td>" + P.getId_producto() + "</td>");
            System.out.println("<td>" + P.getNombre_producto() + "</td>");
            System.out.println("<td>" + P.getPrecio_producto() + "</td>");
            System.out.println("<td>" + P.getDescripcion_producto() + "</td>");
            System.out.println("<td>" + P.getCantidad_producto() + "</td>");
            System.out.println("<td>" + P.getIva_producto() + "</td>");
            System.out.println("<td>" + P.getPROVEEDORES_id_proveedor() + "</td>");
            System.out.println("<td>" + P.getCATEGORIA_PRODUCTO_id_categoria_producto() + "</td>");
            System.out.println("<td>" + P.getESTADO_PRODUCTO_id_estado_producto() + "</td>");
            System.out.println("<td>" + P.getMARCA_PRODUCTO_id_marca_producto() + "</td>");
            System.out.println("<td>" + P.getINVENTARIO_id_inventario() + "</td>");
            System.out.println("<td>" + P.getUNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto() + "</td>");
            System.out.println("</tr>");

        }

        System.out.println("</table>");

    }

}
