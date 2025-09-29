package repaso_evaluacion_1;

import java.time.LocalDate;

public class Experto extends Participante implements CocinarPlatoPrincipal, CocinarPlatoEntrada{
    private static int tiempo_limite = 80;
    private int tiempo_restante;

    public Experto(String nombre, String apellido, LocalDate nacimiento, String localidad, Equipo equipo) {
        super(nombre, apellido, nacimiento, localidad, equipo);
        this.tiempo_restante = tiempo_limite;
    }

    public static int getTiempo_limite() {
        return tiempo_limite;
    }
    public static void setTiempo_limite(int tiempo_limite) {
        Experto.tiempo_limite = tiempo_limite;
    }
    public int getTiempo_restante() {
        return tiempo_restante;
    }
    public void setTiempo_restante(int tiempo_restante) {
        this.tiempo_restante = tiempo_restante;
    }

    @Override
    public void prepararLugar() {
        tiempo_restante -= 5;
        System.out.println("Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es: " + tiempo_restante);
    }


    @Override
    public void cocinarYServirEntrada(PlatoEntrada plato) throws TiempoInsuficienteException{
        if(plato.getTiempo() > this.tiempo_restante){
            throw new TiempoInsuficienteException("Tiempo insuficiente para la receta");
        }else{
            System.out.println("Experto: Entrada cocinada y servida con exito");
        }
    }

    @Override
    public void cocinarYServirPrincipal(PlatoPrincipal plato) throws TiempoInsuficienteException{
        if(plato.getTiempo() > this.tiempo_restante){
            throw new TiempoInsuficienteException("Tiempo insuficiente para la receta");
        }
        System.out.println("Experto: Plato principal cocinado y servido con exito");

    }
}
