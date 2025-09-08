package eleccionesOctubre;

public class TelefonoMovil extends Dispositivo implements Mensajero {
    private String compania; // Claro, Movistar, etc.
    private String numeroCelular;
    private boolean prendido;
    private double credito;

    public TelefonoMovil(String numeroSerie, String fabricante, String modelo,
                         String compania, String numeroCelular,
                         boolean prendido, double credito) {
        super(numeroSerie, fabricante, modelo);
        this.compania = compania;
        this.numeroCelular = numeroCelular;
        this.prendido = prendido;
        this.credito = credito;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        if (prendido && credito > 0) {
            System.out.println("Conectando con la antena más cercana... " + mensaje);
            credito -= 1; // consume crédito por mensaje
        } else {
            System.out.println("El teléfono " + numeroCelular + " no puede enviar mensaje (apagado o sin crédito).");
        }
    }
}
