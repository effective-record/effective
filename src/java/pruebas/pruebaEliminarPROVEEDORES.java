
package pruebas;

import controlador.PROVEEDORES_DAO;
import java.util.ArrayList;
import modelo.PROVEEDORES;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarPROVEEDORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PROVEEDORES_DAO mi_proveedor_dao = new PROVEEDORES_DAO();
        ArrayList<PROVEEDORES> mi_lista_proveedor = mi_proveedor_dao.ConsultarListadoProveedor("02","Scribe");

        for (PROVEEDORES C : mi_lista_proveedor) {

            System.out.println("Número de id - " + C.getId_proveedor()+ "\n" + "Nombre de proveedor - " + C.getNombre_proveedor() + "\n" + "Correo proveedor - " + C.getCorreo_proveedor()+ "\n" + "Dirección proveedor" + C.getDireccion_proveedor() + "\n" + "Telefono 1 proveedor" + C.getTelefono_1_proveedor() + "\n" + "Telefono 2 proveedor" + C.getTelefono_2_proveedor() + "\n");

        }

        System.out.println("El registro se elimino satisfactoriamnete");
        mi_proveedor_dao.EliminarProveedores(mi_lista_proveedor.get(0));
        mi_lista_proveedor = mi_proveedor_dao.ConsultarListadoProveedor("02","Scribe");

        for (PROVEEDORES C : mi_lista_proveedor) {

             System.out.println("Número de id - " + C.getId_proveedor()+ "\n" + "Nombre de proveedor - " + C.getNombre_proveedor() + "\n" + "Correo proveedor - " + C.getCorreo_proveedor()+ "\n" + "Dirección proveedor" + C.getDireccion_proveedor() + "\n" + "Telefono 1 proveedor" + C.getTelefono_1_proveedor() + "\n" + "Telefono 2 proveedor" + C.getTelefono_2_proveedor() + "\n");

        }
       
        
    }
    
}
