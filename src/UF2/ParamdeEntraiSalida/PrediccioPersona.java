package UF2.ParamdeEntraiSalida;

import java.util.Objects;
import java.util.Scanner;

//Un programa que calcula descomptes.
public class PrediccioPersona {

    //Inicialitzem les variables que necessitarem per qualsevol cas
    private String equipFutbol, llenguatgeProgramacio;
    private int numSort = 0;

    public static void main(String[] args) {
        PrediccioPersona programa = new PrediccioPersona();
        programa.inici();
    }

    private void inici() {
        String Mes = primeraPregunta();
        String nom = SegunPregunta();
        int edat = TercerPregunta();
         IfStatmentPregunta(Mes , edat);

        System.out.print("------------------------------------------------\n");
        System.out.print("Un plaer conèixer-te " + nom + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
        System.out.print("\n\n");

        System.out.print(">>> El teu número de la sort és el " + numSort + "!");
        System.out.print("\n\n");

        System.out.print(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".");
        System.out.print("\n\n");

        System.out.print(">>> El teu llenguatge de programació més estimat serà " + llenguatgeProgramacio + "!");
        System.out.print("\n\n");

        System.out.print("Torna quan vulguis!\n");
        System.out.print("------------------------------------------------\n\n\n");
    }

    //demanem a l'usuari el mes en què va nèixer
    public String primeraPregunta() {
        Scanner s = new Scanner(System.in);
        System.out.print("Escriu el mes en què vas nèixer.");
        System.out.print("\n");
        System.out.print("Gener\tFebrer\tMarc\n");
        System.out.print("Abril\tMaig\tJuny\n");
        System.out.print("Juliol\tAgost\tSetembre\n");
        System.out.print("Octubre\tNovembre\tDesembre");
        System.out.print("\n");
        String Mes = s.nextLine().toLowerCase();
        if (ObjectFonction(Mes))
            return (Mes);
        else {
            System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
            return primeraPregunta();
        }
    }

    //demanem a l'usuari el mes en què va nèixer
    private boolean ObjectFonction(String Mes) {
        return ((Objects.equals(Mes, "gener") || Objects.equals(Mes, "febrer") || Objects.equals(Mes, "marc") || Objects.equals(Mes, "maig") || Objects.equals(Mes, "juny") || Objects.equals(Mes, "juliol") || Objects.equals(Mes, "agost") || Objects.equals(Mes, "setembre") || Objects.equals(Mes, "octubre") || Objects.equals(Mes, "novembre") || Objects.equals(Mes, "desembre")));
    }

    public String SegunPregunta() {
        Scanner s = new Scanner(System.in);
        //System.out.print("\n");
        System.out.print("Com et dius?\n");
        String nom = s.nextLine();
        return nom;
    }

    //demanem a l'usuari la seva edat
    public int TercerPregunta() {
        Scanner s = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Per acabar, quants anys tens?\n");
        //recollim la dada a la variable edat
        int edat = s.nextInt();
        System.out.print("\n\n");
        return edat;
    }


    //fem els condicionals necessaris
    public int IfStatmentPregunta(String end, int edat) {
        switch (end) {
            case "gener": {
                numSort = edat * 3 / 2;
                equipFutbol = "Bayern de Munich";
                llenguatgeProgramacio = "C++";
                break;
            }
            case "febrer": {
                numSort = edat - 4;
                equipFutbol = "Atlético de Madrid";
                llenguatgeProgramacio = "Python";
                break;
            }
            case "marc": {
                numSort = edat / 2;
                equipFutbol = "Chelsea";
                llenguatgeProgramacio = "JavaScript";
                break;
            }
            case "abril": {
                numSort = edat % 4;
                equipFutbol = "Manchester city";
                llenguatgeProgramacio = "Node.js";
                break;
            }
            case "maig": {
                numSort = edat * 3 / 6;
                equipFutbol = "Liverpool";
                llenguatgeProgramacio = "React";
                break;
            }
            case "juny": {
                numSort = edat + edat;
                equipFutbol = "Real Madrid";
                llenguatgeProgramacio = "C#";
                break;
            }
            case "juliol": {
                numSort = edat * edat / 5;
                equipFutbol = "BVB";
                llenguatgeProgramacio = "Swift";
                break;
            }
            case "agost": {
                numSort = edat / 2 * edat;
                equipFutbol = "FCB";
                llenguatgeProgramacio = "Java";
                break;
            }
            case "setembre": {
                numSort = 1;
                equipFutbol = "Juve";
                llenguatgeProgramacio = "PHP";
                break;
            }
            case "octubre": {
                numSort = edat * 4 / 3;
                equipFutbol = "PSG";
                llenguatgeProgramacio = "R";
                break;
            }
            case "novembre": {
                numSort = edat % 2 + 23;
                equipFutbol = "Sevilla CF";
                llenguatgeProgramacio = "Go";
                break;
            }
            case "desembre": {
                numSort = edat;
                equipFutbol = "Manchester United";
                llenguatgeProgramacio = "Ruby";
                break;
            }
        }
        return edat;
    }
}

