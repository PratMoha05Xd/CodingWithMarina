package UF4.HerenciaSimple;

public class Animal {

    int id;
    String sound = "";

    public Animal() {
    }

    public Animal(String sound, int id) {
        this.sound = sound;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void sound() {
        if (sound.isEmpty())
            System.out.println("By default it is mute");
        else
            System.out.println("The Cat '" + id + "' " + sound);

    }
}
