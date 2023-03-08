public abstract class Personal {
    private Integer id;
    private String nombre;
    private String turno;
    private int tipoPersonal;
    private float montoVendido;
    private static int contador = 1;

    public Personal(Integer id, String nombre, String turno, int tipoPersonal, float montoVendido) {
        this.id = contador;
        this.nombre = nombre;
        this.turno = turno;
        this.tipoPersonal = tipoPersonal;
        this.montoVendido = montoVendido;
        contador++;
    }
    public Personal() {
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public int getTipoPersonal() {
        return tipoPersonal;
    }
    public void setTipoPersonal(int tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }
    public float getMontoVendido() {
        return montoVendido;
    }
    public void setMontoVendido(float montoVendido) {
        this.montoVendido = montoVendido;
    }

    public abstract void consultaInventario();
    public abstract void ventaProducto();
    public abstract void altaProducto();
    public abstract void bajaProducto();
    public abstract void modificarProducto();
    public abstract void consultaProducto();
}