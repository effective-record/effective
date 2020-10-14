package pruebas;


import controlador.DETALLE_MOVIMIENTO_DAO;
import modelo.DETALLE_MOVIMIENTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarDETALLE_MOVIMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DETALLE_MOVIMIENTO_DAO detalleMovimientoDao = new DETALLE_MOVIMIENTO_DAO();
        DETALLE_MOVIMIENTO mi_detalle_movimiento = detalleMovimientoDao.ConsultarDetalleMovimiento(1);

        if (mi_detalle_movimiento != null) {

            System.out.println("Se realizo la consulta satisfactoriamente del numero de movimiento - " + mi_detalle_movimiento.getId_detalle_movimiento());
            System.out.println("Cantidad - " + mi_detalle_movimiento.getCantidad());
            System.out.println("Precio Productos- " + mi_detalle_movimiento.getPrecio_productos());
            System.out.println("Iva - " + mi_detalle_movimiento.getIva_productos());
            System.out.println("Total Productos - " + mi_detalle_movimiento.getTotal_productos());
            System.out.println("Id Producto - " + mi_detalle_movimiento.getPRODUCTOS_id_producto());

        } else {

            System.out.println("Ha ocurrido un error durante la consulta");

        }

    }

}
