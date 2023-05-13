package UF4.Agenda;

import java.util.ArrayList;

/**
 * @author Moha
 * 07/04/2023/A
 */

public class Agenda {
    private int ano;
    private ArrayList<Pagina> paginas;
    private int paginaActual;

    /**
     *
     * @param ano
     */
    public Agenda(int ano) {
        this.ano = ano;
        this.paginas = new ArrayList<Pagina>();
        this.paginaActual = 0;
    }

    public void agregarPagina(Pagina pagina) {
        this.paginas.add(pagina);
    }

    public void avanzarPagina() {
        if (this.paginaActual < this.paginas.size() - 1) {
            this.paginaActual++;
        }
    }

    public void retrocederPagina() {
        if (this.paginaActual > 0) {
            this.paginaActual--;
        }
    }

    public Pagina leerPagina() {
        return this.paginas.get(this.paginaActual);
    }

    public int getano() {
        return this.ano;
    }
}
