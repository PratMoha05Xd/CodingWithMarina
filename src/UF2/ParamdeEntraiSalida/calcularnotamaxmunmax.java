package UF2.ParamdeEntraiSalida;

import java.util.Scanner;

public class calcularnotamaxmunmax {
    static double[] numbers = new double[5];

    public static void main(String[] args) {
        mostrarMenu();
        llegirDades();
        double max = calcaMax();
        double min = calcaMin();
        double mitj = calcaMitj();
        imprimir(max, min, mitj);
    }

    public static void mostrarMenu() {
        System.out.println("Escribe 5 notas:");
    }

    public static void llegirDades() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            numbers[i] = scan.nextDouble();
            if (numbers[i] > 10 || numbers[i] < 0) {
                System.out.println("Por favor entra nota entre 0 y 10");
                llegirDades();
            }
        }
    }

    public static double calcaMax() {
        double max = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static double calcaMin() {
        double min = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static double calcaMitj() {
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }
        return sum / 5;
    }

    public static void imprimir(double max, double min, double mitj) {
        System.out.println("La Nota Max es: " + max);
        System.out.println("La Nota Min es: " + min);
        System.out.println("La Nota Mediana Es: " + mitj);
    }
}
