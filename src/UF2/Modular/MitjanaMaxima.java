package UF2.Modular;
import java.util.Scanner;

public class MitjanaMaxima {

    static CalculsArrayReals calculador = new CalculsArrayReals();
    public static void main(String[] args) {

        System.out.println("Hola, Por favor entra el primer Array A: ");
        double[] arrayA= new double[6];
        arrayA = calculador.leerarray(arrayA);
        System.out.println("Ahora, Por favor entra el segundo ArrayB: ");
        double[] arrayB= new double[6];
        arrayB = calculador.leerarray(arrayB);

        double mitjanaA = calculador.calcM(arrayA);
        double mitjanaB = calculador.calcM(arrayB);
        if (mitjanaA > mitjanaB) {
            System.out.println("arrayA té una mitjana més alta.");
        } else if (mitjanaA < mitjanaB) {
            System.out.println("arrayB té una mitjana més alta.");
        } else {
            System.out.println("Les dues mitjanes són iguals!");
        }
    }
}
