package pruebas;

import controlador.MOVIMIENTO_DAO;
import modelo.MOVIMIENTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarMOVIMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MOVIMIENTO_DAO MovimientoDao = new MOVIMIENTO_DAO();
        MOVIMIENTO mi_movimiento = MovimientoDao.ConsultarDetalleMovimiento("1");

        if (mi_movimiento != null) {

            System.out.println("Se realizo la consulta satisfactoriamente del numero del movimiento - " + mi_movimiento.getId_movimiento());
            System.out.println("Número de documento - " + mi_movimiento.getNumero_de_documento());
            System.out.println("Fecha movimiento- " + mi_movimiento.getFecha());
            System.out.println("Subtotal movimiento - " + mi_movimiento.getSubtotal());
            System.out.println("Total iva- " + mi_movimiento.getTotal_iva());
            System.out.println("Id descuento- " + mi_movimiento.getDescuento());
            System.out.println("Id detalle movimiento - " + mi_movimiento.getDETALLE_MOVIMIENTO_id_detalle_movimiento());
            System.out.println("Id forma de pago - " + mi_movimiento.getFORMAS_DE_PAGO_id_forma_de_pago());
            System.out.println("Id documento contable - " + mi_movimiento.getTIPO_DE_DOCUMENTO_CONTABLE_id_tipo_de_documento_contable());
            System.out.println("Id usuarios - " + mi_movimiento.getUSUARIOS_id_usuario());

        } else {

            System.out.println("Ha ocurrido un error durante la consulta");

        }

    }

}
