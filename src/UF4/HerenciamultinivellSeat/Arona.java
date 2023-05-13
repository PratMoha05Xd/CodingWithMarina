package UF4.HerenciamultinivellSeat;

public class Arona extends Seat{
    private String color;
    private String kilometrage;

    //constracter
    public Arona() {
        super("Arona");
    }

    public void visualitzar() {
        System.out.println("Color...........:" + color);
        System.out.println("Color...........:" + kilometrage);
        System.out.println("Color...........:" + getModel());
        System.out.println("Color...........:" + isIs_electique());

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(String kilometrage) {
        this.kilometrage = kilometrage;
    }

}
