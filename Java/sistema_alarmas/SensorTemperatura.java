package sistema_alarmas;

public class SensorTemperatura extends Dispositivo{
    public SensorTemperatura(boolean conectado, int medida, int umbral_inicial, int año_adquisicion) {
        super(conectado, medida, umbral_inicial, año_adquisicion);
    }

    @Override
    public void Alarma(){
        if(getConectado() && getUmbral_inicial() < getMedida()){
            System.out.println("Cuidado! La temperatura sube");
            setAlarma_activada(true);
        }else{
            setAlarma_activada(false);
        }
    }
}


