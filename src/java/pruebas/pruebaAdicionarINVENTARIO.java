package pruebas;

import controlador.INVENTARIO_DAO;
import java.util.Scanner;
import modelo.INVENTARIO;

public class pruebaAdicionarINVENTARIO {

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
        
        System.out.println("Por favor ingrese el número de entradas del producto");
        entradas = teclado.nextInt();
        
        System.out.println("Por favor ingrese el número de salidas del producto");
        salidas = teclado.nextInt();
        
        System.out.println("Ingrese el saldo");
        saldo = teclado.nextInt();
        
        mi_inventario.setEntradas(entradas);
        mi_inventario.setSalidas(salidas);
        mi_inventario.setSaldo(saldo);
        String miRespuesta = mi_inventario_dao.AdicionarInventario(mi_inventario);
        
        if (miRespuesta.length() == 0) {
            
            System.out.println("Registro exitoso");
            
        } else {
            System.out.println("Ocurrio un error");
        }
    }
    
}
