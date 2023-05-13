package UF4.Societat;

import UF4.Persona.Persona;

/**
 * @author Mohamed
 * 12/04/23
 */

//darori mn lmain w dir kolchi wast meno
public class MainSocietat {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setDni("965225S");
        p1.setNom("Mohamed");
        p1.setEdat(26);


        Persona p2 = new Persona("965225S", "Mohamed Jellal", 26);

        Persona p3 = new Persona("965225S", "Mohamed Jellal");
        p3.setEdat(26);

        Persona p4 = new Persona("965225S", "");
        p4.setNom("Mohamed");
        p4.setEdat(26);


        Persona p5 = new Persona(26);
        p5.setDni("965225S");
        p5.setNom("Mohamed");

        Persona p6 = new Persona("", "Moha");
        p6.setDni("965225S");
        p6.setEdat(26);


        p1.visualitzar();
        p2.visualitzar();
        p3.visualitzar();
        p4.visualitzar();
        p5.visualitzar();
    }
}
