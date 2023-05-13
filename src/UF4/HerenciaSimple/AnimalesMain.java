package UF4.HerenciaSimple;

public class AnimalesMain {

    public static void main(String[] args) {
        int id = 0;
        Dog d;
        Cat ca;

        Animal a1 = new Animal();
        a1.sound();

        for (int i = 0; i< 20; i++)
        {
            d = new Dog(i++);
            d.sound();
            ca = new Cat(i);
            ca.sound();
        }
    }
}