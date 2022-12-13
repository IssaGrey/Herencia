
import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import Servicio.ServiLavadora;
import Servicio.ServiTv;


public class Main {
    public static void main(String[] args) {

        ServiLavadora sv = new ServiLavadora();
        Lavadora x = sv.crearLavadora();
        sv.precioFinal(x);
        sv.mostrarLavadora(x);

        ServiTv sT = new ServiTv();
        Televisor tv = sT.crearTv();
        sT.precioFinal(tv);
        sT.mostrarTv(tv);
    }
}