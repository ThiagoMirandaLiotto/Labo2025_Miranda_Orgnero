package objetos;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
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


    public String getColor() {
        return color;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getVelocidad() {
        return velocidad;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Coche(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;
    }
}
