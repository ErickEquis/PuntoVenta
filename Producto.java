public class Producto {

    private float precio;
    private int cantidad;
    private String nombre;
    private String codigo;
    private String tipoProducto;

    
    public Producto(float precio, int cantidad, String nombre, String codigo, String tipoProducto) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipoProducto = tipoProducto;
    }
    public Producto() {
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTipoProducto() {
        return tipoProducto;
    }
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}