package UF4.HerenciaSimpleActivitat;
import UF4.HerenciaSimpleActivitat.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setId(1);
        p1.setEdat(26);
        p1.setNom("Mohamed");

        Estudiant es1 = new Estudiant();
        es1.setCurs("DAM");
        es1.setAsugnaturas("MP1, MP2, MP3, MP4, MP5, MP6");
        es1.setEscola("Prat Educacio");
        double notes[] = {8.65, 7.6, 8.6, 5.6, 9.1, 6.7};
        es1.setNotes(notes);

        p1.visualitzar();
        System.out.println("--------------------------------");
        es1.visualitzar();
    }

}
