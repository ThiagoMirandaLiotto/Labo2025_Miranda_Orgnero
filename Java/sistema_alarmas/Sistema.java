package sistema_alarmas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

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

        System.out.println("Ingrese un dispositivo del 0 al " + s.dispositivos.size());
        Scanner scanner = new Scanner(System.in);
        try {
            int dispositivo = scanner.nextInt();

            if(dispositivo < 0 || dispositivo > s.dispositivos.size()){
                throw new RuntimeException("No existe el dispositivo con ese numero");
            }

            Dispositivo d;
            d = s.dispositivos.get(dispositivo);

            System.out.println("Dispositivo numero: " + dispositivo);
            System.out.println("Año de adquisicion: " + d.getAño_adquisicion());
            System.out.println("Estado (conectado o desconectado): " + d.getConectado());
            System.out.println("Medida: " + d.getMedida());
            System.out.println("Estado (activado o desactivado):" + d.isAlarma_activada());
            System.out.println("Umbral inicial: " + d.getUmbral_inicial());
            System.out.println("Tipo: " + d.getClass());
        } catch (RuntimeException e) {
            System.err.println("Valor ingresado invalido. " + e);
        }





    }
}
