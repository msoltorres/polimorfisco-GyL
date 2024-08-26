package polimorfismo.example;

public class Main {
    public static void main(String[] args) {
    /* esto es posible porque el polimorfismo nos dice que un objeto
    de una super clase puede almacenar una instancia de cualquiera de sus
    subclases
     */
        Mascotas mascotas = new Perro();
        mascotas.comer();
        mascotas.dormir();
        mascotas.pasear();
    }
}
