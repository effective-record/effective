package pruebas;

import controlador.PRODUCTOS_DAO;
import java.util.ArrayList;
import modelo.PRODUCTOS;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarPRODUCTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PRODUCTOS_DAO mi_producto_dao = new PRODUCTOS_DAO();
        ArrayList<PRODUCTOS> mi_lista_productos = mi_producto_dao.ConsultarListadoProductos(1, "");

        for (PRODUCTOS P : mi_lista_productos) {

            System.out.println("Número de id del producto  - " + P.getId_producto() + "\n" + "Nombre del producto - " + P.getNombre_producto() + "\n");

        }

        System.out.println("El registro se elimino satisfactoriamnete");
        mi_producto_dao.EliminarProductos(mi_lista_productos.get(0));
        mi_lista_productos = mi_producto_dao.ConsultarListadoProductos(1, "");

        for (PRODUCTOS P : mi_lista_productos) {

            System.out.println("Número de id del producto  - " + P.getId_producto() + "\n" + "Nombre del producto - " + P.getNombre_producto() + "\n");

        }

    }

}
