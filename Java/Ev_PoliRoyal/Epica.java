package EvaluacionesInterface.Ev_PoliRoyal;

public class Epica extends Carta{
    private int segParaUsar;

    public Epica(String nombre, int danio, int vida, Arena arena, int segParaUsar) {
        super(nombre, danio, vida, arena);
        this.segParaUsar = segParaUsar;
    }

    @Override
    public boolean validarAtributos() throws valoresIconrrectosCartaException{
        if (getDanio() > 0 && getVida() > 0 && segParaUsar > 0){
            return true;
        }else {
            throw new valoresIconrrectosCartaException("Carta con valores inválidos");
        }
    }
    @Override
    public void fraseIconica(){
        System.out.println("Soy una carta épica, me jugaron y me desbloqueo en: " + segParaUsar);
    }
}
