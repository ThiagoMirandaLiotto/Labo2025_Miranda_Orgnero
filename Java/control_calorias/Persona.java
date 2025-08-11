package control_calorias;

import java.time.LocalDate;
import java.util.HashSet;

public class Persona {
    private String nombre;
    private LocalDate nacimiento;
    private HashSet<Plato> registro_platos;

    public int calorias_totales(){
        int total = 0;
        for(Plato p : registro_platos){
            total += p.getCalorias();
        }
        return total;
    }


}
