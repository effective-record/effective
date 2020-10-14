package pruebas;

import controlador.FORMAS_DE_PAGO_DAO;
import java.util.ArrayList;
import modelo.FORMAS_DE_PAGO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarFORMAS_DE_PAGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FORMAS_DE_PAGO_DAO forma_de_pago_dao = new FORMAS_DE_PAGO_DAO();
        ArrayList<FORMAS_DE_PAGO> mi_forma_de_pago = new ArrayList<FORMAS_DE_PAGO>();
        mi_forma_de_pago = forma_de_pago_dao.ConsultarListadoFormasdePago(1, "");

        int size = mi_forma_de_pago.size();
        System.out.println("<table border=\"1\")><br><td>id_forma_de_pago</td><td>tipo_de_pago</td>");

        for (FORMAS_DE_PAGO U : mi_forma_de_pago) {
            System.out.println("<tr>");
            System.out.println("<td>" + U.getId_forma_de_pago() + "</td>");
            System.out.println("<td>" + U.getTipo_de_pago() + "</td>");
            System.out.println("<tr>");
        }
        System.out.println("</table>");
    }

}
