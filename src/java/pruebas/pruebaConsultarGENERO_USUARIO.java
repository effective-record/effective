
package pruebas;


import controlador.GENERO_USUARIO_DAO;
import modelo.GENERO_USUARIO;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarGENERO_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GENERO_USUARIO_DAO mi_genero_usuario_dao = new GENERO_USUARIO_DAO();
        GENERO_USUARIO mi_genero_usuario = mi_genero_usuario_dao.ConsultarGenero_usuario(1);
        

        if (mi_genero_usuario != null) {

            System.out.println("Se realizo la consulta satisfactoriamente del genero del usuario - " + mi_genero_usuario.getId_genero_usuario());
            System.out.println("Descripción del genero del usuario - " + mi_genero_usuario.getDescripcion_genero_usuario());

        } else {

            System.out.println("Ha ocurrido un error durante la consulta");

        }

    }
        
        
       
    }
    
