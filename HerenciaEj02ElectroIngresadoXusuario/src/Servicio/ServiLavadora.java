package Servicio;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ServiLavadora extends ServiElectro {
 Scanner leer = new Scanner(System.in);
/*   Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    el atributo propio de la lavadora.*/

   public Lavadora  crearLavadora() {
       System.out.println(" Ingrese los datos de la lavadora  ");
       Electrodomestico l = super.crearElectro();
       System.out.println("Ingrese la carga de la lavadora ");

       int carga = leer.nextInt();

       return  new Lavadora(l.getPrecio(),l.getColor(),l.getLetra(),l.getPeso(),carga);
   }

/* Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    visto en la clase Electrodoméstico también deben afectar al precio*/

//POR QUE NO SOBRE ESCRIBI EL METODO, PRECIO FINAL? POR QUE ME PIDE COMO PARAMETRO UN ELECTRODOMENTICO Y LO QUE NECESITO ES EL PRECIO FINAL DE LA LAVADADORA
    public void precioFinal(Lavadora lav) {
        super.precioFinal(lav);
        if (lav.getCarga()>30){
            lav.setPrecio(lav.getPrecio()+500);
        }

    }
    public void mostrarLavadora(Lavadora lav){
        System.out.println("---Lavadora----" +"\n"+ "Precio "+lav.getPrecio()+"\n"+ "Color "+lav.getColor()+"\n" + "Consumo energetico "+lav.getLetra()+"\n"+ "Peso "+lav.getPeso()+ "\n"+"Carga "+ lav.getCarga());

    }
}
