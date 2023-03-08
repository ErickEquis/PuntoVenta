public class Empleado extends Personal {

    public Empleado(Integer id, String nombre, String turno, int tipoPersonal, float montoVendido) {
        super(id, nombre, turno, tipoPersonal, montoVendido);
    }

    public Empleado() {
    }

    @Override
    public void consultaInventario() {
    }

    @Override
    public void ventaProducto() {
    }

    @Override
    public void altaProducto() {
    }

    @Override
    public void bajaProducto() {
    }

    @Override
    public void modificarProducto() {
    }

    @Override
    public void consultaProducto() {
    }
}
