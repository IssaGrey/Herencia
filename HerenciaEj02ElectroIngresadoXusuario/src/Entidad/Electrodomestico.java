package Entidad;

import java.util.Scanner;

public class Electrodomestico {
    protected Integer precio;
    protected String color;
    protected char letra;
    protected Double peso;

    public Electrodomestico() {
    }
     public Electrodomestico(Integer precio, String color, char letra, Double peso) {
        this.precio = precio;
        this.color = compruebaColor(color);
        this.letra = Comprueba (letra);
        this.peso = peso;
    }
    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = compruebaColor(color);
    }
    public char getLetra() {

        return letra;
    }
    public void setLetra(char letra) {

        this.letra = Comprueba (letra);
    }
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    // METODOS
    private char Comprueba (char letra){
        if ( letra != 'A' && letra != 'B' && letra != 'C' && letra != 'D' && letra != 'E' && letra != 'F'){
            letra = 'F';
        }
        return letra;
    }
    private String compruebaColor (String color){
        if (! color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro")&&
                !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") &&
                !color.equalsIgnoreCase("gris") ){
            color = "blanco";
        }
        return color;
    }
    public String mostrarDatos() {
        return
                "Precio =" + precio +"\n"+ "Color ='" + color +"\n" + "Consumo energetico =" + letra +"\n"+"Peso =" + peso ;
 }
}




