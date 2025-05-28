package sistema_computadoras;

public class Tarjeta extends MetodoPago{
    private int numero;
    private String nombreTitular;

    public Tarjeta(String nombre, int numero, String nombreTitular) {
        super(nombre);
        this.numero = numero;
        this.nombreTitular = nombreTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
}
