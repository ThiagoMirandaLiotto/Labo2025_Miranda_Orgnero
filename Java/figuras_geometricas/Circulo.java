package figuras_geometricas;

public class Circulo {
    private float radio;

    public Circulo() {
        this.radio = 2;
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calcularArea() {
        float area = (float) ((radio * radio) * 3.14);
        return area;
    }

    public float calcularPerimetro() {
        float perimetro = (float) (2 * radio * 3.14);

        return perimetro;
    }
}

