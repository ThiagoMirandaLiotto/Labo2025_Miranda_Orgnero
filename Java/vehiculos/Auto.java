package vehiculos;

public class Auto extends Vehiculo {
    private String patente;
    private boolean descapotable;


    public Auto(String patente, boolean descapotable){
        this.patente = patente;
        this.descapotable = descapotable;
    }
    public Auto(){
        this.patente = "S1N P$T3NT3";
        this.descapotable = false;
    }


    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setDescpotable(boolean descpotable) {
        this.descapotable = descpotable;
    }

    public String getPatente() {
        return patente;
    }

    public boolean isDescpotable() {
        return descapotable;
    }
}