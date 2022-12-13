package EntidasFigurasGeometricas;

import Interfaz.IcalculoFormas;

public  abstract class FormasGeometricas  implements IcalculoFormas {
   protected String forma;
   protected  Double area;
   protected Double perimetro;
    public FormasGeometricas() {
    }

    public FormasGeometricas(String forma) {
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public void   CalcularArea() {

    }

    @Override
    public  void CalcularPerimetro() {

    }

    public  void mostrarDatos(){
        System.out.println("FORMA " + getForma() + "\n"
                +"Area = "+ getArea()+"\n"
                +"Perimetro = "+ getPerimetro()+"\n") ;
    }

}

