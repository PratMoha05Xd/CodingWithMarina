package UF4.Agenda;

/**
 * @author Moha
 * 07/04/2023/A
 */

public class Cita {
    private int hora;
    private int minutos;
    private String titulo;
    private String texto;

    /**
     *
     * @param hora
     * @param minutos
     * @param titulo
     * @param texto
     */

    public Cita(int hora, int minutos, String titulo, String texto) {
        this.hora = hora;
        this.minutos = minutos;
        this.titulo = titulo;
        this.texto = texto;
    }

    public String getTitulo() {
        return this.titulo;
    }


    /**
     *
     * @return
     */
    public String modificarText() {
        String informacion = "Cita: " + titulo + "\n" +
                "Hora: " + hora + ":" + minutos + "\n" +
                "Texto: " + texto;
        return informacion;
    }
}

