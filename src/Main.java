
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal perro = new Perro();
        Animal caballo = new Caballo();

        animal.emitirSonido();
        perro.emitirSonido();
        caballo.emitirSonido();
    }
}