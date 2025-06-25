/*
package Drones;
import java.time.LocalDate;
public abstract class Drone {
        private static int contadorOperativos = 0;
        private int id;
        private String modelo;
        private LocalDate fechaAdquisicion;
        private double bateria; // en porcentaje
        private Estado estado;

        public static final double LAT_ORIGEN = -34.573195;
        public static final double LON_ORIGEN = -58.504111;

        public Drone(String modelo, LocalDate fechaAdquisicion, double bateria, Estado estado) {
            this.modelo = modelo;
            this.fechaAdquisicion = fechaAdquisicion;
            this.bateria = bateria;
            this.estado = estado;
            if (estado == Estado.OPERATIVO || estado == Estado.EN_VUELO) {
                contadorOperativos++;
                this.id = contadorOperativos;
            } else {
                this.id = -1; // No rastreable
            }
        }

        public void recargar() {
            if (bateria < 20) {
                bateria = 100;
            } else {
                bateria = Math.min(bateria + 10, 100);
            }
        }

        public double calcularDistancia(double latDestino, double lonDestino) {
            double lat1Rad = Math.toRadians(LAT_ORIGEN);
            double lon1Rad = Math.toRadians(LON_ORIGEN);
            double lat2Rad = Math.toRadians(latDestino);
            double lon2Rad = Math.toRadians(lonDestino);

            double dLat = lat2Rad - lat1Rad;
            double dLon = lon2Rad - lon1Rad;
            double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                    Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
            double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
            double radioTierraKm = 6371;
            return radioTierraKm * c;
        }

        public abstract boolean ejecutarMision(double latDestino, double lonDestino);
    }

}
*/