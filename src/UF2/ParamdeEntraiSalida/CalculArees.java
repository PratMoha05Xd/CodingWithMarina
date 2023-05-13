package UF2.ParamdeEntraiSalida;
import java.util.Objects;
import java.util.Scanner;

public class CalculArees {

    private boolean end = false;

    public static void main(String args[]) {
        CalculArees programa = new CalculArees();
        programa.inici();
    }

    private void inici() {
        mostrarMenu();
        String figura = choseoption();
        if (figura.equalsIgnoreCase("Fi")){
            end = true;
        }
        else {
        double area = llegirUserInput(figura);
        System.out.println("L'area del " + figura + " es " + area);
     }
    }


    //demanen a l'usuari la figura que vol calcular l'àera
    private void mostrarMenu() {
        System.out.println("De quina figura vols calcular l'area?\n");
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle or Fi para sortir.\n");
        System.out.print("Opció: ");
    }


    //recollim la dada entrada per terminal
    private String choseoption() {
        Scanner lector = new Scanner(System.in);
        String line = lector.nextLine().toLowerCase();
        if (check_option(line)) return (line);
        else {
            System.out.print("Has entrado opcion incorrecta,\n Por favor intenta otra vez.\n");
            return (choseoption());
        }
    }

    private boolean check_option(String line) {
        return ((Objects.equals(line, "triangle") || Objects.equals(line, "quadrat") || Objects.equals(line, "rectangle") || Objects.equals(line, "trapezi") || Objects.equals(line, "rombe") || Objects.equals(line, "paralelogram") || Objects.equals(line, "cercle") || Objects.equals(line, "fi")));
    }

    //definim les variables que utilitzarem en tots els casos
    private double llegirUserInput(String figura) {
        //cas en que la figura = "triangle"
        double area = 0;
        switch (figura) {
            case "triangle": {
                double b = 23.0;
                double h = 8.0;
                area = (b * h) / 2;
                break;
            }
            //cas en que la figura = "quadrat"
            case "quadrat": {
                double r = 37.0;
                //funció matemàtica que eleva a 2 el radi
                area = Math.pow(r, 2);
                break;
            }
            //cas en que la figura = "rectangle"
            case "rectangle": {
                double a = 68.0;
                double b = 39.0;
                area = a * b;
                break;
            }
            //cas en que la figura = "trapezi"
            case "trapezi": {
                double a = 35.0;
                double b = 16.0;
                double h = 5.0;
                area = ((a * b) * h) / 2;
                break;
            }
            //cas en que la figura = "rombe"
            case "rombe":
                double dM = 75.0;
                double dm = 30.0;
                area = (dM * dm) / 2;
                break;
            //cas en que la figura = "paralelogram"
            case "paralelogram": {
                double b = 45.0;
                double h = 13.0;
                area = b * h;
                break;
            }
            //cas en que la figura = "cercle"
            case "cercle": {
                System.out.println("Quin es el radi del cercle?");
                double r = new Scanner(System.in).nextDouble();
                //funció matemàtica que eleva a 2 el radi
                //Math.PI = nombre pi (3.14159....)
                area = Math.pow(r, 2) * Math.PI;
                //area = r^2 * 3.14159;
                break;
            }
            case "Fi": {
                break;
            }
        }
        return area;
    }
}