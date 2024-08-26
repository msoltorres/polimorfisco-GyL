package org.example;
class Personaje {
     String  habilidad;
     String habilidad2;


    void especial(){
        System.out.println("realizar: " +  this.habilidad2 );
    }

    public Personaje(String habilidad, String habilidad2) {
        this.habilidad = habilidad;
        this.habilidad2 = habilidad2;
    }


}


class PersonajeMejorado extends Personaje{

    public PersonajeMejorado(String habilidad, String habilidad2) {
        super(habilidad, habilidad2);
    }

    @Override
    void especial(){
        System.out.println("realizar: " +  this.habilidad + " " + this.habilidad2 );

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("personaje 1 ");
        Personaje jugador = new Personaje("correr","patear Penales");
        jugador.especial();

        PersonajeMejorado atleta = new PersonajeMejorado("correr","saltar");
        System.out.printf("deportista: ");

        atleta.especial();
    }



}