package UF1.Bucle;

import java.util.Scanner;
  public class diamond {
  public static void main(String[] args) {

      
      Scanner s = new Scanner(System.in);
      
      System.out.println("¿Cuántas Filas quieres en el Diamond? ");
      int num = s.nextInt();

      int count=1;

      for(int i=1; i<=2*num-1; i++)
      {
         for(int j=count; j<=num; j++) {

          System.out.print(" ");
      }
         for(int k=1; k<=count*2-1; k++) {

            System.out.print("*");
         }

         if (i<num)
            count++;
         else 
            count--;
               System.out.println("");
      }
   }
}