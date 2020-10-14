package pruebas;


import controlador.INVENTARIO_DAO;
import java.util.Scanner;
import modelo.INVENTARIO;

public class pruebaModificarINVENTARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        INVENTARIO_DAO mi_inventario_dao = new INVENTARIO_DAO();
        INVENTARIO mi_inventario = new INVENTARIO();

        Scanner teclado = new Scanner(System.in);

        int entradas;
        int salidas;
        int saldo;

        System.out.println("Ingrese las nuevas entradas");
        entradas = teclado.nextInt();

        System.out.println("Ingrese las nuevas salidas");
        salidas = teclado.nextInt();

        System.out.println("Ingrese el nuevo saldo");
        saldo = teclado.nextInt();

        mi_inventario.setEntradas(entradas);
        mi_inventario.setSalidas(salidas);
        mi_inventario.setSaldo(saldo);

        mi_inventario.setId_inventario(1);
        String miRespuesta = mi_inventario_dao.ModificarInventario(mi_inventario);

        if (miRespuesta.length() == 0) {
            System.out.println("Usuario actualizado");

        } else {
            System.out.println("Error" + miRespuesta);

        }

    }

}
