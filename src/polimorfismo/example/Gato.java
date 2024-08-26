package polimorfismo.example;

public class Gato extends Mascotas {

    @Override
    public void comer() {
        System.out.println("El gato está comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El gato está durmiendo");
    }
}
