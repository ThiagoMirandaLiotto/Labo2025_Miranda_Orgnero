package vehiculos;

import objetos.Color;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Color color;
    private int ruedas;
    private int anio;

    public Vehiculo(String marca, String modelo, Color color, int ruedas, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ruedas = ruedas;
        this.anio = anio;
    }
    public Vehiculo(){
        this.marca = "sin marca";
        this.modelo = "no modelo";
        this.color = Color.NEGRO;
        this.ruedas = 0;
        this.anio = 0000;
    }

    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public Color getColor() {return color;}
    public int getRuedas() {return ruedas;}
    public int getAnio() {return anio;}

    public void setMarca(String marca) {this.marca = marca;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setColor(Color color) {this.color = color;}
    public void setRuedas(int ruedas) {this.ruedas = ruedas;}
    public void setAnio(int anio) {this.anio = anio;}
}


