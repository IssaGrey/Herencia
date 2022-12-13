package Servicio;

import Entidad.Electrodomestico;

import java.util.Scanner;

public class ServiElectro  {

//• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
    public Electrodomestico crearElectro() {
      Scanner leer = new Scanner(System.in);

        Integer precio = 1000;
        System.out.println("Ingrese el color ");
        String color = (leer.next());
        System.out.println("Ingrese el consumo energetico de A a la F ");
        char letra = (leer.next().charAt(0));
        System.out.println("Ingrese el peso del electrodomestico");
        Double peso = (leer.nextDouble());

        return new Electrodomestico(precio, color, letra, peso);
    }

        public void precioFinal(Electrodomestico aux) {

            char letras[] = {'A', 'B', 'C', 'D', 'E', 'F'};
            double precios[] = {1000, 800, 600, 500, 300, 100};
/*
            for (int i = 0; i < letras.length; i++) {
                if (letras[i] == e.getLetra()) {
                    e.setPrecio((int) (e.getPrecio() + precios[i]));
                }
            }

            if (e.getPeso() >= 1 && e.getPeso() <= 19) {
                e.setPrecio(e.getPrecio() + 100);
            } else if (e.getPeso() <= 49) {
                e.setPrecio(e.getPrecio() + 500);
            } else if (e.getPeso() <= 79) {
                e.setPrecio(e.getPrecio() + 800);
            } else {
                e.setPrecio(e.getPrecio() + 1000);
            }
        }*/

        if (aux.getPeso() > 1 && aux.getPeso() <20) {
            aux.setPrecio(aux.getPrecio() + 100);
        }
        else if ( aux.getPeso() < 50)
            aux.setPrecio(aux.getPrecio() + 500);

        else if (aux.getPeso() < 80)
            aux.setPrecio(aux.getPrecio() + 800);

        else if (aux.getPeso() > 80)
            aux.setPrecio(aux.getPrecio() + 1000);

        switch (aux.getLetra()) {

            case 'A':
                aux.setPrecio(aux.getPrecio() + 1000);
                break;
            case 'B':
                aux.setPrecio(aux.getPrecio() + 800);
                break;
            case 'C':
                aux.setPrecio(aux.getPrecio() + 600);
                break;
            case 'D':
                aux.setPrecio(aux.getPrecio() + 500);
                break;
            case 'E':
                aux.setPrecio(aux.getPrecio() + 300);
                break;
            case 'F':
                aux.setPrecio(aux.getPrecio() + 100);
                break;
        }
    }
}
