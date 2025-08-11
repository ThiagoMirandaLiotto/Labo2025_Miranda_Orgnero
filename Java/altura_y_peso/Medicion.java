package altura_y_peso;

import java.time.LocalDate;

public class Medicion {
    private int altura;
    private int peso;

    public Medicion(int altura, int peso) {
        this.altura = altura;
        this.peso = peso;
    }
    public int getAltura() {return altura;}
    public void setAltura(int altura) {this.altura = altura;}
    public int getPeso() {return peso;}
    public void setPeso(int peso) {this.peso = peso;}


}
