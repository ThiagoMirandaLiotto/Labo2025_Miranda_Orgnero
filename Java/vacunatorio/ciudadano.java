package vacunatorio;

import java.util.HashMap;
import java.util.HashSet;

public class ciudadano {
    private String nombre;
    private String apellido;
    private String residencia;
    private String domicilio;
    private String mail;
    private HashSet<vacuna> vacunas = new HashSet<>();


    public void agregarVacuna(vacuna v) {
        vacunas.add(v);
    }

    public HashSet<vacuna> getVacunasAplicadas() {
        return vacunas;
    }
    //GETTERS Y SETTERS
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public String getResidencia() {return residencia;}
    public void setResidencia(String residencia) {this.residencia = residencia;}
    public String getDomicilio() {return domicilio;}
    public void setDomicilio(String domicilio) {this.domicilio = domicilio;}
    public String getMail() {return mail;}
    public void setMail(String mail) {this.mail = mail;}
}
