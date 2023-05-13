package UF2.ProgramacioModular;

import java.util.Scanner;

public class Examen2 {

    public static double[] notes = new double[6];
    public int MARCA_NOTES = -1;
    public int NUM_NOTES = 0;
    public String MARCA_FI = "fi";
    private boolean fi = false;
    public double max = 0;
    public double min = 10;
    public double mitj = 0;


    private final CalculArrays calculador = new CalculArrays();
    private final CercaDicotomica cerca = new CercaDicotomica();
    private final NotaAText transformar = new NotaAText();


    public static void main(String[] args) {
        Examen2 programa = new Examen2();
        programa.inici();
    }

    public void inici(){
        PreguntarNotes();
        ImprimirArrayNotes();
        do {
            MostrarMenu();
            TractarOpcio();
        } while (!fi);
    }

    //Param. entr:no en té
    //Param. sort:no en té
    //FUNCIÓ: llegir les notes
    //Param. entr:no en té
//Param. sort:no en té
//FUNCIÓ: llegir les notes
    private void PreguntarNotes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantes notes vols introduir?");
        int numNotes = sc.nextInt();
        notes = new double[numNotes];
        for (int i = 0; i < numNotes; i++) {
            System.out.println("Introdueix la nota " + (i+1) + ":");
            notes[i] = sc.nextDouble();
        }
    }

    //Param. entr:
//Param. sort:
//FUNCIÓ: imprimir l'array de les notes just després que les haguem llegit
    private void ImprimirArrayNotes() {
        System.out.println("Les notes introduïdes són: ");
        for (int i = 0; i < notes.length; i++) {
            System.out.print(notes[i] + " ");
        }
        System.out.println();
    }



    //Param. entr:
    //Param. sort:
    private void MostrarMenu() {
        System.out.println("\nBenvinguda al càlcul de notes de classe.");
        System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println("[MAX] Saber la nota màxima de classe");
        System.out.println("[MIN] Saber la nota mínima de classe");
        System.out.println("[MIT] Saber la nota mitjana de classe");
        System.out.println("[FI] Sortir.");
        System.out.print("Opció: ");
    }

    //Param. entr:
    //Param. sort:
    //FUNCIÓ: tractar cadascuna de les opcions que l'usuari pot triar
    private void TractarOpcio() {
        Scanner sc = new Scanner(System.in);
        String opcio = sc.next();
        switch (opcio.toUpperCase()) {
            case "MAX":
                max = calculador.calcularMaxim(notes, NUM_NOTES);
                String textMax = transformar.notaAText(max);
                ImprimirResultat(max, textMax, opcio);
                break;
            case "MIN":
                min = calculador.calcularMinim(notes, NUM_NOTES);
                String textMin = transformar.notaAText(min);
                ImprimirResultat(min, textMin, opcio);
                break;
            case "MIT":
                mitj = calculador.calcularMitjana(notes, NUM_NOTES);
                String textMitj = transformar.notaAText(mitj);
                ImprimirResultat(mitj, textMitj, opcio);
                break;
            case "FI":
                fi = true;
                System.out.println("\nFins aviat!");
                break;
            default:
                System.out.println("\nOpció incorrecta.");
        }
    }

    //Param. entr: la nota que volem transformar en text
    //Param. sort: la nota JA transformada en text i si modificar la variable per saber si algú ha tret un 8.
    //FUNCIÓ: Cridem la funció que ens transforma en text la notra nota.
    private String PrepararSortida(double valor) {
        String text = transformar.notaAText(valor);
        if (text.equals("vuit")) {
            System.out.println("Hi ha algú que ha tret un 8!");
        }
        return text;
    }

    //Param. entr:
    //Param. sort:
    //FUNCIÓ: buscar si algú ha tret un 8 utilitzant una funció ja creada
    public boolean MirarSiAlgu8() {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == 8) {
                return true;
            }
        }
        return false;
    }


    //Param. entr:
    //Param. sort:
    //FUNCIÓ: imprimir el resultat de l'opció que l'usuari ha triat.
    private void ImprimirResultat(double valornota, String text, String opcio) {
        String opcioescollida = "";
        if (opcio.equalsIgnoreCase("MAX")){
            opcioescollida = "màxim";
        }
        else if (opcio.equalsIgnoreCase("MIN")){
            opcioescollida = "mínim";
        }
        else {
            opcioescollida = "mitjà";
        }
        System.out.print("El valor " + opcioescollida +" de l'array que has escrit és " + valornota);
        System.out.println(" que equival a un " + text + ".\n");
    }

}
