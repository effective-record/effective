package pruebas;

import controlador.MOVIMIENTO_DAO;
import java.util.Scanner;
import modelo.MOVIMIENTO;

public class pruebaAdicionarMOVIMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MOVIMIENTO_DAO mi_movimiento_dao = new MOVIMIENTO_DAO();
        MOVIMIENTO mi_movimiento = new MOVIMIENTO();

        Scanner teclado = new Scanner(System.in);

        String numero_de_documento;
        String fecha;
        Double subtotal;
        Double total_iva;
        float descuento;
        Double total_factura;
        int DETALLE_MOVIMIENTO_id_detalle_movimiento;
        int FORMAS_DE_PAGO_id_forma_de_pago;
        int TIPO_DE_DOCUMENTO_CONTABLE_id_tipo_de_documento_contable;
        int USUARIOS_id_usuario;

        System.out.println("Por favor ingrese la fecha del movimiento en formato dd/MM/yyyy");
        fecha = teclado.nextLine();

        System.out.println("Por favor ingrese el numero de documento del movimiento");
        numero_de_documento = teclado.nextLine();

        System.out.println("Por favor ingrese el subtotal");
        subtotal = teclado.nextDouble();

        System.out.println("Por favor ingrese el iva");
        total_iva = teclado.nextDouble();

        System.out.println("Por favor ingrese el descuento");
        descuento = teclado.nextFloat();

        System.out.println("Por favor ingrese el total de la factura");
        total_factura = teclado.nextDouble();

        System.out.println("Por favor ingrese la id del detalle movimiento");
        DETALLE_MOVIMIENTO_id_detalle_movimiento = teclado.nextInt();

        System.out.println("Por favor ingrese la id de la forma de pago");
        FORMAS_DE_PAGO_id_forma_de_pago = teclado.nextInt();

        System.out.println("Por favor ingrese la id del tipo de documento contable");
        TIPO_DE_DOCUMENTO_CONTABLE_id_tipo_de_documento_contable = teclado.nextInt();

        System.out.println("Por favor ingrese la id del usuario");
        USUARIOS_id_usuario = teclado.nextInt();

        mi_movimiento.setNumero_de_documento(numero_de_documento);
        mi_movimiento.setFecha(fecha);
        mi_movimiento.setSubtotal(subtotal);
        mi_movimiento.setTotal_iva(total_iva);
        mi_movimiento.setDescuento(descuento);
        mi_movimiento.setTotal_factura(total_factura);
        mi_movimiento.setDETALLE_MOVIMIENTO_id_detalle_movimiento(DETALLE_MOVIMIENTO_id_detalle_movimiento);
        mi_movimiento.setFORMAS_DE_PAGO_id_forma_de_pago(FORMAS_DE_PAGO_id_forma_de_pago);
        mi_movimiento.setTIPO_DE_DOCUMENTO_CONTABLE_id_tipo_de_documento_contable(TIPO_DE_DOCUMENTO_CONTABLE_id_tipo_de_documento_contable);
        mi_movimiento.setUSUARIOS_id_usuario(USUARIOS_id_usuario);
        String miRespuesta = mi_movimiento_dao.Adicionarmovimiento(mi_movimiento);

        if (miRespuesta.length() == 0) {

            System.out.println("Registro exitoso");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }

    }

}
