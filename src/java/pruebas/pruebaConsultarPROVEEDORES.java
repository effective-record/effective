package pruebas;


import controlador.PROVEEDORES_DAO;
import modelo.PROVEEDORES;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarPROVEEDORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PROVEEDORES_DAO mi_proveedor_dao = new PROVEEDORES_DAO();
        PROVEEDORES miproveedor = mi_proveedor_dao.ConsultarProveedor("1");

        if (miproveedor != null) {
            
            System.out.println("Se realizo la consulta satisfactoriamnete de la identificación del proveedor - " + miproveedor.getIdentificacion_proveedor());
            System.out.println("Id proveedor - " + miproveedor.getId_proveedor() );
            System.out.println("Nombre del  - " + miproveedor.getNombre_proveedor());
            System.out.println("Corre del proveedor - " + miproveedor.getCorreo_proveedor());
            System.out.println("Dirección del proveedor - " + miproveedor.getDireccion_proveedor());
            System.out.println("Telefono 1 del proveedor - " + miproveedor.getTelefono_1_proveedor());
            System.out.println("Telefono 2 del proveedor - " + miproveedor.getTelefono_2_proveedor());

        } else {

            System.out.println("Ha ocurrido un error durante la consulta");

        }

    }

}
