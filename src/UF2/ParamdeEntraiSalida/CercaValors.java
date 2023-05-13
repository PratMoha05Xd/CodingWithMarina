package UF2.ParamdeEntraiSalida;

import java.util.Arrays;
import java.util.Random;

public class CercaValors {

    public static void main(String[] args) {
        CercaValors programa = new CercaValors();
        programa.inici();
    }

    public void inici() {
        Random rd = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(11);
        }
        printArray("Nuestro Array ", array);
        int[] copia1 = Arrays.copyOfRange(array, 0, 5);
        printArray("Valors a cercar: ", copia1);
        int[] copia2 = Arrays.copyOfRange(array, 5, array.length);
        Arrays.sort(copia2);
        printArray("Array on es cerca: ", copia2);

        for (int i = 0; i < copia1.length; i++) {
            boolean trobat = false;
            for (int j = 0; j < copia2.length; j++) {
                if (copia1[i] == copia2[j] && !trobat) {
                    System.out.println("A la posicio " + Arrays.binarySearch(copia2, copia1[i]) + " hi ha el valor " + copia1[i]);
                    trobat = true;
                    break;
                }
            }
        }
    }

    private void printArray(String message, int[] arr) {
        System.out.print(message + "[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
