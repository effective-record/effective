package pruebas;


import controlador.MARCA_PRODUCTO_DAO;
import modelo.MARCA_PRODUCTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarMARCA_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MARCA_PRODUCTO_DAO marcaproductodao = new MARCA_PRODUCTO_DAO();
        MARCA_PRODUCTO mi_marcaproducto = marcaproductodao.ConsultarMarcaProducto(1);

        if (mi_marcaproducto != null) {

            System.out.println("Se realizo la consulta satisfactoriamente de el id de la marca del producto - " + mi_marcaproducto.getId_marca_producto());
            System.out.println("descripcion del nombre del prodcuto - " + mi_marcaproducto.getNombre_marca_producto());

        } else {

            System.out.println("Ha ocurrido un error durante la consulta");

        }

    }

}
