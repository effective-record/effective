package pruebas;


import controlador.INVENTARIO_DAO;
import modelo.INVENTARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarINVENTARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        INVENTARIO_DAO inventariodao = new INVENTARIO_DAO();
        INVENTARIO mi_inventario = inventariodao.ConsultarInventario(1);

        if (mi_inventario != null) {

            System.out.println("Se realizo la consulta satisfactoriamente de el id del inventario - " + mi_inventario.getId_inventario());

            System.out.println("Entradas - " + mi_inventario.getEntradas());
            System.out.println("Salidas - " + mi_inventario.getSalidas());
            System.out.println("Saldo - " + mi_inventario.getSaldo());

        } else {

            System.out.println("Ha ocurrido un error durante la consulta");

        }

    }

}
