package objetos;

import personas.Persona;

import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion> canciones = new ArrayList<Cancion>();


    int numeroCanciones(){
        return this.canciones.size();
    }

    void verCancion(int posicion){
        if(posicion < numeroCanciones() && posicion > 0){
            System.out.println(this.canciones.get(posicion).getTitulo());
        }else{
            System.out.println("No existe esa cancion");
        }
    }

    void grabaCancion(int posicion, Cancion nuevaCancion){
        if(posicion < numeroCanciones() && posicion > 0){
            this.canciones.remove(posicion);
            this.canciones.add(posicion, nuevaCancion);
        }else{
            System.out.println("No existe esa cancion");
        }
    }

    void agregaCancion(Cancion nuevaCancion){
        this.canciones.add(nuevaCancion);
    }

    void elimina(int posicion){
        this.canciones.remove(posicion);
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public CD(){
        this.canciones = new ArrayList<Cancion>();
    }
    public CD(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }



    //MAIN
    public static void main(String[] args) {
        ArrayList<Cancion> canciones = new ArrayList<Cancion>();
        canciones.add(new Cancion("cancion1", new Persona()));
        canciones.add(new Cancion("cancion2", new Persona()));
        canciones.add(new Cancion("cancion3", new Persona()));
        canciones.add(new Cancion("cancion4", new Persona()));
        canciones.add(new Cancion("cancion5", new Persona()));
        canciones.add(new Cancion("cancion6", new Persona()));
        canciones.add(new Cancion("cancion7", new Persona()));
        canciones.add(new Cancion("cancion8", new Persona()));
        CD cd = new CD(canciones);

        System.out.println("El cd tiene " + cd.numeroCanciones() + " canciones");

        System.out.println("Cancion en la posicion 5:");
        cd.verCancion(5);

        cd.grabaCancion(5, new Cancion("CANCION", new Persona()));
        System.out.println("Nueva cancion en la posicion 5:");
        cd.verCancion(5);

        System.out.println("Nueva cancion agregada al final:");
        cd.agregaCancion(new Cancion("A", new Persona()));
        cd.verCancion(8);

        System.out.println("Cancion despues de borrar la cancion 5:");
        cd.elimina(5);
        cd.verCancion(5);
    }
}
