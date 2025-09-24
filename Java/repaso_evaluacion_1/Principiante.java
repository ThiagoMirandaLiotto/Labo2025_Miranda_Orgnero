package repaso_evaluacion_1;

import java.time.LocalDate;
import java.util.HashSet;

public class Principiante extends Participante implements CocinarPlatoEntrada{
    private HashSet<String> ingredientes_prohibidos;

    public Principiante(String nombre, String apellido, LocalDate nacimiento, String localidad, Equipo equipo, HashSet<String> ingredientes_prohibidos) {
        super(nombre, apellido, nacimiento, localidad, equipo);
        this.ingredientes_prohibidos = ingredientes_prohibidos;
    }

    public HashSet<String> getIngredientes_prohibidos() {
        return ingredientes_prohibidos;
    }
    public void setIngredientes_prohibidos(HashSet<String> ingredientes_prohibidos) {
        this.ingredientes_prohibidos = ingredientes_prohibidos;
    }


    @Override
    public void prepararLugar() {
        System.out.println("Ya guarde todos los elementos prohibidos y no voy a usar: ");
        for (String e: this.ingredientes_prohibidos){
            System.out.println(e);
        }
    }

    @Override
    public void cocinarYServirEntrada(PlatoEntrada plato) throws IngredienteNoDisponibleException {
        for (String i : this.ingredientes_prohibidos){
            if (plato.getIngredientes().containsKey(i)){
                throw new IngredienteNoDisponibleException("El participante no puede usar el ingrediente " + i);
            }
        }

        System.out.println("Entrada cocinada y servida con exito");
    }
}
