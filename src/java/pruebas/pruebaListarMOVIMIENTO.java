
package pruebas;

import controlador.MOVIMIENTO_DAO;
import java.util.ArrayList;
import modelo.MOVIMIENTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarMOVIMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       MOVIMIENTO_DAO movimiento_dao = new MOVIMIENTO_DAO();
       ArrayList<MOVIMIENTO> mi_movimiento = new ArrayList<MOVIMIENTO>();
       mi_movimiento = movimiento_dao.ConsultarListadoMovimiento("","");
       
       int size=mi_movimiento.size();
       System.out.println("<table border=\"1\")><br><td>id_movimiento</td><td>numero_de_documento</td><td>fecha</td><td>subtotal</td><td>total_iva</td><td>descuento</td><td>total_factura</td><td>DETALLE_MOVIMIENTO_id_detalle_movimiento</td><td>FORMAS_DE_PAGO_id_forma_de_pago</td><td>TIPO_DE_DOCUMENTO_CONTABLE_id_tipo_de_documento_contable</td><td>USUARIOS_id_usuario</td>");
       
       for (MOVIMIENTO U :mi_movimiento){
           System.out.println("<tr>");
           System.out.println("<td>" + U.getId_movimiento() + "</td>");
           System.out.println("<td>" + U.getNumero_de_documento() + "</td>");
           System.out.println("<td>" + U.getFecha() + "</td>");
           System.out.println("<td>" + U.getSubtotal() + "</td>");
           System.out.println("<td>" + U.getTotal_iva() + "</td>");
           System.out.println("<td>" + U.getDescuento() + "</td>");
           System.out.println("<td>" + U.getTotal_factura() + "</td>");
           System.out.println("<td>" + U.getDETALLE_MOVIMIENTO_id_detalle_movimiento() + "</td>");
           System.out.println("<td>" + U.getFORMAS_DE_PAGO_id_forma_de_pago() + "</td>");
           System.out.println("<td>" + U.getTIPO_DE_DOCUMENTO_CONTABLE_id_tipo_de_documento_contable() + "</td>");
           System.out.println("<td>" + U.getUSUARIOS_id_usuario() + "</td>");
           System.out.println("<tr>");
       }
       System.out.println("</table>");
    }
    
}

       
        
    
    
