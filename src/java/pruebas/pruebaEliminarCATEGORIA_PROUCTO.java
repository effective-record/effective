package pruebas;

import controlador.CATEGORIA_PRODUCTO_DAO;
import java.util.ArrayList;
import modelo.CATEGORIA_PRODUCTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarCATEGORIA_PROUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CATEGORIA_PRODUCTO_DAO Categoria_productoDAO = new CATEGORIA_PRODUCTO_DAO();
        ArrayList<CATEGORIA_PRODUCTO> mi_lista_Categoria_producto = Categoria_productoDAO.ConsultarListadoCategoria_producto(1, "");

        for (CATEGORIA_PRODUCTO C : mi_lista_Categoria_producto) {

            System.out.println(" id_categoria_producto : " + "\n" + C.getId_categoria_producto() + "nombre_categoria_producto" + C.getNombre_categoria_producto() + "\n");

        }

        System.out.println("Se elimino el registro satisfactoriamente");

        Categoria_productoDAO.EliminarCategoria_producto(mi_lista_Categoria_producto.get(0));
        mi_lista_Categoria_producto = Categoria_productoDAO.ConsultarListadoCategoria_producto(1, "");

        for (CATEGORIA_PRODUCTO C : mi_lista_Categoria_producto) {

            System.out.println(" id_categoria_producto : " + "\n" + C.getId_categoria_producto() + "\n" + "nombre_categoria_producto" + C.getNombre_categoria_producto() + "\n");
        }
    }

}
    
