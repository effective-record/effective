package pruebas;


import controlador.ESTADO_PRODUCTO_DAO;
import modelo.ESTADO_PRODUCTO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarESTADO_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ESTADO_PRODUCTO_DAO estadoproductodao = new ESTADO_PRODUCTO_DAO();
        ESTADO_PRODUCTO mi_estadoproducto = estadoproductodao.ConsultarEstadoProducto(1);

        if (mi_estadoproducto != null) {

            System.out.println("Se realizo la consulta satisfactoriamente de el id del estado del producto - " + mi_estadoproducto.getId_estado_producto());
            System.out.println("descripcion de estado del prodcuto - " + mi_estadoproducto.getDescripcion_estado_producto());

        } else {

            System.out.println("Ha ocurrido un error durante la consulta");

        }

    }

}
