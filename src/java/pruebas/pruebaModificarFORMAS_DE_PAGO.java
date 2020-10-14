package pruebas;


import controlador.FORMAS_DE_PAGO_DAO;
import java.util.Scanner;
import modelo.FORMAS_DE_PAGO;

public class pruebaModificarFORMAS_DE_PAGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FORMAS_DE_PAGO_DAO mi_forma_de_pago_dao = new FORMAS_DE_PAGO_DAO();
        FORMAS_DE_PAGO mi_forma_de_pago = new FORMAS_DE_PAGO();

        Scanner teclado = new Scanner(System.in);

        String tipo_de_pago = "";

        System.out.println("Por favor ingrese el nuevo tipo de pago");
        tipo_de_pago = teclado.next();

        mi_forma_de_pago.setTipo_de_pago(tipo_de_pago);

        mi_forma_de_pago.setId_forma_de_pago(1);

        String miRespuesta = mi_forma_de_pago_dao.ModificarFormas_de_pago(mi_forma_de_pago);

        if (miRespuesta.length() == 0) {

            System.out.println("Modificación exitoso");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }

    }

}
