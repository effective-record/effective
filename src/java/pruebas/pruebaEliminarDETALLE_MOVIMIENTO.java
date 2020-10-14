package pruebas;

import controlador.DETALLE_MOVIMIENTO_DAO;
import java.util.ArrayList;
import modelo.DETALLE_MOVIMIENTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarDETALLE_MOVIMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DETALLE_MOVIMIENTO_DAO mi_detalle_movimiento_dao = new DETALLE_MOVIMIENTO_DAO();
        ArrayList<DETALLE_MOVIMIENTO> mi_lista_detalle_movimiento = mi_detalle_movimiento_dao.ConsultarListadoDetalleMovimiento(1, 20);

        for (DETALLE_MOVIMIENTO C : mi_lista_detalle_movimiento) {

            System.out.println("Número de id - " + C.getId_detalle_movimiento() + "\n" + "cantidad - " + C.getCantidad());
        }
        System.out.println("El registro se elimino satisfactoriamnete");
        mi_detalle_movimiento_dao.EliminarDetalle_movimiento(mi_lista_detalle_movimiento.get(0));
        mi_lista_detalle_movimiento = mi_detalle_movimiento_dao.ConsultarListadoDetalleMovimiento(1, 20);

        for (DETALLE_MOVIMIENTO C : mi_lista_detalle_movimiento) {

            System.out.println("Número de id - " + C.getId_detalle_movimiento() + "\n" + "cantidad - " + C.getCantidad());

        }

    }

}
