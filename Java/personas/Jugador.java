package personas;

import java.util.Date;

public class Jugador {
   private String nombre;
   private Date fechaNacimiento;
   private Integer numero;

   public Jugador(String nombre, Date fechaNacimiento, Integer numero){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numero = numero;
   }


    public String getNombre() {return nombre;}
    public Date getFechaNacimiento() {return fechaNacimiento;}
    public Integer getNumero() {return numero;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setFechaNacimiento(Date fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
    public void setNumero(Integer numero) {this.numero = numero;}
}
