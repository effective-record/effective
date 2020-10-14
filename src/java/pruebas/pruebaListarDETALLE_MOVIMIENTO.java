package pruebas;

import controlador.DETALLE_MOVIMIENTO_DAO;
import java.util.ArrayList;
import modelo.DETALLE_MOVIMIENTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarDETALLE_MOVIMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DETALLE_MOVIMIENTO_DAO detalle_movimiento_dao = new DETALLE_MOVIMIENTO_DAO();
        ArrayList<DETALLE_MOVIMIENTO> mi_detalle_movimiento = new ArrayList<DETALLE_MOVIMIENTO>();
        mi_detalle_movimiento = detalle_movimiento_dao.ConsultarListadoDetalleMovimiento(0, 0);
        
       
       int size = mi_detalle_movimiento.size();
        System.out.println("<table border=\"1\")><br><td>id_detalle_movimiento</td><td>cantidad</td><td>precio_productos</td><td>iva_productos</td><td>total_productos</td><td>PRODUCTOS_id_producto</td>");

        for (DETALLE_MOVIMIENTO U : mi_detalle_movimiento) {
            System.out.println("<tr>");
            System.out.println("<td>" + U.getId_detalle_movimiento() + "</td>");
            System.out.println("<td>" + U.getCantidad() + "</td>");
            System.out.println("<td>" + U.getPrecio_productos() + "</td>");
            System.out.println("<td>" + U.getIva_productos() + "</td>");
            System.out.println("<td>" + U.getTotal_productos() + "</td>");
            System.out.println("<td>" + U.getPRODUCTOS_id_producto() + "</td>");
            System.out.println("<tr>");
        }
        System.out.println("</table>");
    }
}
