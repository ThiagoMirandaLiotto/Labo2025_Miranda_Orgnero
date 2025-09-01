package consumo_electricidad;

import java.util.HashMap;
import java.util.Map;

public class Casa extends Vivienda {
    private int metros_cubiertos;
    private int metros_descubiertos;
    private static int precio = 100;

    public int getMetros_cubiertos() {
        return metros_cubiertos;
    }

    public void setMetros_cubiertos(int metros_cubiertos) {
        this.metros_cubiertos = metros_cubiertos;
    }

    public int getMetros_descubiertos() {
        return metros_descubiertos;
    }

    public void setMetros_descubiertos(int metros_descubiertos) {
        this.metros_descubiertos = metros_descubiertos;
    }

    public Casa(String direccion, int cod, Duenio duenio, int metros_cubiertos, int metros_descubiertos) {
        super(direccion, cod, duenio);
        this.metros_cubiertos = metros_cubiertos;
        this.metros_descubiertos = metros_descubiertos;
    }

    @Override
    public int cuantoPagar() {
        int consumoTotal = 0;
        for (Map.Entry<Integer, HashMap<Mes, Integer>> m: getConsumo_por_mes().entrySet()){
            for (Mes mes: Mes.values()){
                consumoTotal += m.getValue().get(mes);
            }
        }

        return consumoTotal * precio;
    }
}
