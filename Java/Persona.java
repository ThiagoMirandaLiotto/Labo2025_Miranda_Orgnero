public class Persona {
    private String nombre;
    private int edad;
    private String direccion;


    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Direccion: " + direccion);
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getNombre() {
        return nombre;
    }

    public Persona(String nombre, int edad, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
}
