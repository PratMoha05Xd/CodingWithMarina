package UF4.HerenciaSimple;

public class Cat extends Animal{

    public Cat(int id) {
        super("Meowing", id);
    }

    // Own behavior
    private void Meow() {
        System.out.println("The Cat '" + getId() + "' is Meowing");
    }

    // Overriding super class behavior
    /*@Override
    public void sound() {
        super.sound("");
    }*/
}