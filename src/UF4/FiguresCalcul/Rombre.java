package UF4.FiguresCalcul;

import java.util.Scanner;

public class Rombre extends Figura {
    private int dM;
    private int dm;

    public int getdM() {
        return dM;
    }

    public void setdM(int dM) {
        this.dM = dM;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }

    public void Rombe(int dM, int dm) {

    }

    @Override
    public void llegirDades() {
        System.out.println("Escribe el Diagonal Major:");
        dM = scan.nextInt();
        System.out.println("y ahora escribe el Diagonal menor:");
        dm = scan.nextInt();
        Figura.setId(5);
        setFigura("Rombe");

    }

    public double CalcularArea() {
        return (dM + dm) / 2;
    }

}
