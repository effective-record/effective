package pruebas;

import controlador.TIPO_DE_DOCUMENTO_CONTABLE_DAO;
import java.util.ArrayList;
import modelo.TIPO_DE_DOCUMENTO_CONTABLE;

/**
 *
 * @author AndresSaenz
 */
public class pruebaListarTIPO_DE_DOCUMENTO_CONTABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TIPO_DE_DOCUMENTO_CONTABLE_DAO tipo_de_documento_dao = new TIPO_DE_DOCUMENTO_CONTABLE_DAO();
        ArrayList<TIPO_DE_DOCUMENTO_CONTABLE> mi_tipo_de_documento = new ArrayList<TIPO_DE_DOCUMENTO_CONTABLE>();
        mi_tipo_de_documento = tipo_de_documento_dao.ConsultarListadoTipoDocumento("", "");

        int size = mi_tipo_de_documento.size();
        System.out.println("<table border=\"1\")><br><td>id_tipo_de_documento_contable</td><td>codigo</td><td>descripcion</td><td>naturaleza</td>");

        for (TIPO_DE_DOCUMENTO_CONTABLE U : mi_tipo_de_documento) {
            System.out.println("<tr>");
            System.out.println("<td>" + U.getId_tipo_de_documento_contable() + "</td>");
            System.out.println("<td>" + U.getCodigo() + "</td>");
            System.out.println("<td>" + U.getDescripcion() + "</td>");
            System.out.println("<td>" + U.getNaturaleza() + "</td>");
            System.out.println("<tr>");
        }
        System.out.println("</table>");
    }
}
