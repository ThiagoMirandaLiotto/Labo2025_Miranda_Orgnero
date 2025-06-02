package sistema_alarmas;

public class Dispositivo {
    private boolean alarma_activada = false;
    private boolean conectado;
    private int medida;
    private int umbral_inicial;
    private int año_adquisicion;
    public Dispositivo(boolean conectado, int medida, int umbral_inicial, int año_adquisicion) {
        this.conectado = conectado;
        this.medida = medida;
        this.umbral_inicial = umbral_inicial;
        this.año_adquisicion = año_adquisicion;
    }

    public boolean getConectado() {
        return conectado;
    }
    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
    public int getMedida() {
        return medida;
    }
    public void setMedida(int medida) {
        this.medida = medida;
    }
    public int getUmbral_inicial() {
        return umbral_inicial;
    }
    public void setUmbral_inicial(int umbral_inicial) {
        this.umbral_inicial = umbral_inicial;
    }
    public int getAño_adquisicion() {
        return año_adquisicion;
    }
    public void setAño_adquisicion(int año_adquisicion) {
        this.año_adquisicion = año_adquisicion;
    }

    public boolean isAlarma_activada() {
        return alarma_activada;
    }

    public void setAlarma_activada(boolean alarma_activada) {
        this.alarma_activada = alarma_activada;
    }
}
