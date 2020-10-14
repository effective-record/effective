package pruebas;

import controlador.UNIDAD_DE_MEDIDA_PRODUCTO_DAO;
import java.util.ArrayList;
import modelo.UNIDAD_DE_MEDIDA_PRODUCTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarUNIDAD_DE_MEDIDA_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        UNIDAD_DE_MEDIDA_PRODUCTO_DAO mi_unidad_de_medida_dao = new UNIDAD_DE_MEDIDA_PRODUCTO_DAO();
        ArrayList<UNIDAD_DE_MEDIDA_PRODUCTO> mi_lista_unidad_de_medida_producto = mi_unidad_de_medida_dao.ConsultarListarUnidad_de_medida(2, "");

        for (UNIDAD_DE_MEDIDA_PRODUCTO C : mi_lista_unidad_de_medida_producto) {

            System.out.println("Número de id - " + C.getId_unidad_de_medida_producto() + "\n" + "Descripción genero usuario - " + C.getDescripcion_unidad_de_medida_producto());
        }
        System.out.println("El registro se elimino satisfactoriamnete");
        mi_unidad_de_medida_dao.EliminarUnidad_de_medida_producto(mi_lista_unidad_de_medida_producto.get(0));
        mi_lista_unidad_de_medida_producto = mi_unidad_de_medida_dao.ConsultarListarUnidad_de_medida(2, "");

        for (UNIDAD_DE_MEDIDA_PRODUCTO C : mi_lista_unidad_de_medida_producto) {

            System.out.println("Número de id - " + C.getId_unidad_de_medida_producto() + "\n" + "Descripción genero usuario - " + C.getDescripcion_unidad_de_medida_producto());

        }

    }

}
