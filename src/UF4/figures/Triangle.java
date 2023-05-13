package UF4.figures;
/**
 * @author Moha
 * 28/03/2023/A
 */
public class Triangle {
    public int costat1;
    public int costat2;
    public int costat3;

    public String color;

    /**
     *
     * @param cos1 primer costat
     * @param cos2 segun costat
     * @param cos3 tercer costat
     * @param col color
     */
    public Triangle(int cos1, int cos2,int cos3, String col) {
        costat1 = cos1;
        costat2 = cos2;
        costat3 = cos3;
        color = col;
    }
}
