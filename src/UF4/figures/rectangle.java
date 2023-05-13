package UF4.figures;

/**
 * @author Moha
 * 28/03/2023/A
 */
public class rectangle {
    public static int getBase() {
        return base;
    }

    public static void setBase(int base) {
        rectangle.base = base;
    }

    public static void setAltura(int altura) {
        rectangle.altura = altura;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getAltura() {
        return altura;
    }

    public String getColor() {
        return color;
    }

    public static int base;
    public static int altura;
    public String color;


    //hna khasni nbadlo lvalor dyal variable
    public rectangle() {
    }

    /**
     *
     * @param a base
     * @param b altura
     */
    public rectangle(int a, int b) {
        base = a;
        altura = b;
    }

    /**
     *
     * @param c color
     */
    public rectangle(String c) {
        color = c;
    }

    /**
     *
     * @param c base
     * @param a altura
     * @param b color
     */
    public rectangle(String c, int a, int b) {
        base = a;
        altura = b;
        color = c;
    }
}

