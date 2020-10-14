package pruebas;

import controlador.CATEGORIA_PRODUCTO_DAO;
import modelo.CATEGORIA_PRODUCTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarCATEGORIA_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CATEGORIA_PRODUCTO_DAO categoria_productoDAO = new CATEGORIA_PRODUCTO_DAO();
        CATEGORIA_PRODUCTO mi_categoria_producto = categoria_productoDAO.Consultarcategoria_producto(1);

        if (mi_categoria_producto != null) {

            System.out.println("Se realizo la consulta satisfactoriamente de la nombre - " + mi_categoria_producto.getNombre_categoria_producto());
            System.out.println("descripcion - " + mi_categoria_producto.getNombre_categoria_producto());

        } else {

            System.out.println("Se a presentado un error durante la consulta");

        }

    }

}
