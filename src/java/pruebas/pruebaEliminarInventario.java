package pruebas;

import controlador.INVENTARIO_DAO;
import java.util.ArrayList;
import modelo.INVENTARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        INVENTARIO_DAO mi_inventario_dao = new INVENTARIO_DAO();
        ArrayList<INVENTARIO> mi_lista_inventario = mi_inventario_dao.ConsultarListadoInventario(2,50,10);

        for (INVENTARIO I : mi_lista_inventario) {

            System.out.println("Número de id del inventario - " + I.getId_inventario() + "\n" + "Entradas - " + I.getEntradas() + "\n" + "Salidas - " + I.getSalidas() + "\n");

        }

        System.out.println("El registro se elimino satisfactoriamnete");
        mi_inventario_dao.EliminarInventario(mi_lista_inventario.get(0));
        mi_lista_inventario = mi_inventario_dao.ConsultarListadoInventario(2,50,10);

        for (INVENTARIO I : mi_lista_inventario) {

            System.out.println("Número de id del inventario - " + I.getId_inventario() + "\n" + "Entradas - " + I.getEntradas() + "\n" + "Salidas - " + I.getSalidas() + "\n");

        }

    }

}
