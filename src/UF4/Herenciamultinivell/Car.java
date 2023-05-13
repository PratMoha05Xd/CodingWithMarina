package UF4.Herenciamultinivell;

/**
 * @author Mohamed
 * 18/04/2023
 */
public class Car {
    public boolean isIs_electique() {
        return is_electique;
    }

    private boolean is_electique;
    private int id;
    public Car()
    {
        System.out.println("Class Car");
    }
    public void vehicleType()
    {
        System.out.println("Vehicle Type: Coche");
    }

    public  void calc_is_e(int index)
    {
        is_electique = (index % 2) == 0;
    }
}
