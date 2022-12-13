package EntidasFigurasGeometricas;


public  class Circulo extends FormasGeometricas {

    private Double radio;


    public Circulo() {
    }

    public Circulo( Double radio) {
        super("circulo");
        this.radio = radio;

    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }


    //METODOS
    @Override
    public void CalcularArea() {
        setForma("circulo");
        setArea(PiCONSTANTE * Math.pow(getRadio(), 2));
       // System.out.println("Area de Circulo = " + getArea());

    }

    @Override
    public void CalcularPerimetro() {
        setPerimetro(2 * PiCONSTANTE * getRadio());
      //  System.out.println("perimetro de circulo = " + getPerimetro());
    }

    public void mostrarDatos() {
        System.out.println("FORMA " + getForma()+ "\n"
                + "Area = " + getArea() + "\n"
                + "Perimetro = " + getPerimetro() + "\n");


    }
}