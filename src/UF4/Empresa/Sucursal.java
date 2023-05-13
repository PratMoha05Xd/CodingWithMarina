package UF4.Empresa;

import java.util.ArrayList;

public class Sucursal {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private ArrayList<Transportista> transportistas;
    private ArrayList<Client> clientes;
    private ArrayList<Encarrec> encargos;

    public Sucursal(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.transportistas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.encargos = new ArrayList<>();
    }

    public void descansa(Transportista transportista) {
        System.out.println("La sucursal " + this.nombre + " está cerrada por descanso.");
        transportista.descansa();
    }

    public void trabaja(Transportista transportista) {
        System.out.println("La sucursal " + this.nombre + " está abierta y trabajando.");
        transportista.trabaja();
    }

    public void altaCliente(Client cliente) {
        this.clientes.add(cliente);
        System.out.println("Se ha dado de alta un nuevo cliente en la sucursal " + this.nombre);
    }

    public void bajaCliente(Client cliente) {
        this.clientes.remove(cliente);
        System.out.println("Se ha dado de baja un cliente de la sucursal " + this.nombre);
    }

    public void altaEncargo(Client cliente, Transportista transportista, Encarrec encargo) {
        this.clientes.add(cliente);
        this.transportistas.add(transportista);
        this.encargos.add(encargo);
        System.out.println("Se ha registrado un nuevo encargo en la sucursal " + this.nombre);
    }

    public void bajaEncargo(Encarrec encargo) {
        this.encargos.remove(encargo);
        System.out.println("Se ha dado de baja un encargo de la sucursal " + this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
