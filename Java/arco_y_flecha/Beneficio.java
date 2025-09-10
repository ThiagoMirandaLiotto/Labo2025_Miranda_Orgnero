package arco_y_flecha;

public abstract class Beneficio {
    private int Nombre;
    private String Usuario;

    public Beneficio(int nombre, String usuario) {
        Nombre = nombre;
        Usuario = usuario;
    }

    public int getNombre() {
        return Nombre;
    }

    public void setNombre(int nombre) {
        Nombre = nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public abstract boolean esAcumulable();
}
