package UF2.PujarNota;

import java.util.Arrays;
import java.util.Scanner;

public class Eliminarelementvector {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        int[] b = new int[size - 1];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        removeFirstElement(a, b);

        System.out.println("Original array: " + Arrays.toString(a));
        System.out.println("Modified array: " + Arrays.toString(b));

    }

    public static void removeFirstElement(int[] source, int[] destination) {
        for (int i = 1; i < source.length; i++) {
            destination[i-1] = source[i];
        }
    }
}
