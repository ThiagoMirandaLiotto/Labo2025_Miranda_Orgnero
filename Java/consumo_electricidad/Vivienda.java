package consumo_electricidad;

import java.util.HashMap;

public abstract class Vivienda {
    private String direccion;
    private int cod;
    private Duenio duenio;
    private HashMap<Integer, HashMap<Mes, Integer>> consumo_por_mes;

    public Vivienda(String direccion, int cod, Duenio duenio) {
        this.direccion = direccion;
        this.cod = cod;
        this.duenio = duenio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public HashMap<Integer, HashMap<Mes, Integer>> getConsumo_por_mes() {
        return consumo_por_mes;
    }

    public void setConsumo_por_mes(HashMap<Integer, HashMap<Mes, Integer>> consumo_por_mes) {
        this.consumo_por_mes = consumo_por_mes;
    }





    public void cargarConsumo(int año, Mes mes, int consumo){
        HashMap<Mes,Integer> consumomes = consumo_por_mes.get(año);
        if (consumomes.get(mes) == null){
            consumomes.put(mes, consumo);
        }

        consumo_por_mes.put(año, consumomes);
    }

    public abstract int cuantoPagar();
}
