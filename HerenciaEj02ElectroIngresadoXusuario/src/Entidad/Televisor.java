package Entidad;

/*Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos heredados.
• Get and Set
*/

public class Televisor  extends Electrodomestico {
    private Double resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(Integer precio, String color, char letra, Double peso, Double resolucion, boolean tdt) {
        super(precio, color, letra, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
}