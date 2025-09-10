package arco_y_flecha;

import java.util.HashSet;

public class Bar {
    private HashSet<Diana> Dianas;
    private HashSet<Cliente> clientes;
    private int dineroRecaudado;
    private HashSet<Beneficio> beneficios;

    public Bar(HashSet<Diana> dianas, HashSet<Cliente> clientes, int dineroRecaudado, HashSet<Beneficio> beneficios) {
        Dianas = dianas;
        this.clientes = clientes;
        this.dineroRecaudado = dineroRecaudado;
        this.beneficios = beneficios;
    }

    public HashSet<Diana> getDianas() {
        return Dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        Dianas = dianas;
    }

    public HashSet<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(HashSet<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getDineroRecaudado() {
        return dineroRecaudado;
    }

    public void setDineroRecaudado(int dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }


    public int beneficiosDeTrago(){
        int x = 0;
        for (Beneficio b : beneficios){
            if (b.esAcumulable()){
                x++;
            }
        }

        return x;
    }

    public Diana dianaMasPuntajes(){
        Diana diana = new DianaCircular();
        int x = 0;
        for (Diana d: Dianas){
            if (d.cantidadPuntajes() > x){
                x = d.cantidadPuntajes();
                diana = d;
            }
        }

        return diana;
    }


}
