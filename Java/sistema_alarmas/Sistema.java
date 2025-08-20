package sistema_alarmas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Dispositivo> dispositivos;
    public Sistema(){
      this.dispositivos = new ArrayList<>();
    }
    public void añadirDispositivo(Dispositivo d){
        dispositivos.add(d);
    }

    public static void main(String[] args) {
        Sistema s = new Sistema();
        DetectorHumo dh1 = new DetectorHumo(true, 50, 60, 2000);
        DetectorHumo dh2 = new DetectorHumo(true, 50, 40, 2000);

        SensorPresion sp1 = new SensorPresion(false, 50, 40, 2000);
        SensorPresion sp2 = new SensorPresion(true, 50, 40, 2000);

        SensorTemperatura st1 = new SensorTemperatura(true, 50, 40, 2000);

        SensorCompuesto sc1 = new SensorCompuesto(dh2, sp2, st1);

        dh1.Alarma();
        sp1.Alarma();
        sc1.Alarma();

        s.añadirDispositivo(dh1);
        s.añadirDispositivo(dh2);
        s.añadirDispositivo(sp1);
        s.añadirDispositivo(sp2);
        s.añadirDispositivo(st1);


    }
}
