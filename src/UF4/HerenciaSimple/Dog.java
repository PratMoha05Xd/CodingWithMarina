package UF4.HerenciaSimple;

public class Dog extends Animal{

    // Own behavior

    public Dog(int id) {
        super("barking", id);
    }
    private void bark() {
        System.out.println("Dog '" + getId() + "' is barking");
    }

    // Overriding super class behavior
   /* @Override
    public void sound(String sound) {
        super.sound("barking");
        bark();
    }*/
}