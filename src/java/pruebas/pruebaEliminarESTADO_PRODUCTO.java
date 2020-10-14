package pruebas;

import controlador.ESTADO_PRODUCTO_DAO;
import java.util.ArrayList;
import modelo.ESTADO_PRODUCTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarESTADO_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ESTADO_PRODUCTO_DAO mi_estado_producto_dao = new ESTADO_PRODUCTO_DAO();
        ArrayList<ESTADO_PRODUCTO> mi_lista_estado_producto = mi_estado_producto_dao.ConsultarListadoEstadoProducto(1, "");

        for (ESTADO_PRODUCTO C : mi_lista_estado_producto) {

            System.out.println("Número de id - " + C.getId_estado_producto() + "\n" + "Descripción estado usuario - " + C.getDescripcion_estado_producto());
        }
        System.out.println("El registro se elimino satisfactoriamnete");
        mi_estado_producto_dao.EliminarEstado_producto(mi_lista_estado_producto.get(0));
        mi_lista_estado_producto = mi_estado_producto_dao.ConsultarListadoEstadoProducto(1, "");

        for (ESTADO_PRODUCTO C : mi_lista_estado_producto) {

            System.out.println("Número de id - " + C.getId_estado_producto() + "\n" + "Descripción estado usuario - " + C.getDescripcion_estado_producto());

        }

    }
}
