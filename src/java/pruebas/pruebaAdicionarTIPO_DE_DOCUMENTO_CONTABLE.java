
package pruebas;

import controlador.TIPO_DE_DOCUMENTO_CONTABLE_DAO;
import java.util.Scanner;
import modelo.TIPO_DE_DOCUMENTO_CONTABLE;


public class pruebaAdicionarTIPO_DE_DOCUMENTO_CONTABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TIPO_DE_DOCUMENTO_CONTABLE_DAO mi_tipo_de_documento_dao = new TIPO_DE_DOCUMENTO_CONTABLE_DAO();
        TIPO_DE_DOCUMENTO_CONTABLE mi_tipo_de_documento = new TIPO_DE_DOCUMENTO_CONTABLE();

        Scanner teclado = new Scanner(System.in);

        String codigo = "";
        String descripcion ="";
        String naturaleza = "";
        

        System.out.println("Por favor ingrese el codigo ");
        codigo = teclado.nextLine();
        
        System.out.println("Por favor ingrese la descripcion");
        descripcion = teclado.nextLine();
        
        System.out.println("Por favor ingrese la naturaleza");
        naturaleza = teclado.nextLine();
        

        mi_tipo_de_documento.setCodigo(codigo);
        mi_tipo_de_documento.setDescripcion(descripcion);
        mi_tipo_de_documento.setNaturaleza(naturaleza);
        String miRespuesta = mi_tipo_de_documento_dao.AdicionarTipo_de_Documento_Contable(mi_tipo_de_documento);

        if (miRespuesta.length() == 0) {

            System.out.println("Registro exitoso");

        } else {

            System.out.println("Ocurrio un error" + miRespuesta);

        }
        
        
    }
    
}
