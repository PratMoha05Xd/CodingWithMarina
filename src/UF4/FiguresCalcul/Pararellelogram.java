package UF4.FiguresCalcul;

public class Pararellelogram extends Figura {
    private int b;
    private int h;


    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }


    public void Pararellelogram(int b, int h) {
    }

    @Override
    public void llegirDades() {
        System.out.println("Escribe la base:");
        b = scan.nextInt();
        System.out.println("y ahora escribe la altura:");
        h = scan.nextInt();
        //new Pararellelogram().CalcularArea(int h,int b);
        Figura.setId(6);
        setFigura("Pararellelogram");
    }

    public double CalcularArea() {
        return b * h;
    }

}
