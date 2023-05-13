package UF4.HerenciamultinivellSeat;

public class MainCoche{
    public static void main(String[] args) {
     Arona model = new Arona();
     model.vehicleType();
     model.brand();
     model.speed();
     model.setColor("Azul");
     model.setKilometrage("254.62 KM/h");
     model.getModel();
     model.calc_is_e(5);
     model.visualitzar();

    }
}
