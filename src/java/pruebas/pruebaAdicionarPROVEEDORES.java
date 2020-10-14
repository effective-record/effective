package pruebas;

import controlador.PROVEEDORES_DAO;
import java.util.Scanner;
import modelo.PROVEEDORES;

/**
 *
 * @author YesidValencia
 */
public class pruebaAdicionarPROVEEDORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PROVEEDORES_DAO mi_proveedor_dao = new PROVEEDORES_DAO();
        PROVEEDORES mi_PROVEEDORES = new PROVEEDORES();
        
        Scanner teclado = new Scanner(System.in);
        
        String identificacionproveedor = "";
        String nombreproveedor = "";
        String correoproveedor = "";
        String direccionproveedor = "";
        String telefono1proveedor;
        String telefono2proveedor;
        
        System.out.println("Por favor ingrese el número de identificación del proveedor");
        identificacionproveedor = teclado.nextLine();
        
        System.out.println("Por favor ingrese el nombre del proveedor");
        nombreproveedor = teclado.nextLine();
        
        System.out.println("Por favor ingrese el correo del proveedor");
        correoproveedor = teclado.nextLine();
        
        System.out.println("Por favor ingrese la direccion del proveedor");
        direccionproveedor = teclado.nextLine();
        
        System.out.println("Por favor ingrese el primer teléfono del proveedor");
        telefono1proveedor = teclado.nextLine();
        
        System.out.println("Si el proveedor cuenta con otro número ingreselo");
        telefono2proveedor = teclado.next();
        
        mi_PROVEEDORES.setIdentificacion_proveedor(identificacionproveedor);
        mi_PROVEEDORES.setNombre_proveedor(nombreproveedor);
        mi_PROVEEDORES.setCorreo_proveedor(correoproveedor);
        mi_PROVEEDORES.setDireccion_proveedor(direccionproveedor);
        mi_PROVEEDORES.setTelefono_1_proveedor(telefono1proveedor);
        mi_PROVEEDORES.setTelefono_2_proveedor(telefono2proveedor);
        String miRespuesta = mi_proveedor_dao.AdicionarProveedores(mi_PROVEEDORES);
        
        if (miRespuesta.length() == 0) {
            
            System.out.println("Registro exitoso");
            
        } else {
            
            System.out.println("Ocurrio un error" + miRespuesta);
            
        }
        
    }
    
}
