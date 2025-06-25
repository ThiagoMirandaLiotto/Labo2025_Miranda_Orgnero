package sistema_mascotas;
import java.util.ArrayList;


public class SistemaMascotas {
    private ArrayList<Mascota> mascotas = new ArrayList<>();

    private Mascota buscarMascota(String nombre) {
        for (Mascota m : mascotas) {
            if (m.getNombre().equals(nombre)) {
                return m;
            }
        }
        return null;
    }

    public void altaMascota(Mascota m) {
        if (buscarMascota(m.getNombre()) == null) {
            mascotas.add(m);
        } else {
            System.out.println("Ya existe una mascota con ese nombre.");
        }
    }

    public void eliminarMascota(String nombre) {
        Mascota m = buscarMascota(nombre);
        if (m != null) {
            mascotas.remove(m);
        } else {
            System.out.println("Mascota no encontrada.");
        }
    }

    public void modificarDuenio(String nombre, String nuevoDuenio) {
        Mascota m = buscarMascota(nombre);
        if (m != null) {
            m.setDuenio(nuevoDuenio);
        } else {
            System.out.println("Mascota no encontrada.");
        }
    }

    public void alimentar(String nombre) {
        Mascota m = buscarMascota(nombre);

    }

    public void saludar(String nombreMascota, String usuario) {
        for (Mascota m : mascotas){
            if (usuario.equals(m.getDuenio())){
                System.out.println(m.saludar());
            }

        }
    }

    public void mostrarTodas() {

    }
}

