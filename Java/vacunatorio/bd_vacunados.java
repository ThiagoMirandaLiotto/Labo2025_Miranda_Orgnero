package vacunatorio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class bd_vacunados {
    private HashSet<ciudadano> vacunados;
    private HashMap<Integer, ciudadano> vacunadosPorDNI;
    private HashMap<String, HashSet<ciudadano>> vacunadosPorProvincia;

    private HashMap<vacuna, ciudadano> ciudadanosPorVacuna;






    public void registrarVacuna(int dni, vacuna v, ciudadano c){
        ciudadano existe = vacunadosPorDNI.get(dni);
        if (existe == null){
            vacunadosPorDNI.put(dni, c);
        }
        // agregar la vacuna
        vacunados.add(c);
        if (c.getVacunasAplicadas().contains(v)){
            c.getVacunasAplicadas().add(v);
        }
        else {
            System.out.println("Esta vacuna ya se la dió!");
        }

        // ciudadano por vacuna
        ciudadanosPorVacuna.put(v, c);

        // Actualizo vacunados por provincia
        String provincia = c.getResidencia();
        if (vacunadosPorProvincia.containsKey(provincia)){
            HashSet ciu = vacunadosPorProvincia.get(provincia);
            ciu.add(c);
            vacunadosPorProvincia.put(provincia, ciu);
        }
        else{
            HashSet ciu = new HashSet<>();
            ciu = vacunadosPorProvincia.get(provincia);
            ciu.add(c);
            vacunadosPorProvincia.put(provincia, ciu);
        }

    }


    public HashSet<vacuna> historialVacunas(int dni) {
        ciudadano c = vacunadosPorDNI.get(dni);
        if (c != null) {
            return c.getVacunasAplicadas();
        }
        return new HashSet<>();
    }

    public int cantidadVacunadosPorProvincia(String p) {
        return vacunadosPorProvincia.get(p).size();
    }

    public HashSet<ciudadano> ciudadanosConNVacunas(int cantidad) {
        HashSet<ciudadano> resultado = new HashSet<>();
        for (ciudadano c : vacunadosPorDNI.values()) {
            if (c.getVacunasAplicadas().size() >= cantidad) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    // Obtener ciudadanos que recibieron una vacuna
    public HashSet<ciudadano> ciudadanosConVacuna(String nombreVacuna) {
        HashSet<ciudadano> resultado = new HashSet<>();
        for (ciudadano c : vacunadosPorDNI.values()) {
            for (vacuna v : c.getVacunasAplicadas()) {
                if (v.getComercial().equalsIgnoreCase(nombreVacuna)) {
                    resultado.add(c);
                    break;
                }
            }
        }
        return resultado;
    }
}
