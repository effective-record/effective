package pruebas;


import controlador.PROVEEDORES_DAO;
import java.util.Scanner;
import modelo.PROVEEDORES;

/**
 *
 * @author AndresSaenz
 */
public class pruebaModifiarPROVEEDORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PROVEEDORES_DAO mi_proveedor_dao = new PROVEEDORES_DAO();
        PROVEEDORES mi_proveedor = new PROVEEDORES();

        Scanner teclado = new Scanner(System.in);
        
        String identificacionproveedor = "";
        String nombreproveedor = "";
        String correoproveedor = "";
        String direccionproveedor = "";
        String telefono1proveedor;
        String telefono2proveedor;
        
        
        System.out.println("Ingrese el nuevo número de identificación del proveedor para modificar");
        identificacionproveedor  = teclado.nextLine();
        
        System.out.println("Ingrese el nuevo nombre del proveedor ");
        nombreproveedor = teclado.nextLine();

        System.out.println("Ingrese el nuevo correo del proveedor");
        correoproveedor = teclado.nextLine();

        System.out.println("Ingrese la nueva dirección del proveedor");
        direccionproveedor = teclado.nextLine();

        System.out.println("Ingrese el nueva teléfono del proveedor");
        telefono1proveedor = teclado.nextLine();

        System.out.println("Ingrese el nueva teléfono del proveedor si lo tiene");
        telefono2proveedor = teclado.next();

        mi_proveedor.setIdentificacion_proveedor(identificacionproveedor);
        mi_proveedor.setNombre_proveedor(nombreproveedor);
        mi_proveedor.setCorreo_proveedor(correoproveedor);
        mi_proveedor.setDireccion_proveedor(direccionproveedor);
        mi_proveedor.setTelefono_1_proveedor(telefono1proveedor);
        mi_proveedor.setTelefono_2_proveedor(telefono2proveedor);

        mi_proveedor.setIdentificacion_proveedor(identificacionproveedor);
        String miRespuesta = mi_proveedor_dao.ModificarProveedores(mi_proveedor);

        if (miRespuesta.length() == 0) {

            System.out.println("Modificación exitosa");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }

    }

}
