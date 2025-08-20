package control_calorias;

import java.util.HashSet;

public class Familia {
    HashSet<Persona> familiares;

    public int promedio_calorias(){
        int total = 0;
        for(Persona p : familiares){
            total += p.calorias_totales();
        }

        return total / familiares.size();
    }

    public Persona mas_calorias(){
        Persona p_mas_calorias = new Persona();
        for(Persona p : familiares){
            if(p.calorias_totales() > p_mas_calorias.calorias_totales()){
                p_mas_calorias = p;
            }
        }
        return p_mas_calorias;
    }

    public Persona menos_calorias(){
        Persona p_menos_calorias = null;
        for(Persona p : familiares){
            if(p.calorias_totales() < p_menos_calorias.calorias_totales()){
                p_menos_calorias = p;
            }
        }
        return p_menos_calorias;
    }
}
