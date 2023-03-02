import java.util.HashMap;

public class Producto {

    private float precio;
    private int cantidad;
    private String nombre;
    private String codigo;

    
    public Producto(float precio, int cantidad, String nombre, String codigo) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.codigo = codigo;
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
    
    public void nuevoProducto(HashMap<String, Producto> dataProdcuto) {
        
    }

}