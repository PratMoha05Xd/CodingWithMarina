package UF2.Modular;

public class CalcInt {

    static int[] numbers = new int[5];

    public static int calcaMax() {
        int max = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (numbers[i] > max) {
                max =  numbers[i];
            }
        }
        return max;
    }

    public static int calcaMin() {
        int min = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int calcaMitj() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }
        return sum / 5;
    }

    public static void imprimir(int max, int min, int mitj) {
        System.out.println("La Nota Max es: " + max);
        System.out.println("La Nota Min es: " + min);
        System.out.println("La Nota Mediana Es: " + mitj);

    }
}



