
package modelo;

/**
 *
 * @author AndresSossa
 */
public class TIPO_DE_DOCUMENTO_CONTABLE {
    
    private int id_tipo_de_documento_contable;
    private String codigo;
    private String descripcion;
    private String naturaleza;

    public int getId_tipo_de_documento_contable() {
        return id_tipo_de_documento_contable;
    }

    public void setId_tipo_de_documento_contable(int id_tipo_de_documento_contable) {
        this.id_tipo_de_documento_contable = id_tipo_de_documento_contable;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }
   
    
}
