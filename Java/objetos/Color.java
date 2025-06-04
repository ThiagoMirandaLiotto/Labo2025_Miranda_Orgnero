package objetos;

public enum Color {
    ROJO("FF0000"), AZUL("0000FF"), VERDE("00FF00"),
    AMARILLO("FFFF00"), BLANCO("FFFFFF"), NEGRO("000000");

    private String Hexa;

    private Color(String Hexa){
        this.Hexa = Hexa;
    }

    public String getHexa() {
        return Hexa;
    }
}
