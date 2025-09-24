package arco_y_flecha;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Color> puntajes1 = new HashMap<>();
        HashSet<String> gaseosas1 = new HashSet<>();

        Diana d1 = new DianaCircular("Thiago", "dificil", puntajes1);
        Cliente c1 = new Cliente("Nicolas", "Orgnero", LocalDate.of(2007, 26, 11));
        Beneficio b1 = new BeneficioGaseosa(12, "Nicolas", gaseosas1);


        HashSet<Diana> dianas1 = new HashSet<>();
        HashSet<Cliente> clientes1 = new HashSet<>();
        HashSet<Beneficio> beneficios1 = new HashSet<>();

        
    }
}
