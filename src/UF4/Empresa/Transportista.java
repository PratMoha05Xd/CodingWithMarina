package UF4.Empresa;

public class Transportista {
    private String nombre;
    private String telefono;
    private int numLicencia;

    public Transportista(String nombre, String telefono, String numLicencia) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.numLicencia = Integer.parseInt(numLicencia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }

    public void asignarEncargo(Encarrec encargo) {
        // Código para asignar un encargo al transportista
        System.out.println("Encargo asignado al transportista " + this.nombre);
    }

    public void anularEncargo(Encarrec encargo) {
        // Código para anular un encargo asignado al transportista
        System.out.println("Encargo anulado para el transportista " + this.nombre);
    }

    public void descansa() {
    }

    public void trabaja() {
    }
}
