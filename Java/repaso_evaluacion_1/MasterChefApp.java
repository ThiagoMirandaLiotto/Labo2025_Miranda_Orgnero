package repaso_evaluacion_1;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class MasterChefApp {
    public static void main(String[] args) {
        //////////////////////////////////////
        HashSet<String> p1i = new HashSet<>();
        HashSet<String> p2i = new HashSet<>();
        p1i.add("Tomate");
        p1i.add("Cebolla");
        p2i.add("Mayonesa");
        p2i.add("Esparragos");
        Principiante p1 = new Principiante("Thiago", "Miranda", LocalDate.of(2007, 10, 5), "Saavedra", Equipo.AZUL, p1i);
        Principiante p2 = new Principiante("Santiago", "Buhler", LocalDate.of(2008, 1, 22), "Urquiza", Equipo.VERDE, p2i);

        HashMap<String, Integer> i1i= new HashMap<>();
        HashMap<String, Integer> i2i= new HashMap<>();
        i1i.put("Tomate", 5);
        i1i.put("Cebolla", 10);
        i1i.put("Lechuga", 12);
        i1i.put("Zanahoria", 10);
        i1i.put("Pepino", 6);
        i1i.put("Ajo", 2);
        i1i.put("Pimiento rojo", 8);
        i1i.put("Papa", 10);

        i2i.put("Mayonesa", 3);
        i2i.put("Esparragos", 6);
        i2i.put("Queso rallado", 5);
        i2i.put("Jamón", 9);
        i2i.put("Aceitunas", 4);
        i2i.put("Mostaza", 2);
        i2i.put("Ketchup", 7);
        i2i.put("Salsa de soja", 8);
        Intermedio i1 = new Intermedio("Thiago2", "Miranda2", LocalDate.of(2007, 10, 5), "Saavedra", Equipo.ROJO, i1i);
        Intermedio i2 = new Intermedio("Santiago2", "Buhler2", LocalDate.of(2008, 1, 22), "Urquiza", Equipo.AZUL, i2i);

        Experto e1 = new Experto("Thiago3", "Miranda3", LocalDate.of(2007, 10, 5), "Saavedra", Equipo.VERDE);
        Experto e2 = new Experto("Santiago3", "Buhler3", LocalDate.of(2008, 1, 22), "Urquiza", Equipo.ROJO);

        //////////////////////////////////////
        p1.prepararLugar();
        System.out.println(" ");
        i1.prepararLugar();
        System.out.println(" ");
        e1.prepararLugar();
        System.out.println(" ");

        //////////////////////////////////////
        HashMap<String, Integer> pe1 = new HashMap<>();
        HashMap<String, Integer> pe2 = new HashMap<>();
        pe1.put("Tomate", 5);
        pe1.put("Cebolla", 8);
        pe1.put("Lechuga", 10);
        pe1.put("Zanahoria", 7);
        pe2.put("Zanahoria", 15);


        PlatoEntrada entrada1 = new PlatoEntrada(pe1, 40);
        PlatoEntrada entrada2 = new PlatoEntrada(pe2, 100);

        PlatoPrincipal principal1 = new PlatoPrincipal(pe1, 40);
        PlatoPrincipal principal2 = new PlatoPrincipal(pe2, 100);
        //////////////////////////////////////
        try{
            p1.cocinarYServirEntrada(entrada1);
        } catch (IngredienteNoDisponibleException e) {
            System.err.println("Principiante 1 - Error: " + e);
        }
        try{
            p1.cocinarYServirEntrada(entrada2);
        } catch (IngredienteNoDisponibleException e) {
            System.err.println("Principiante 2 - Error: " + e);
        }

        try {
            i1.cocinarYServirPrincipal(principal1);
        } catch (IngredienteNoDisponibleException e) {
            System.err.println("Intermedio 1 - Error: " + e);
        }
        try {
            i1.cocinarYServirPrincipal(principal2);
        } catch (IngredienteNoDisponibleException e) {
            System.err.println("Intermedio 2 - Error: " + e);
        }


        try{
            e1.cocinarYServirEntrada(entrada1);
        } catch (TiempoInsuficienteException e) {
            System.err.println("Experto 1 - Error: " + e);
        }
        try{
            e1.cocinarYServirEntrada(entrada2);
        } catch (TiempoInsuficienteException e) {
            System.err.println("Experto 2 - Error: " + e);
        }
        try{
            e1.cocinarYServirPrincipal(principal1);
        } catch (TiempoInsuficienteException e) {
            System.err.println("Experto 3 - Error: " + e);
        }
        try{
            e1.cocinarYServirPrincipal(principal2);
        } catch (TiempoInsuficienteException e) {
            System.err.println("Experto 4 - Error: " + e);
        }
    }
}
