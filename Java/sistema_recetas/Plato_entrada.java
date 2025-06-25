package sistema_recetas;

import java.util.ArrayList;

public class Plato_entrada extends Receta {
    private Temperatura temperatura;
    private Tipo tipo = Tipo.ENTRADA;

    public Plato_entrada(String nombre, Dificultad dificultad, ArrayList<String> pasos, Temperatura temperatura) {
        super(nombre, dificultad, pasos);
        this.temperatura = temperatura;
    }

    @Override
    public Tipo getTipo() {
        return tipo;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    void mostrarInstrucciones() {
        if (temperatura == temperatura.FRIO){
            for(String p : getPasos()){
                System.out.println(p);
            }
            System.out.println("Recordar guardar la preparacion en la heladera");
        }else{
            System.out.println("Recuerde prender el horno");
            for(String p : getPasos()){
                System.out.println(p);
            }
        }
    }
}

