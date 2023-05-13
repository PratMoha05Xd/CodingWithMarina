package UF4.Empresa;
public class TipusProducte {
    private static String nombre;
    private int codigo;
    private double precio;
    private int stock;
    private boolean aLaVenta;

    public TipusProducte(String nombre, int codigo, double precio, int stock, boolean aLaVenta) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.aLaVenta = aLaVenta;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isALaVenta() {
        return aLaVenta;
    }

    public void setALaVenta(boolean aLaVenta) {
        this.aLaVenta = aLaVenta;
    }
}
