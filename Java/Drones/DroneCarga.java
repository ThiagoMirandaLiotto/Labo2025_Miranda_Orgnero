package Drones;

import java.time.LocalDate;

class DroneCarga extends Drone {
    private double pesoCarga;

    public DroneCarga(String modelo, LocalDate fechaAdquisicion, double bateria, Estado estado, double pesoCarga) {
        super(modelo, fechaAdquisicion, bateria, estado);
        this.pesoCarga = pesoCarga;
    }

    @Override
    public boolean ejecutarMision(double latDestino, double lonDestino) {
        double distancia = calcularDistancia(latDestino, lonDestino);
        if (distancia <= 30) {
            double consumo = 48.0;
            if (bateria >= consumo) {
                bateria -= consumo;
                return true;
            }
        }
        return false;
    }
}