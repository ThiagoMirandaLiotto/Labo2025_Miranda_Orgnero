package altura_y_peso;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private HashMap<LocalDate, Medicion> registros;

    public Persona(String nombre, String apellido, LocalDate nacimiento, HashMap<LocalDate, Medicion> registros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.registros = registros;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public LocalDate getNacimiento() {return nacimiento;}
    public void setNacimiento(LocalDate nacimiento) {this.nacimiento = nacimiento;}
    public HashMap<LocalDate, Medicion> getRegistros() {return registros;}
    public void setRegistros(HashMap<LocalDate, Medicion> registros) {this.registros = registros;}

    private void HacerMedicion(int altura, int peso){
        Medicion algo = new Medicion(altura, peso);
        registros.put(LocalDate.now(), algo);
    }
    private Medicion promedioPorAnio(int anio){
        int suma_peso = 0;
        int suma_altura = 0;
        int promedio_altura = 0;
        int promedio_peso = 0;

        for (Map.Entry<LocalDate, Medicion> m: registros.entrySet()){
            if (m.getKey().getYear() == anio){
                suma_peso += m.getValue().getPeso();
                suma_altura += m.getValue().getAltura();

            }
        }
        promedio_altura = suma_altura/registros.size();
        promedio_peso = suma_peso/registros.size();
        return new Medicion(promedio_altura, promedio_peso);
    }

    private int porcentajeCrecimiento(LocalDate fecha1, LocalDate fecha2){
        int h1 = registros.get(fecha1).getAltura();
        int h2 = registros.get(fecha2).getAltura();
        return (h1+h2)/100;
    }

    public String obtenerMedicionEnFecha(LocalDate fecha) {
        Medicion medicion = registros.get(fecha);
        if (medicion != null) {
            return "Altura: " + medicion.getAltura() + " cm, Peso: " + medicion.getPeso() + " kg";
        } else {
            return "No hay registro para la fecha: " + fecha;
        }
    }
}
