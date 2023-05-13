package UF4.HerenciamultinivellSeat;

import UF4.Herenciamultinivell.Car;

public class Seat extends Car {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Seat() {
    }
    public Seat(String model) {
        this.model = model;
    }
    public void brand()
    {
        System.out.println("Brand: Seat");
    }
    public void speed()
    {
        System.out.println("Max: 90Kmph");
    }

    @Override
    public void calc_is_e(int index) {
        index = 3 * index;
        super.calc_is_e(index);
    }
}
