package UF4.Empresa;

import com.oracle.deploy.update.UpdateCheck;

public class Client {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    public Client(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public void anadirEncargo(Encarrec encargo) {
    }

    public void anularEncargo(Encarrec encargo) {

    }
}
