package UF2.Modular;

import java.util.Scanner;

import static UF2.Modular.CalcChar.*;

public class gestionIntDouble {


    public static void main(String[] args) {
        System.out.println("Usted quiere integer o double o character: ");
        Scanner lector = new Scanner(System.in);
        String word = lector.nextLine().toLowerCase();


        CalcInt simo = null;
        Calcdouble moha = null;

        if (word.equals("integer")) {
            System.out.println("Escribe 5 interos:");
            Scanner scan = new Scanner(System.in);
            for (int i = 0; i<5;i++) {
                CalcInt.numbers[i] = scan.nextInt();
            }
            simo = new CalcInt();
            int max = simo.calcaMax();
            int min = simo.calcaMin();
            int mitj = simo.calcaMitj();


            System.out.println("elige que quieres saber: MX o MN o MD");
            String calc  = scan.next().toUpperCase();


            switch (calc) {
                case "MX":
                    System.out.println(max);
                   break;

                case "MN":
                    System.out.println(min);
                    break;

               case "MD":
                   System.out.println(mitj);
                    break;

            }

          // CalcInt.imprimir(max, min, mitj);

        } else if (word.equals("double")) {

            System.out.println("Escribe 5 doubles:");
            Scanner scan = new Scanner(System.in);
            for (int i = 0; i<5;i++) {
                Calcdouble.numbers[i] = scan.nextDouble();
            }
            moha = new Calcdouble();
            double max = moha.calcaMax();
            double min = moha.calcaMin();
            double mitj = moha.calcaMitj();
            System.out.println("elige que quieres saber: MX o MN o MD");
            String calc  = scan.next().toUpperCase();


            switch (calc) {
                case "MX":
                    System.out.println(max);
                    break;

                case "MN":
                    System.out.println(min);
                    break;

                case "MD":
                    System.out.println(mitj);
                    break;

            }
        }
        else if (word.equals("character")) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese 5 caracteres:");

            for (int i = 0; i < chars.length; i++) {
                chars[i] = scanner.next().charAt(0);
            }

            int biggestOne = findBiggestIndex(chars, CalcChar.letras);
            System.out.println("El caracter más grande es: " + chars[biggestOne]);

            int smallestOne = findSmallestIndex(chars, letras);
            System.out.println("El caracter más pequeño es: " + chars[smallestOne]);

            boolean areDifferent = areCharsDifferent(chars);
            System.out.println("Son diferentes los 5 caracteres? " + areDifferent);
        }

    }
}









