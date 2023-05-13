package UF4.Empresa;

public class Peticio {
    private int cantidad;

    public Peticio(int cantidad) {
        this.cantidad = cantidad;
    }

    public void asignarProducto(TipusProducte producto) {
        System.out.println("Asignando " + this.cantidad + " unidades del producto " + TipusProducte.getNombre() + " a la petición.");
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
