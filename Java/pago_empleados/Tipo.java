package pago_empleados;

public enum Tipo {
    UX(8), UI(7), IT(12);

    private int comision;
    private Tipo (int comision){
        this.comision = comision;
    }
}
