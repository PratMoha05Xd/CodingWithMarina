package UF2.ParamdeEntrada;

public class EscriureEstrelles {

    public static void main(String[] args){
        inici();
    }

    public static void inici() {
        estrellar(4);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        }


    private static void estrellar(int i) {
        for (int j=0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}