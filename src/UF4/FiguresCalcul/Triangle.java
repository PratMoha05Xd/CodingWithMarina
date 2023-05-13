package UF4.FiguresCalcul;

public class Triangle extends Figura {
    private int base;
    private int h;

    public void Triangle(int a, int b) {

    }

    @Override
    public void llegirDades() {
        System.out.println("Escribe la base:");
        base = scan.nextInt();
        System.out.println("y ahora escribe la altura:");
        h = scan.nextInt();
        Figura.setId(1);
        setFigura("Triangle");
    }

    public double CalcularArea() {
        return (base * h / 2);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

}
