package sistemaVehiculos;

import vehiculos.Vehiculo;

public class Coche extends Vehiculo {
    private int velocidad;


    public void acelerar(){
        velocidad += 5;
    }
    public void frenar(){
        velocidad -= 5;
    }

    public void mostrarVelocidadActual(){
        System.out.println("Velocidad actual: " + velocidad);
    }




    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {this.velocidad = velocidad;}

    public Coche(String marca, String modelo, String color){
        super(marca, modelo, color, 4, 2025);
        this.velocidad = 0;
    }
}
