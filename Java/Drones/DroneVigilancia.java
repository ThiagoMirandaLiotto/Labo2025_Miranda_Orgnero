package Drones;

import java.time.LocalDate;

class DroneVigilancia extends Drone {
    private double memoriaDisponibleMB;

    public DroneVigilancia(String modelo, LocalDate fechaAdquisicion, double bateria, Estado estado, double memoriaDisponibleMB) {
        super(modelo, fechaAdquisicion, bateria, estado);
        this.memoriaDisponibleMB = memoriaDisponibleMB;
    }

    @Override
    public boolean ejecutarMision(double latDestino, double lonDestino) {
        double distancia = calcularDistancia(latDestino, lonDestino);
        int fotos = (int)(distancia / 2); // Una foto cada 2 km
        double espacioRequerido = fotos * 12; // 12 MB por foto
        if (memoriaDisponibleMB >= espacioRequerido) {
            memoriaDisponibleMB -= espacioRequerido;
            return true;
        }
        return false;
    }
}
