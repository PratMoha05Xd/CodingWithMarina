package UF2.Paramconarray;

import java.util.Scanner;

public class transfernotaenpalabra {

    static double[] notas = new double[5];

    public static void main(String args[]) {
        transfernotaenpalabra programa = new transfernotaenpalabra();
        programa.inici();
        entrardatos();
        imprimir();
    }

    public static void inici() {
        System.out.println("Ara sabrem les teves notas globals\n-----------------------------------");
    }

    public static void entrardatos() {
        System.out.println("Escriu les vostres notes:");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            notas[i] = scan.nextDouble();
        }
    }

    public static String transformar(double note) {
        if (note >= 0 && note <= 4.9) {
            return "Suspés";
        } else if (note >= 5 && note <= 6.49) {
            return "Aprovat";
        } else if (note >= 6.5 && note <= 8.9) {
            return "Notable";
        } else if (note >= 9 && note <= 10) {
            return "Exel-lent";
        } else {
            return "nota no valida\nPor Favor Repetir de nuevo!";

        }
    }

    public static void imprimir() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("la nota " + notas[i] + " es queda en un " + transformar(notas[i]));
        }
    }
}
