
package pruebas;


import controlador.TIPO_DE_DOCUMENTO_CONTABLE_DAO;
import modelo.TIPO_DE_DOCUMENTO_CONTABLE;

/**
 *
 * @author AndresSaenz
 */
public class pruebaConsultarTIPO_DOCUMENTO_CONTABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TIPO_DE_DOCUMENTO_CONTABLE_DAO tipodedocumentoDao = new TIPO_DE_DOCUMENTO_CONTABLE_DAO();
        TIPO_DE_DOCUMENTO_CONTABLE mi_tipo_de_documento = tipodedocumentoDao.ConsultarDetalleMovimiento("01");

        if (mi_tipo_de_documento != null) {

            System.out.println("Se realizo la consulta satisfactoriamente del numero de tipo de documento contable - " + mi_tipo_de_documento.getId_tipo_de_documento_contable());
            System.out.println("Codigo - " + mi_tipo_de_documento.getCodigo());
            System.out.println("Descripcion - " + mi_tipo_de_documento.getDescripcion());
            System.out.println("Naturaleza - " + mi_tipo_de_documento.getNaturaleza());

        } else {

            System.out.println("Ha ocurrido un error durante la consulta");

        }

    }

}
