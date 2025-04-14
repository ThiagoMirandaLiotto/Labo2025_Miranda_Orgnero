package figuras_geometricas;

public class Rectangulo {
    private float base;
    private float altura;

    public float calcularArea(){
        float area = base * altura;
        return area;
    }
    public float calcularPerimetro(){
        float perimetro = base*2 + altura*2;
        return perimetro;
    }

    public Rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    public float getBase(){
        return base;
    }
    public float getAltura(){
        return altura;
    }
    public void setBase(float base){
        this.base = base;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
}
