package UF4.FiguresCalcul;

import java.util.Scanner;

public class Trapezi extends Figura {
    private int a;
    private int b;
    private int h;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return h;
    }

    public void setC(int c) {
        this.h = h;
    }

    public void Trapezi(int a, int b, int h) {

    }

    @Override
    public void llegirDades() {
        System.out.println("Escribe el base major:");
        a = scan.nextInt();
        System.out.println("y ahora escribe el base menor:");
        b = scan.nextInt();
        System.out.println("y al final escribe la altura:");
        h = scan.nextInt();
        Figura.setId(4);
        setFigura("Trapezi");
    }

    public double CalcularArea() {
        return (a + b * h) / 2;
    }

}
