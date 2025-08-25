package consumo_electricidad;

import java.util.HashMap;

public abstract class Vivienda {
    private String direccion;
    private int cod;
    private Duenio duenio;
    private HashMap<Mes, Integer> consumo_por_mes;

}
