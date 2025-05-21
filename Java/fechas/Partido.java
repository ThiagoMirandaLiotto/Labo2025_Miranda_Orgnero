package fechas;

import java.util.Date;

public class Partido {
    private Fecha dia;
    private String turno; //Mañana, tarde, noche
    private String equipoLocal;
    private String equipoVisitante;

    public Partido(Fecha dia, String turno, String equipoLocal, String equipoVisitante){
        this.dia = dia;
        this.turno = turno;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }



    public Fecha getDia() {return dia;}
    public String getTurno() {return turno;}
    public String getEquipoLocal() {return equipoLocal;}
    public String getEquipoVisitante() {return equipoVisitante;}

    public void setDia(Fecha dia) {this.dia = dia;}
    public void setTurno(String turno) {this.turno = turno;}
    public void setEquipoLocal(String equipoLocal) {this.equipoLocal = equipoLocal;}
    public void setEquipoVisitante(String equipoVisitante) {this.equipoVisitante = equipoVisitante;}

    void mostrarPartido(){
        System.out.println(dia + " (" + turno + "): " + equipoLocal + " vs " + equipoVisitante);
    }
}
