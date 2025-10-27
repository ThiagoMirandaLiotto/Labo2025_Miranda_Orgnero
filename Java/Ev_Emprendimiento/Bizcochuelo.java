package EvaluacionesInterface.Ev_Emprendimiento;

public class Bizcochuelo extends Preparacion {
    private int limon;
    private int polvoHornear;

    public Bizcochuelo(int harina, int azucar, int manteca, int huevos, int stock, double precio, int limon, int polvoHornear) {
        super(harina, azucar, manteca, huevos, stock, precio);
        this.limon = limon;
        this.polvoHornear = polvoHornear;
    }

    @Override
    public String conocerReceta(){
        return "El bizcochuelo arranca con...";
    }
}
