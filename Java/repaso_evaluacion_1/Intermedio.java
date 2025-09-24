package repaso_evaluacion_1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Intermedio extends Participante implements CocinarPlatoPrincipal{
    private HashMap<String, Integer> stock_propio;

    public Intermedio(String nombre, String apellido, LocalDate nacimiento, String localidad, Equipo equipo, HashMap<String, Integer> stock_propio) {
        super(nombre, apellido, nacimiento, localidad, equipo);
        this.stock_propio = stock_propio;
    }

    public HashMap<String, Integer> getStock_propio() {
        return stock_propio;
    }
    public void setStock_propio(HashMap<String, Integer> stock_propio) {
        this.stock_propio = stock_propio;
    }

    @Override
    public void prepararLugar() {
        System.out.println("Mi stock a utilizar es de: ");
        for (Map.Entry<String, Integer> e : this.stock_propio.entrySet()){
            if (e.getValue() > 1){
                System.out.println(e.getKey());
            }
        }
    }

    @Override
    public void cocinarYServirPrincipal(PlatoPrincipal plato) {
        for (Map.Entry<String, Integer> i: this.stock_propio.entrySet()){
            if (!plato.getIngredientes().values().contains(i.getValue())){
                throw new IngredienteNoDisponibleException("El participante no tiene el ingrediente: " + i.getKey());
            }else if (plato.getIngredientes().get(i.getKey()) < i.getValue()){
                throw new IngredienteNoDisponibleException("El participante no tiene suficientes " + i.getKey());
            }
        }
        System.out.println("Plato principal cocinado y servido con exito");
    }
}
