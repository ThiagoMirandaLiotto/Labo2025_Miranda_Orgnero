public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public void valida(){

        if(mes > 12){
            System.out.println("El mes es muy alto");
            mes = 12;
        }else if (mes < 1){
            System.out.println("El mes es muy bajo");
            mes = 1;
        }

        if(dia > meses[mes-1]){
            System.out.println("El dia es muy alto");
            dia = meses[mes-1];
        }else if (dia < 1){
            System.out.println("El dia es muy bajo");
            dia = 1;
        }
    }
    public void diasMes(){
        valida();

        System.out.println("El mes N°" + mes + " tiene: " + meses[mes] + " dias.");
    }
    public void corta(){
        System.out.println("Es el dia: " + dia + "-" + mes + "-" + anio);
    }
    public void larga(){
        System.out.println("Es el dia " + dia + " del mes " + mes + " del año " + anio);
    }
    public void siguiente(){
        dia++;

        if(dia > meses[mes-1]){
            dia = 1;
            mes++;
        }

        if(mes > 12){
            mes = 1;
            anio++;
        }
    }
    public void anterior(){
        dia--;

        if(dia < 1){
            mes--;
            if(mes < 1){
                mes = 12;
                anio--;
            }

            dia = meses[mes-1];
        }
    }
    public void igualQue(Fecha fecha){
        if(dia==fecha.getDia() && mes==fecha.getMes() && anio==fecha.getAnio()){
            System.out.println("Las dos fechas son iguales");
        }else{
            System.out.println("Las fechas son distintas");
        }
    }
    public void menorQue(Fecha fecha){
        boolean menor = false;

        if(anio < fecha.getAnio()){
            menor = true;
        }else if(mes < fecha.getMes()){
            menor = true;
        }else if(dia < fecha.getDia()){
            menor = true;
        }

        if(menor){
            System.out.println("La fecha es menor a esta");
        }else{
            System.out.println("La fecha no es menor a esta");
        }
    }
    public void mayorQue(Fecha fecha){
        boolean menor = false;

        if(anio < fecha.getAnio()){
            menor = true;
        }else if(mes < fecha.getMes()){
            menor = true;
        }else if(dia < fecha.getDia()){
            menor = true;
        }

        if(!menor){
            System.out.println("La fecha es mayor a esta");
        }else{
            System.out.println("La fecha no es mayor a esta");
        }
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
}
