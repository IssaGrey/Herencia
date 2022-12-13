import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <Animal> animals = new ArrayList<>();
        Perro perro1 = new Perro();
        animals.add(new Animal());
        animals.add(new Gato());
        animals.add(perro1);

        for (Animal aux : animals ) {
            aux.saludo();
        }
    }
}