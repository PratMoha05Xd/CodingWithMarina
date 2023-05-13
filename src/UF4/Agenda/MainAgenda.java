package UF4.Agenda;

/**
 * @author Moha
 * 07/04/2023/A
 */

public class MainAgenda {
    public static void main(String[] args) {
        // Crear citas
        Cita cita1 = new Cita(9, 30, "Reunión de equipo", "Discutir los próximos pasos del proyecto");
        Cita cita2 = new Cita(11, 0, "Llamada con cliente", "Hablar sobre los requisitos del nuevo proyecto");
        Cita cita3 = new Cita(14, 0, "Reunión de ventas", "Presentar los resultados del último trimestre");

        // Crear páginas
        Pagina pagina1 = new Pagina(1, 1);
        pagina1.afegirCita(cita1);
        pagina1.afegirCita(cita2);
        Pagina pagina2 = new Pagina(1, 2);
        pagina2.afegirCita(cita3);

        // Crear agenda
        Agenda agenda = new Agenda(2023);
        agenda.agregarPagina(pagina1);
        agenda.agregarPagina(pagina2);

        // Mostrar la primera página de la agenda
        Pagina paginaActual = agenda.leerPagina();
        System.out.println("Agenda de citas para el año " + agenda.getano() + ", página " + paginaActual.getmes() + "/" + paginaActual.getdia());
        System.out.println("-----------------------------");
        for (Cita cita : paginaActual.listarCitas()) {
            System.out.println(cita.modificarText());
            System.out.println("-----------------------------");
        }

        // Avanzar a la siguiente página y mostrar las citas
        agenda.avanzarPagina();
        paginaActual = agenda.leerPagina();
        System.out.println("Agenda de citas para el año " + agenda.getano() + ", página " + paginaActual.getmes() + "/" + paginaActual.getdia());
        System.out.println("-----------------------------");
        for (Cita cita : paginaActual.listarCitas()) {
            System.out.println(cita.modificarText());
            System.out.println("-----------------------------");
        }

        // Borrar una cita y mostrar las citas actualizadas
        paginaActual.borrarCita(cita2);
        System.out.println("Agenda de citas para el año " + agenda.getano() + ", página " + paginaActual.getmes() + "/" + paginaActual.getdia());
        System.out.println("-----------------------------");
        for (Cita cita : paginaActual.listarCitas()) {
            System.out.println(cita.modificarText());
            System.out.println("-----------------------------");
        }

        // Retroceder a la página anterior y mostrar las citas
        agenda.retrocederPagina();
        paginaActual = agenda.leerPagina();
        System.out.println("Agenda de citas para el año " + agenda.getano() + ", página " + paginaActual.getmes() + "/" + paginaActual.getdia());
        System.out.println("-----------------------------");
        for (Cita cita : paginaActual.listarCitas()) {
            System.out.println(cita.modificarText());
            System.out.println("-----------------------------");
        }
    }
}
