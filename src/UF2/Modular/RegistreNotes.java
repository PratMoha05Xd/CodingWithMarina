package UF2.Modular;

public class RegistreNotes {
    public static void main(String[] args) {
        Model1 simo = new Model1();

        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};


        double max = simo.calcularMaxim(notes);
        double min = simo.calcularMinim(notes);
        double mitjana = simo.calcularMitjana(notes);
        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }
}






