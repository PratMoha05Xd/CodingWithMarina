package UF4.FiguresCalcul;

public class Quadrat extends Figura {
    private int costat;

    public int getCostat() {
        return costat;
    }

    public void setCostat(int costat) {
        this.costat = costat;
    }


    public void Quadrat(int r) {
    }

    @Override
    public void llegirDades() {
        System.out.println("Escribe el costat:");
        costat = scan.nextInt();
        Figura.setId(2);
        setFigura("Quadrat");
    }

    public double CalcularArea() {
        return Math.pow(costat, 2);
    }

}
