package UF2.PujarNota;

import java.util.Arrays;
import java.util.Scanner;

public class secondlargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuanto es el tamano del vector lo que quieras: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Entra los elementos del vector:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int secondLargest = findSecondLargest(arr);
        System.out.println("El segundo numero mas grande " + Arrays.toString(arr) + " es:\n " + secondLargest);

    }

    public static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
