package campeonato;

import fechas.Fecha;

public class Jugador {
   private String nombre;
   private Fecha fechaNacimiento;
   private Integer numero;

   public Jugador(String nombre, Fecha fechaNacimiento, Integer numero){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numero = numero;
   }


    public String getNombre() {return nombre;}
    public Fecha getFechaNacimiento() {return fechaNacimiento;}
    public Integer getNumero() {return numero;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setFechaNacimiento(Fecha fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
    public void setNumero(Integer numero) {this.numero = numero;}



}
