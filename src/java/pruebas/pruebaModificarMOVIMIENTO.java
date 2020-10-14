package pruebas;


import controlador.MOVIMIENTO_DAO;
import java.util.Scanner;
import modelo.MOVIMIENTO;

public class pruebaModificarMOVIMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MOVIMIENTO_DAO mi_movimiento_dao = new MOVIMIENTO_DAO();
        MOVIMIENTO mi_movimiento = new MOVIMIENTO();

        Scanner teclado = new Scanner(System.in);

        String numero_de_documento;
        String fecha = "";
        double subtotal;
        double total_iva;
        float descuento;
        double total_factura;

        System.out.println("Por favor ingrese el numero del documento al cual quiere modificarle los datos");
        numero_de_documento = teclado.nextLine();

        System.out.println("Por favor ingrese la fecha");
        fecha = teclado.next();

        System.out.println("Por favor ingrese el subtotal");
        subtotal = teclado.nextDouble();

        System.out.println("Por favor ingrese el iva");
        total_iva = teclado.nextDouble();

        System.out.println("Por favor ingrese el descuento");
        descuento = teclado.nextFloat();

        System.out.println("Por favor ingrese el total de factura");
        total_factura = teclado.nextDouble();

        mi_movimiento.setNumero_de_documento(numero_de_documento);
        mi_movimiento.setFecha(fecha);
        mi_movimiento.setSubtotal(subtotal);
        mi_movimiento.setTotal_iva(total_iva);
        mi_movimiento.setDescuento(descuento);
        mi_movimiento.setTotal_factura(total_factura);

        mi_movimiento.setNumero_de_documento(numero_de_documento); ///Aca ingresa el numero del movimiento al cual quiere modificarle los datos
        mi_movimiento.setDETALLE_MOVIMIENTO_id_detalle_movimiento(1);
        mi_movimiento.setFORMAS_DE_PAGO_id_forma_de_pago(1);
        mi_movimiento.setTIPO_DE_DOCUMENTO_CONTABLE_id_tipo_de_documento_contable(1);
        mi_movimiento.setUSUARIOS_id_usuario(3);

        String miRespuesta = mi_movimiento_dao.ModificarMovimiento(mi_movimiento);

        if (miRespuesta.length() == 0) {

            System.out.println("Modificación exitosa");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }

    }

}
