package UF4.figures;

/**
 * @author Moha
 * 28/03/2023/A
 */
public class FiguresMain {
    public static void main(String[] args) {
        //hna badelna color dyal rectangle 2
        rectangle r1 = new rectangle("blau");
        //r1.color = "azul";

        /*rectangle r2 = new rectangle();
        r2.base = 5;
        r2.altura = 3;
        r2.color = "verd";*/

        //hadi bhal hadik li lfo9 ghir hadi fiha param de entrada w lokhra la
        rectangle r2 = new rectangle(5, 3);
        r2.color = "verd";

        /*rectangle r3 = new rectangle();
        r3.base = 6;
        r3.altura = 4;
        r3.color = "rosa";*/

        rectangle r3 = new rectangle("rosa", 6, 4);
        //r3.base = 6;
        //r3.altura = 4;

        cuadrat c1 = new cuadrat(3,"vermill");
        //c1.costat = 3;
        //c1.color = "vermil";


        cercle cer = new cercle(2.5, "blau" );
        //cer.radi = 3;
        //cer.color = "blau";

        Triangle tri = new Triangle(4,4,3,"verd");
        //tri.costat1 = 4;
        //tri.costat2 = 4;
        //tri.costat3 = 3;
        //tri.color = "verd";
    }

}
