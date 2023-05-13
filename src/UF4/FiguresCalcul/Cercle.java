package UF4.FiguresCalcul;

public class Cercle extends Figura {
    private int radi;

    public void Cercle(int r) {

    }

    @Override
    public void llegirDades() {
        System.out.println("Escribe el radi del curculo:");
        radi = scan.nextInt();
        Figura.setId(7);
        setFigura("Cercle");
    }

    public double CalcularArea() {
        return Math.pow(radi, 2) * Math.PI;
    }

    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }
}
