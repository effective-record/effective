
package pruebas;

import controlador.MOVIMIENTO_DAO;
import java.util.ArrayList;
import modelo.MOVIMIENTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarMOVIMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MOVIMIENTO_DAO mi_movimiento_dao = new MOVIMIENTO_DAO();
        ArrayList<MOVIMIENTO> mi_lista_movimiento = mi_movimiento_dao.ConsultarListadoMovimiento("01", "13/02/2019");

        for (MOVIMIENTO C : mi_lista_movimiento) {

            System.out.println("Número de id - " + C.getId_movimiento() + "\n" + "Numero de documento - " + C.getNumero_de_documento() + "\n" + "Fecha - " + C.getFecha()+ "\n" + "Subtotal - " + C.getSubtotal()+ "\n" + "Total iva - " + C.getTotal_iva() + "\n" + "Descuento - " + C.getDescuento()+ "\n" + "Total factura - " + C.getTotal_factura()+ "\n" + "Id detalle movimiento - " + C.getDETALLE_MOVIMIENTO_id_detalle_movimiento()+ "\n" + "Id forma de pago - " + C.getFORMAS_DE_PAGO_id_forma_de_pago()+ "\n" + "Id tipo de documento contable - " + C.getTIPO_DE_DOCUMENTO_CONTABLE_id_tipo_de_documento_contable()+ "\n" + "Id usuario - " + C.getUSUARIOS_id_usuario()+ "\n");

        }

        System.out.println("El registro se elimino satisfactoriamnete");
        mi_movimiento_dao.EliminarMovimiento(mi_lista_movimiento.get(0));
        mi_lista_movimiento = mi_movimiento_dao.ConsultarListadoMovimiento("01", "13/02/2019");

        for (MOVIMIENTO C : mi_lista_movimiento) {

            System.out.println("Número de id - " + C.getId_movimiento() + "\n" + "Numero de documento - " + C.getNumero_de_documento() + "\n" + "Fecha - " + C.getFecha()+ "\n" + "Subtotal - " + C.getSubtotal()+ "\n" + "Total iva - " + C.getTotal_iva() + "\n" + "Descuento - " + C.getDescuento()+ "\n" + "Total factura - " + C.getTotal_factura()+ "\n" + "Id detalle movimiento - " + C.getDETALLE_MOVIMIENTO_id_detalle_movimiento()+ "\n" + "Id forma de pago - " + C.getFORMAS_DE_PAGO_id_forma_de_pago()+ "\n" + "Id tipo de documento contable - " + C.getTIPO_DE_DOCUMENTO_CONTABLE_id_tipo_de_documento_contable()+ "\n" + "Id usuario - " + C.getUSUARIOS_id_usuario()+ "\n");

        }

    }

}
        
    
    

