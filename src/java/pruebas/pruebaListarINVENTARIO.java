package pruebas;

import controlador.INVENTARIO_DAO;
import java.util.ArrayList;
import modelo.INVENTARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarINVENTARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        INVENTARIO_DAO inventario_dao = new INVENTARIO_DAO();
        ArrayList<INVENTARIO> mi_inventario = new ArrayList<INVENTARIO>();
        mi_inventario = inventario_dao.ConsultarListadoInventario(0,0,0);

        int size = mi_inventario.size();
        System.out.println("<table border=\"1\")><br><td>id_inventario</td><td>entradas</td><td>salidas</td><td>saldo</td>");

        for (INVENTARIO I : mi_inventario) {

            System.out.println("<tr>");
            System.out.println("<td>" + I.getId_inventario() + "</td>");
            System.out.println("<td>" + I.getEntradas() + "</td>");
            System.out.println("<td>" + I.getSalidas() + "</td>");
            System.out.println("<td>" + I.getSaldo() + "</td>");
            System.out.println("</tr>");

        }

        System.out.println("</table>");

    }

}
