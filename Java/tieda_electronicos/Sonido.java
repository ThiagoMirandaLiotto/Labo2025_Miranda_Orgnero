package tieda_electronicos;

public class Sonido extends Producto{
    private boolean BluetoothIntegrado;

    public Sonido(String nombre, double precio, int stock, boolean BluetoothIntegrado) {
        super(nombre, precio, stock, Seccion.MULTIMEDIA);
        this.BluetoothIntegrado = BluetoothIntegrado;
    }

    public boolean isBluetoothIntegrado() {
        return BluetoothIntegrado;
    }
    public void setBluetoothIntegrado(boolean bluetoothIntegrado) {
        BluetoothIntegrado = bluetoothIntegrado;
    }
}
