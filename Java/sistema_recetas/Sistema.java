package sistema_recetas;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Receta> recetas;




    public Sistema(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public void agregarReceta(Receta receta){
        recetas.add(receta);
    }
    public void eliminarReceta(Receta receta){
        recetas.remove(receta);
    }
    public void modificarReceta(Receta recetaVieja, Receta recetaNueva){
        recetas.remove(recetaVieja);
        recetas.add(recetaNueva);
    }

    public void recetasDificultad(Dificultad dificultad){
        System.out.println("Recetas " + dificultad.name() + ":");
        for(Receta r : recetas){
            if (r.getDificultad() == dificultad){
                System.out.println(r.getNombre());
            }
        }
    }

    public void recetasPorTipo(){
        System.out.println("Postres: ");
        recetasTipo(Tipo.POSTRE);

        System.out.println("Entradas: ");
        recetasTipo(Tipo.ENTRADA);

        System.out.println("Principales: ");
        recetasTipo(Tipo.PRINCIPAL);

    }
    public void recetasTipo(Tipo tipo){
        for(Receta r : recetas){
            if(r.getTipo() == tipo){
                System.out.println(r.getNombre());
            }
        }
        System.out.println();
    }

    public void cantidadRecetas(){
        System.out.println("Cantidad de recetas: " + recetas.size());
    }



    public void recetaMasLarga(){
        Receta recetaLarga;
        int pasos = 0;

        for(Receta r : recetas){
            if(r.getPasos().size() > pasos){
                recetaLarga = r;
                pasos = r.getPasos().size();
            }
        }
    }



    public static void main(String[] args) {
        ArrayList<Receta> recetas1 = new ArrayList<>();
        Sistema sistema = new Sistema(recetas1);


        ArrayList<String> pasos1 = new ArrayList<>();
        pasos1.add("Picar vegetales");
        pasos1.add("Mezclar con aderezo");

        ArrayList<String> pasos2 = new ArrayList<>();
        pasos2.add("Sellar la carne");
        pasos2.add("Agregar condimentos");
        pasos2.add("Hornear 40 min");

        ArrayList<String> pasos3 = new ArrayList<>();
        pasos3.add("Batir huevos con azúcar");
        pasos3.add("Agregar harina");
        pasos3.add("Hornear 30 minutos");
        pasos3.add("Dejar enfriar");

        Receta principal = new Plato_principal("carne", Dificultad.MEDIO, pasos2, 45, 4);
        Receta entrada = new Plato_entrada("ensalada", Dificultad.FACIL, pasos1, Temperatura.FRIO);
        Receta postre = new Plato_postre("bizcochuelo", Dificultad.AVANZADO, pasos3, 200, false);
        sistema.agregarReceta(entrada);
        sistema.agregarReceta(principal);
        sistema.agregarReceta(postre);

        sistema.recetasPorTipo();

        sistema.recetasDificultad(Dificultad.FACIL);
        System.out.println();

        sistema.cantidadRecetas();
        System.out.println();

        sistema.recetaMasLarga();
        System.out.println();

        Receta nuevaEntrada = new Plato_entrada("super ensalada", Dificultad.MEDIO, pasos1, Temperatura.FRIO);
        sistema.modificarReceta(entrada, nuevaEntrada);

        sistema.recetasPorTipo();
        System.out.println();

        sistema.eliminarReceta(postre);
        sistema.cantidadRecetas();
    }
}
