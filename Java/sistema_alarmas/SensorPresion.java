package sistema_alarmas;

public class SensorPresion extends Dispositivo{
    public SensorPresion(boolean conectado, int medida, int umbral_inicial, int año_adquisicion) {
        super(conectado, medida, umbral_inicial, año_adquisicion);
    }

    public void Alarma(){
        if(getConectado() && getUmbral_inicial() < getMedida()){
            System.out.println("Sensor de presion activado");
            setAlarma_activada(true);
        }else{
            setAlarma_activada(false);
        }
    }
}
