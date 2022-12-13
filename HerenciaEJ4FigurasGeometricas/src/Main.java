import EntidasFigurasGeometricas.Circulo;
import EntidasFigurasGeometricas.FormasGeometricas;
import EntidasFigurasGeometricas.Rectangulo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<FormasGeometricas> FG = new ArrayList<>();
        Rectangulo rec1 = new Rectangulo("Rectangulo",15.0,10.0);
        rec1.CalcularArea();
        rec1.CalcularPerimetro();
        rec1.mostrarDatos();

        Circulo c1 = new Circulo();
        System.out.println("Ingrese el radio del circulo");
        c1.setRadio(leer.nextDouble());


        c1.CalcularArea();
        c1.CalcularPerimetro();
        c1.mostrarDatos();

    }

}