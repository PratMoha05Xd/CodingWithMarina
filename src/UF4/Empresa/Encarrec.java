package UF4.Empresa;

import com.oracle.deploy.update.UpdateCheck;

import java.util.ArrayList;
import java.util.List;

public class Encarrec {
    private int dia;
    private int mes;
    private int hora;
    private int minutos;
    private List<Peticio> peticiones;

    public Encarrec(int dia, int mes, int hora, int minutos) {
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
        this.minutos = minutos;
        this.peticiones = new ArrayList<>();
    }

    public static void add(Encarrec encargo) {
    }

    public static void remove(Encarrec encargo) {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void anadirProducto(Peticio peticion) {
        this.peticiones.add(peticion);
    }

    public void eliminarProducto(Peticio peticion) {
        this.peticiones.remove(peticion);
    }

    public void asignarDestinatario(Client client) {
    }

    public void actualizarEstado(UpdateCheck instance) {
    }

    public Transportista getTransportista() {
        Transportista Transportista = null;
        return Transportista;
    }
}
