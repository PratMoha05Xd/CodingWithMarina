package UF2.ParamdeEntraiSalida;

import java.util.Scanner;
public class LlegirDouble {
  //ndiro public static khawi
  public static void main (String[] args) {
    LlegirDouble programa = new LlegirDouble();
    //ndiro fonction inicio
    programa.inici();
  }
  //nabdaw foncion
  public void inici() {
    System.out.println("Por favor entra un Double en el Teclado:");
    //variable jdida
    double a = llegirDoucleTeclat();
    System.out.println("Has entrado " + a + ".");
    System.out.println("Leyendo otro Double en el Teclado:");
    a = llegirDoucleTeclat();
    System.out.println("El otro Double es " + a + ".");
  }

  public double llegirDoucleTeclat() {
    //hna nkhadmo fonction ondero wastha statment dyalna
    Scanner lector = new Scanner(System.in);
    double dbl = 0;
    boolean siesdouble = false;
    while (!siesdouble) {
      siesdouble = lector.hasNextDouble();
      if (siesdouble) {
        dbl = lector.nextDouble();
      }
      else {
        System.out.println("Esto no es Double. vuelve a ententar");
        lector.next();
      }
    }
    //hna ndero return li yarja3
    return dbl;
  }
}