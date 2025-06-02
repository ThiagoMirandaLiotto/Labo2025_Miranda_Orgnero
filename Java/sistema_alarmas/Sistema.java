package sistema_alarmas;

public class Sistema {
    public static void main(String[] args) {
        DetectorHumo dh1 = new DetectorHumo(true, 50, 60, 2000);
        DetectorHumo dh2 = new DetectorHumo(true, 50, 40, 2000);

        SensorPresion sp1 = new SensorPresion(false, 50, 40, 2000);
        SensorPresion sp2 = new SensorPresion(true, 50, 40, 2000);

        SensorTemperatura st1 = new SensorTemperatura(true, 50, 40, 2000);

        SensorCompuesto sc1 = new SensorCompuesto(dh2, sp2, st1);

        dh1.Alarma();
        sp1.Alarma();
        sc1.Alarma();
    }
}
