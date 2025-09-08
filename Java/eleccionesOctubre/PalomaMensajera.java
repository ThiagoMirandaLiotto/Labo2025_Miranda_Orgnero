package eleccionesOctubre;

public class PalomaMensajera extends Ave implements Mensajero {
    private boolean aprendioMapa;

    public PalomaMensajera(String nombre, String color, String especie, boolean aprendioMapa) {
        super(nombre, color, especie);
        this.aprendioMapa = aprendioMapa;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        if (aprendioMapa) {
            System.out.println("Lanzando un papelito que dice: " + mensaje);
        } else {
            System.out.println(nombre + " aún no aprendió el mapa, no puede enviar el mensaje.");
        }
    }
}
