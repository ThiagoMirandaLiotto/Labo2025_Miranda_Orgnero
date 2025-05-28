package sistema_computadoras;

import java.util.ArrayList;

public class Computadora {
    private Componente CPU;
    private ArrayList<DispositivoEntrada> dispositivosEntrada;
    private ArrayList<DispositivoSalida> dispositivosSalida;

    public Computadora(Componente CPU, ArrayList<DispositivoEntrada> dispositivosEntrada, ArrayList<DispositivoSalida> dispositivosSalida) {
        this.CPU = CPU;
        this.dispositivosEntrada = dispositivosEntrada;
        this.dispositivosSalida = dispositivosSalida;
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
