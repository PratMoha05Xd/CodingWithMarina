package UF2.Modular;

import java.util.Scanner;

public class CalculsArrayReals {
    public static double[] leerarray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            Scanner scana = new Scanner(System.in);
            array[i] = scana.nextDouble();
        }
        return array;
    }

    public static double calcM(double[] vector) {
        double mitj = 0;
        for (int i = 0; i < vector.length; i++) {
            mitj = mitj + vector[i];
        }
        return mitj / vector.length;
    }
}