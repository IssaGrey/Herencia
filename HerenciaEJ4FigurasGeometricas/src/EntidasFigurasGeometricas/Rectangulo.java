package EntidasFigurasGeometricas;

public class Rectangulo extends FormasGeometricas {

    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(String forma, Double base, Double altura) {
        super(forma );
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
       // area = base*altura;
      setArea(base*altura) ;
    }
    @Override
    public void CalcularPerimetro() {
      //  perimetro = (base+altura) *2 ;
          setPerimetro ((base+altura) *2) ;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("FORMA " + getForma() + "\n"
                +"Area = "+ getArea()+"\n"
                +"Perimetro = "+ getPerimetro()+"\n") ;
    }
}

