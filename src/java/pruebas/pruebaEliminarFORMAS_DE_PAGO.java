package pruebas;

import controlador.FORMAS_DE_PAGO_DAO;
import java.util.ArrayList;
import modelo.FORMAS_DE_PAGO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarFORMAS_DE_PAGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FORMAS_DE_PAGO_DAO mi_forma_de_pago_dao = new FORMAS_DE_PAGO_DAO();
        ArrayList<FORMAS_DE_PAGO> mi_lista_formas_de_pago = mi_forma_de_pago_dao.ConsultarListadoFormasdePago(2, "Debito");

        for (FORMAS_DE_PAGO C : mi_lista_formas_de_pago) {

            System.out.println("Número de id - " + C.getId_forma_de_pago() + "\n" + "Tipo de pago - " + C.getTipo_de_pago() + "\n");

        }

        System.out.println("El registro se elimino satisfactoriamnete");
        mi_forma_de_pago_dao.EliminarFormas_de_pago(mi_lista_formas_de_pago.get(0));
        mi_lista_formas_de_pago = mi_forma_de_pago_dao.ConsultarListadoFormasdePago(2, "Debito");

        for (FORMAS_DE_PAGO C : mi_lista_formas_de_pago) {

            System.out.println("Número de id - " + C.getId_forma_de_pago() + "\n" + "Tipo de pago - " + C.getTipo_de_pago());

        }

    }

}
