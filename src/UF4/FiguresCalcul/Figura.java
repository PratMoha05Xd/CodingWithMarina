package UF4.FiguresCalcul;

import java.util.Scanner;

import static UF4.FiguresCalcul.MainPro.getdata;

/**
 * @author Moha
 * 04/24/2023
 */
public class Figura {
    Scanner scan = new Scanner(System.in);
    private static String figura;
    private static int id;

    public Figura() {
    }

    public void llegirDades() {
    }

    public static void seguentFigura() {
        System.out.println("ahora Por favor escribe otro nombre de otra figura destinta lo que quieres calcular:");
        System.out.println("Aqui tienes todas las opciones:\n Triangle o Quadrat o Rectangle o Trapezi o Rombe o Parallelogram o Cercle. ");
    }

    public void imprimirDades() {
        double area = CalcularArea();
        System.out.println("la area de la " + this.getFigura() + " con el ID Num " + this.getId() + " es " + area);
    }

    public double CalcularArea() {
        return (0.0);
    }

    public static String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        Figura.figura = figura;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Figura.id = id;
    }
}
