package pruebas;


import controlador.UNIDAD_DE_MEDIDA_PRODUCTO_DAO;
import modelo.UNIDAD_DE_MEDIDA_PRODUCTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarUNIDAD_DE_MEDIDA_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        UNIDAD_DE_MEDIDA_PRODUCTO_DAO unidad_de_medida_productoDao = new UNIDAD_DE_MEDIDA_PRODUCTO_DAO();
        UNIDAD_DE_MEDIDA_PRODUCTO mi_unidad_de_medida_producto = unidad_de_medida_productoDao.Consultarunidad_de_medida_producto(1);

        if (mi_unidad_de_medida_producto != null) {
            
            System.out.println("Se realizo la consulta satisfactoriamente de la unidad de medida - " + mi_unidad_de_medida_producto.getId_unidad_de_medida_producto());
            System.out.println("Descripción - " + mi_unidad_de_medida_producto.getDescripcion_unidad_de_medida_producto());
        } else {

            System.out.println("Ha ocurrido un error ");

        }

    }

}
