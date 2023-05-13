package UF2.PujarNota;

import java.util.Scanner;


public class Calculanotafuncions13 {
    
    //declarar un vector de 5
    private double[] numeros = new double[5];

    //declarar una variable double
    private double a = 0;

    //declarar un boolean se llama fin y es false
    private boolean fin = false;

    public static void main(String[] args) {
        Calculanotafuncions13 programa = new Calculanotafuncions13();
        programa.inici();
    }

    //la primera fonction de inicio
    //un bucle dentro la foncion, mientras "fin" no es correcta sigue...
    public void inici() {
        while (!fin){
            //llamar la foncion Menu
            menu();
            opciones(numeros);
            //llamar la foncion ImprimirOpciones
            pedirNumeros();
            imprimir();
    }

    }
    public void menu() {
        System.out.println("Registrar 5 numeros Por Favor:");
    }

//aqui he hecho 2 fonciones a una para optimizar el codigo, y he hecho UperCase a los Opciones...
    public void opciones(double[] numeros) {
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + " (de 0 a 10): ");
            double num = lector.nextDouble();
            while (num < 0 || num > 10) {
                System.out.print("Número inválido, ingrese nuevamente: ");
                num = lector.nextInt();
            }
            numeros[i] = num;
        }
        System.out.println("[MAX] Consultar la maxima nota.");
        System.out.println("[MIN] Consultar la nota minima.");
        System.out.println("[MID] calcular la mediana.");
        System.out.println("[FIN] SALIR.");
        System.out.print("Opció: ");
    }

    //aqui un Switch...
    public double pedirNumeros() {
        Scanner lector = new Scanner(System.in);
        String opcio = lector.nextLine().toUpperCase();
        switch (opcio) {
            case "MAX": {
                a = encontrarMayor(numeros);
                break;
            }
            case "MIN": {
                a = encontrarMenor(numeros);
                break;
            }
            case "MID": {
                a = calcularMediana(numeros);
                break;
            }
            case "FIN": {
                fin=true;
                System.out.println("adios");
                break;
            }
        }
        return a;
    }

    /*public void imprimirOpciones() {

        else if (opcio.equalsIgnoreCase("MAX")) {
            a = encontrarMayor(numeros);
            System.out.println("el resultado es : " + a);

        }
        else if (opcio.equalsIgnoreCase("MIN")) {
            a = encontrarMenor(numeros);
            System.out.println("el resultado es : " + a);

        }
        else if (opcio.equalsIgnoreCase("MID")) {
            a = calcularMediana(numeros);
            System.out.println("el resultado es : " + a);

        }
        else if (opcio.equalsIgnoreCase("FIN")) {
            fin=true;
            System.out.println("adios");
        }
        else {
            System.out.println("Opció incorrecta!\n");
        }

    }*/


    public  double encontrarMayor(double[] numeros) {
        double mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    public  double encontrarMenor(double[] numeros) {
        double menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public double calcularMediana(double[] numeros) {
        Scanner lector = new Scanner(System.in);
        double mediana = numeros[0];
        double mid;
        for (int i = 0; i < numeros.length; i++) {
            mediana = mediana + numeros[i];
        }
        mid = mediana / numeros.length;
        return mid;
    }

//al final imprimir el resultado y cambiar el valor de boolean fin a true para que se acaba el programa.
    public void imprimir() {
        System.out.println("el resultado es : " + a);
        fin = true;
    }
}
