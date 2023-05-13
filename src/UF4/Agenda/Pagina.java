package UF4.Agenda;

import java.util.ArrayList;

/**
 * @author Moha
 * 07/04/2023/A
 */

public class Pagina {
    private int dia;
    private int mes;
    private ArrayList<Cita> citas;

    /**
     *
     * @param dia
     * @param mes
     */

    public Pagina(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        this.citas = new ArrayList<Cita>();
    }

    public int getdia() {
        return this.dia;
    }

    public int getmes() {
        return this.mes;
    }

    public void afegirCita(Cita nuevaCita) {
        citas.add(nuevaCita);
    }

    /**
     *
     * @param citaABorrar
     */
    public void borrarCita(Cita citaABorrar) {
        citas.remove(citaABorrar);
    }

    /**
     *
     * @param titulo
     * @return
     */
    public Cita buscarCita(String titulo) {
        for (Cita cita : citas) {
            if (cita.getTitulo().equals(titulo)) {
                return cita;
            }
        }
        return null;
    }

    /**
     *
     * @return
     */
    public ArrayList<Cita> listarCitas() {
        return citas;
    }
}
