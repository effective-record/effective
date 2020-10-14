
package pruebas;


import controlador.FORMAS_DE_PAGO_DAO;
import modelo.FORMAS_DE_PAGO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarFORMAS_DE_PAGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FORMAS_DE_PAGO_DAO formasdepagoDao = new FORMAS_DE_PAGO_DAO();
        FORMAS_DE_PAGO mi_forma_de_pago = formasdepagoDao.ConsultarDetalleMovimiento(1);

        if (mi_forma_de_pago != null) {

            System.out.println("Se realizo la consulta satisfactoriamente del numero de forma de pago - " + mi_forma_de_pago.getId_forma_de_pago());
            System.out.println("Tipo de Pago - " + mi_forma_de_pago.getTipo_de_pago());
            
            

        } else {

            System.out.println("Ha ocurrido un error durante la consulta");

        }
        
        
        
    }
    
}
