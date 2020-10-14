/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.TIPO_DE_DOCUMENTO_CONTABLE_DAO;
import java.util.ArrayList;
import modelo.TIPO_DE_DOCUMENTO_CONTABLE;

/**
 *
 * @author AndresSaenz
 */
public class pruebaEliminarTIPO_DE_DOCUMENTO_CONTABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TIPO_DE_DOCUMENTO_CONTABLE_DAO mi_tipo_documento_dao = new TIPO_DE_DOCUMENTO_CONTABLE_DAO();
        ArrayList<TIPO_DE_DOCUMENTO_CONTABLE> mi_lista_tipo_de_documento = mi_tipo_documento_dao.ConsultarListadoTipoDocumento("02", "Resibo de pago");

        for (TIPO_DE_DOCUMENTO_CONTABLE C : mi_lista_tipo_de_documento) {

            System.out.println("Número de id - " + C.getId_tipo_de_documento_contable() + "\n" + "Codigo - " + C.getCodigo() + "\n" + "Descripcion -" + C.getDescripcion()+ "\n");
        } 
        System.out.println("El registro se elimino satisfactoriamnete");
        mi_tipo_documento_dao.EliminarTipo_de_Documento_Contable(mi_lista_tipo_de_documento.get(0));
        mi_lista_tipo_de_documento = mi_tipo_documento_dao.ConsultarListadoTipoDocumento("02", "Resio de pago");

        for (TIPO_DE_DOCUMENTO_CONTABLE C : mi_lista_tipo_de_documento) {

            System.out.println("Número de id - " + C.getId_tipo_de_documento_contable() + "\n" + "Codigo - " + C.getCodigo() + "\n" + "Descripcion -" + C.getDescripcion()+ "\n");
        } 

    }

}

    
    

