package UF1.Bucle;

public class banderausoptimazed {

  public static void main(String[] args) {
    System.out.println("Venga vamos a Dibujar la bandera Americana! ");
    
    for(int i = 0; i < 15; i++) {
      String printstar = "";
      for(int j = 0; j < 48; j++) {
        if (i < 9) {
          if (j < 16) {
            if (j%2 == 0) {
              printstar = printstar + "*";
            }
            else {
              printstar = printstar + " ";
            }
          }
          else {
              printstar = printstar + "=";
         }
      }
      else {
        printstar = printstar + "=";
      }
     }
        printstar = printstar + "\n";
    System.out.print(printstar);
    }
  }
}