package pruebas;

import controlador.MARCA_PRODUCTO_DAO;
import java.util.ArrayList;
import modelo.MARCA_PRODUCTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarMARCA_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MARCA_PRODUCTO_DAO mi_marcaproducto_dao = new MARCA_PRODUCTO_DAO();
        ArrayList<MARCA_PRODUCTO> mi_lista_marcaproducto = mi_marcaproducto_dao.ConsultarListadoMarcaProducto(2, "Lenovo");

        for (MARCA_PRODUCTO M : mi_lista_marcaproducto) {

            System.out.println("Número de id - " + M.getId_marca_producto() + "\n" + "Nombre de la marca - " + M.getNombre_marca_producto() + "\n");

        }

        System.out.println("El registro se elimino satisfactoriamnete");
        mi_marcaproducto_dao.EliminarMarcaProducto(mi_lista_marcaproducto.get(0));
        mi_lista_marcaproducto = mi_marcaproducto_dao.ConsultarListadoMarcaProducto(2, "Lenovo");

        for (MARCA_PRODUCTO M : mi_lista_marcaproducto) {

            System.out.println("Número de id de marca - " + M.getId_marca_producto() + "\n" + "Nombre de la marca - " + M.getNombre_marca_producto() + "\n");

        }

    }
}
