package polimorfismo.example;

// a través de la palabra reservada "extends" hacemos herencia de los métodos

public class Perro extends Mascotas {

    @Override

    //cambio en la implementación de los métodos

    public void comer() {
        System.out.println("El perro está comiendo");
    }

    /* con Override le estamos diciendo al compilador que cuando tengamos
    un objeto de la clase "perro" y mandemos a llamar un método, se ejecutarán
    los métodos sobreescritos en esta clase
    */
    @Override
    public void dormir() {
        System.out.println("El perro está durmiendo");
    }

}
