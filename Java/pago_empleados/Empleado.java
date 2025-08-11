package pago_empleados;

import java.util.HashMap;
import java.util.Map;

public class Empleado {
    private Tipo tipo;
    private HashMap<Proyecto, Integer> proyectos;
    private int sueldos;

    public void RegistrarSueldos(){
        sueldos = 0;
        for (Integer comision: proyectos.values()){
            sueldos += comision;
        }
    }

    public int CantProyectos(){
        return proyectos.size();
    }

    public int comisionPorProyecto(Proyecto p) {
        return this.proyectos.get(p);
    }

    public void sueldo_discriminado(){
        for (Map.Entry<Proyecto, Integer> p : proyectos.entrySet()){
            System.out.println("Nombre del proyecto: " + p.getKey().getNombre_proyecto());
            System.out.println("Ganancia total: " + p.getKey().getPlata());
            System.out.println("Comision: " + p.getValue());
        }
    }
}
