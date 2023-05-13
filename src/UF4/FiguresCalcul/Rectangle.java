package UF4.FiguresCalcul;

import java.util.Scanner;

public class Rectangle extends Figura {
    private int costat1;
    private int costat2;

    public int getCostat1() {
        return costat1;
    }

    public void setCostat1(int costat1) {
        this.costat1 = costat1;
    }

    public int getCostat2() {
        return costat2;
    }

    public void setCostat2(int costat2) {
        this.costat2 = costat2;
    }

    public void Rectangle(int c1, int c2) {

    }

    @Override
    public void llegirDades() {
        System.out.println("Escribe el primer costat:");
        costat1 = scan.nextInt();
        System.out.println("y ahora escribe el segundo costat:");
        costat2 = scan.nextInt();
        Figura.setId(3);
        setFigura("Rectangle");
    }

    public double CalcularArea() {
        return (costat1 * costat2);
    }

}
