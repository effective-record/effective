
package modelo;

/**
 *
 * @author AndresSossa
 */
public class DETALLE_MOVIMIENTO {
    
    private int id_detalle_movimiento;
    private int cantidad;
    private double precio_productos;
    private double iva_productos;
    private double total_productos;
    private int PRODUCTOS_id_producto;

    public int getId_detalle_movimiento() {
        return id_detalle_movimiento;
    }

    public void setId_detalle_movimiento(int id_detalle_movimiento) {
        this.id_detalle_movimiento = id_detalle_movimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_productos() {
        return precio_productos;
    }

    public void setPrecio_productos(double precio_productos) {
        this.precio_productos = precio_productos;
    }

    public double getIva_productos() {
        return iva_productos;
    }

    public void setIva_productos(double iva_productos) {
        this.iva_productos = iva_productos;
    }

    public double getTotal_productos() {
        return total_productos;
    }

    public void setTotal_productos(double total_productos) {
        this.total_productos = total_productos;
    }

    public int getPRODUCTOS_id_producto() {
        return PRODUCTOS_id_producto;
    }

    public void setPRODUCTOS_id_producto(int PRODUCTOS_id_producto) {
        this.PRODUCTOS_id_producto = PRODUCTOS_id_producto;
    }
    

    
    
    
}
