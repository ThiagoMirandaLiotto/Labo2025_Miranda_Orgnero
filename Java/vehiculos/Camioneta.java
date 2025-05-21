package vehiculos;

public class Camioneta extends Vehiculo {
    private String patente;
    private int capCargaKG;


    public Camioneta(String patente, int capCargaKG){
        this.patente = patente;
        this.capCargaKG = capCargaKG;
    }
    public Camioneta(){
        this.patente = "S1N P$T3NT3";
        this.capCargaKG = 000;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapCargaKG() {
        return capCargaKG;
    }

    public void setCapCargaKG(int capCargaKG) {
        this.capCargaKG = capCargaKG;
    }
}