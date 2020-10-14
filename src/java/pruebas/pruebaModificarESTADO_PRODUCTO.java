package pruebas;


import controlador.ESTADO_PRODUCTO_DAO;
import java.util.Scanner;
import modelo.ESTADO_PRODUCTO;

public class pruebaModificarESTADO_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ESTADO_PRODUCTO_DAO mi_estado_producto_dao = new ESTADO_PRODUCTO_DAO();
        ESTADO_PRODUCTO mi_estado_producto = new ESTADO_PRODUCTO();

        Scanner teclado = new Scanner(System.in);

        String descripcion_estado_producto = "";

        System.out.println("Por favor ingrdese la descripcion del nuevo estado del producto");
        descripcion_estado_producto = teclado.nextLine();

        mi_estado_producto.setDescripcion_estado_producto(descripcion_estado_producto);

        mi_estado_producto.setId_estado_producto(1);
        String miRespuesta = mi_estado_producto_dao.ActualizarEstadoProducto(mi_estado_producto);

        if (miRespuesta.length() == 0) {
            System.out.println("Usuario actualizado");

        } else {
            System.out.println("Error" + miRespuesta);
        }

    }
}
