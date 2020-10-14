package modelo;

/**
 *
 * @author LadyChitivo
 */
public class PRODUCTOS {

    private int id_producto;
    private String nombre_producto;
    private double precio_producto;
    private String descripcion_producto;
    private int cantidad_producto;
    private double iva_producto;
    private int UNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto;
    private int PROVEEDORES_id_proveedor;
    private int CATEGORIA_PRODUCTO_id_categoria_producto;
    private int ESTADO_PRODUCTO_id_estado_producto;
    private int MARCA_PRODUCTO_id_marca_producto;
    private int INVENTARIO_id_inventario;

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public double getIva_producto() {
        return iva_producto;
    }

    public void setIva_producto(double iva_producto) {
        this.iva_producto = iva_producto;
    }

    public int getUNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto() {
        return UNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto;
    }

    public void setUNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto(int UNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto) {
        this.UNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto = UNIDAD_DE_MEDIDA_PRODUCTO_id_unidad_de_medida_producto;
    }

    public int getPROVEEDORES_id_proveedor() {
        return PROVEEDORES_id_proveedor;
    }

    public void setPROVEEDORES_id_proveedor(int PROVEEDORES_id_proveedor) {
        this.PROVEEDORES_id_proveedor = PROVEEDORES_id_proveedor;
    }

    public int getCATEGORIA_PRODUCTO_id_categoria_producto() {
        return CATEGORIA_PRODUCTO_id_categoria_producto;
    }

    public void setCATEGORIA_PRODUCTO_id_categoria_producto(int CATEGORIA_PRODUCTO_id_categoria_producto) {
        this.CATEGORIA_PRODUCTO_id_categoria_producto = CATEGORIA_PRODUCTO_id_categoria_producto;
    }

    public int getESTADO_PRODUCTO_id_estado_producto() {
        return ESTADO_PRODUCTO_id_estado_producto;
    }

    public void setESTADO_PRODUCTO_id_estado_producto(int ESTADO_PRODUCTO_id_estado_producto) {
        this.ESTADO_PRODUCTO_id_estado_producto = ESTADO_PRODUCTO_id_estado_producto;
    }

    public int getMARCA_PRODUCTO_id_marca_producto() {
        return MARCA_PRODUCTO_id_marca_producto;
    }

    public void setMARCA_PRODUCTO_id_marca_producto(int MARCA_PRODUCTO_id_marca_producto) {
        this.MARCA_PRODUCTO_id_marca_producto = MARCA_PRODUCTO_id_marca_producto;
    }

    public int getINVENTARIO_id_inventario() {
        return INVENTARIO_id_inventario;
    }

    public void setINVENTARIO_id_inventario(int INVENTARIO_id_inventario) {
        this.INVENTARIO_id_inventario = INVENTARIO_id_inventario;
    }

}
