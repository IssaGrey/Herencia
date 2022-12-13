package EntidadaFormas;

import Interfaz.IcalculoFormas;

public class Rectangulo implements IcalculoFormas {

    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public void CalcularArea() {
        double area = base*altura;
        System.out.println(" el area del triangulo es = " + area);
    }

    @Override
    public void CalcularPerimetro() {
       double perimetro = (base+altura) *2 ;
        System.out.println(" el area del triangulo es = " + perimetro);
    }


    }



