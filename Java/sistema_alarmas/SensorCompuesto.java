package sistema_alarmas;

public class SensorCompuesto {
    private DetectorHumo detectorHumo;
    private SensorPresion sensorPresion;
    private SensorTemperatura sensorTemperatura;

    public SensorCompuesto(DetectorHumo detectorHumo, SensorPresion sensorPresion, SensorTemperatura sensorTemperatura) {
        this.detectorHumo = detectorHumo;
        this.sensorPresion = sensorPresion;
        this.sensorTemperatura = sensorTemperatura;
    }

    public DetectorHumo getDetectorHumo() {
        return detectorHumo;
    }
    public void setDetectorHumo(DetectorHumo detectorHumo) {
        this.detectorHumo = detectorHumo;
    }
    public SensorPresion getSensorPresion() {
        return sensorPresion;
    }
    public void setSensorPresion(SensorPresion sensorPresion) {
        this.sensorPresion = sensorPresion;
    }
    public SensorTemperatura getSensorTemperatura() {
        return sensorTemperatura;
    }
    public void setSensorTemperatura(SensorTemperatura sensorTemperatura) {
        this.sensorTemperatura = sensorTemperatura;
    }


    public void Alarma(){
        detectorHumo.Alarma();
        sensorPresion.Alarma();
        sensorTemperatura.Alarma();

        if(detectorHumo.isAlarma_activada() && sensorPresion.isAlarma_activada() && sensorTemperatura.isAlarma_activada()){
            System.out.println("Alarma compuesta activada!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
}
