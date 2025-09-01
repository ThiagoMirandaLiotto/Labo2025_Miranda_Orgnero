package sistema_computadoras;

import java.util.ArrayList;

public class Computadora {
    private Componente CPU;
    private ArrayList<DispositivoEntrada> dispositivosEntrada;
    private ArrayList<DispositivoSalida> dispositivosSalida;

    public Computadora(Componente CPU, ArrayList<DispositivoEntrada> dispositivosEntrada, ArrayList<DispositivoSalida> dispositivosSalida)
            throws ComponenteFaltanteException {
        this.CPU = CPU;
        this.dispositivosEntrada = dispositivosEntrada;
        this.dispositivosSalida = dispositivosSalida;
        validarComponentes();
    }

    private void validarComponentes() throws ComponenteFaltanteException {
        if (CPU == null) {
            throw new ComponenteFaltanteException("La computadora debe tener una CPU.");
        }
        if (dispositivosEntrada == null || dispositivosEntrada.isEmpty()) {
            throw new ComponenteFaltanteException("La computadora debe tener al menos un dispositivo de entrada.");
        }
        if (dispositivosSalida == null || dispositivosSalida.isEmpty()) {
            throw new ComponenteFaltanteException("La computadora debe tener al menos un dispositivo de salida.");
        }
    }

    public Componente getCPU() {
        return CPU;
    }
    public void setCPU(Componente CPU) {
        this.CPU = CPU;
    }
    public ArrayList<DispositivoEntrada> getDispositivosEntrada() {
        return dispositivosEntrada;
    }
    public void setDispositivosEntrada(ArrayList<DispositivoEntrada> dispositivosEntrada) {
        this.dispositivosEntrada = dispositivosEntrada;
    }
    public ArrayList<DispositivoSalida> getDispositivosSalida() {
        return dispositivosSalida;
    }
    public void setDispositivosSalida(ArrayList<DispositivoSalida> dispositivosSalida) {
        this.dispositivosSalida = dispositivosSalida;
    }
}
