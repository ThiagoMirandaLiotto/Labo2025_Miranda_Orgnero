package sistema_bebidas;

public class BebidaNoDisponibleException extends RuntimeException {
    public BebidaNoDisponibleException(String message) {
        super(message);
    }
}
