package Servicio;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ServiTv extends ServiElectro {

    public Televisor crearTv (){
        Scanner leer = new Scanner(System.in);

        Electrodomestico tv = super.crearElectro();
        System.out.println("Ingrese la resolucion del Televisor ");
        Double resolucion = leer.nextDouble();
        System.out.println("El Televisor tiene TDT? marca S para Si y N para No  ");
        boolean tdt = leer.next().equalsIgnoreCase("S");

        return new Televisor(tv.getPrecio(),tv.getColor(),tv.getLetra(),tv.getPeso(),resolucion,tdt);
    }
/*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.*/
    public void precioFinal(Televisor tv) {
        System.out.println(" Ingrese los datos del Televisor ");
        super.precioFinal (tv);

        if (tv.getResolucion() > 40){
            tv.setPrecio((int) (tv.getPrecio() + 1.3));
        }
        if (tv.isTdt()){
            tv.setPrecio( (tv.getPrecio() +500));
        }
    }
    public void mostrarTv(Televisor tv){
        System.out.printf("---Televisor----\nPrecio %d\nColor %s\nConsumo energetico %s\nPeso %s\nResolucion %s\nTDT %s..%n", tv.getPrecio(), tv.getColor(), tv.getLetra(), tv.getPeso(), tv.getResolucion(), tv.isTdt());

    }

}
