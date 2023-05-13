package UF4.FiguresCalcul;

import java.util.Scanner;

import static UF4.FiguresCalcul.Figura.seguentFigura;

public class MainPro {
    public static void main(String[] args) {
        System.out.println("Hola, Por Favor elege que figura quieres calcular su area:\n Triangle o Quadrat o Rectangle o Trapezi o Rombe o Parallelogram o Cercle");
        getdata();
        seguentFigura();
        getdata();
    }

    public static void getdata() {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine().toLowerCase();

        if (word.equals("triangle")) {
            Triangle tr1 = new Triangle();
            tr1.llegirDades();
            tr1.imprimirDades();
        } else if (word.equals("quadrat")) {
            Quadrat quad1 = new Quadrat();
            quad1.llegirDades();
            quad1.imprimirDades();
        } else if (word.equals("rectangle")) {
            Rectangle rec1 = new Rectangle();
            rec1.llegirDades();
            rec1.imprimirDades();
        } else if (word.equals("trapezi")) {
            Trapezi tre1 = new Trapezi();
            tre1.llegirDades();
            tre1.imprimirDades();
        } else if (word.equals("rombe")) {
            Rombre rem1 = new Rombre();
            rem1.llegirDades();
            rem1.imprimirDades();
        } else if (word.equals("parallelogram")) {
            Pararellelogram parall1 = new Pararellelogram();
            parall1.llegirDades();
            parall1.imprimirDades();
        } else if (word.equals("cercle")) {
            Cercle cer1 = new Cercle();
            cer1.llegirDades();
            cer1.imprimirDades();
        } else {
            System.out.println("has entrado algo no existe\n  Por Favor vuelve a intentar de nuevo!");
            getdata();
        }
    }
}