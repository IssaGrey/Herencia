import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro("Lupe "," Chunky Croquetas ",4,"Chiguagua");
        Gato gato1 = new Gato("Michigo "," Croquetas Gatus",2,"Callejero");
        Caballo caballo1 = new Caballo("Pony "," Pasto", 5, "Pueblerino");

        perro1.mostrarAlimento();
        gato1.mostrarAlimento();
        caballo1.mostrarAlimento();
    }
}