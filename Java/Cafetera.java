public class Cafetera {
    int cantidadMaxima;
    int cantidadActual;


    public void llenarCafetera(){
        this.cantidadActual = this.cantidadMaxima;
    }

    public void servirTaza(int capacidad){
        this.cantidadActual -= capacidad;

        if(this.cantidadActual < 0){
            this.cantidadActual = 0;
        }
    }

    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }

    public void agregarCafe(int cantidad){
        this.cantidadActual += cantidad;

        if(this.cantidadActual > this.cantidadMaxima){
            this.cantidadActual = cantidadMaxima;
        }
    }


    public int getCantidadMaxima() {
        return cantidadMaxima;
    }
    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }
    public int getCantidadActual() {
        return cantidadActual;
    }
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public Cafetera(int cantidadMaxima){
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadMaxima;
    }
    public Cafetera(){
        this.cantidadMaxima = 1000;
        this.cantidadActual = 0;
    }
    public Cafetera(int cantidadMaxima, int cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;

        if(cantidadActual > cantidadMaxima){
            this.cantidadActual = cantidadMaxima;
        }else{
            this.cantidadActual = cantidadActual;
        }

    }
}
