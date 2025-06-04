
package objetos;

import fechas.Fecha;
import personas.Persona;

public class Libro {
    String titulo;
    Persona autor;
    int ISBN;
    int paginas;
    Editorial editorial;
    Fecha fechaPublicacion;


    public void mostrarInformacion(){
        System.out.println("Nombre: " + this.titulo);
        System.out.println("Autor: ");
        this.autor.mostrarDatos();

        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Paginas: " + this.paginas);
        System.out.println("Editorial: " + this.editorial);
        System.out.println("fechas.Fecha de publicacion: ");
        this.fechaPublicacion.corta();
    }

    public void fechaEsAnterior(Libro libro){
        boolean nashe = false;
        if (this.fechaPublicacion.getAnio() < libro.getFechaPublicacion().getAnio()){
            if (this.fechaPublicacion.getMes() < libro.getFechaPublicacion().getMes()){
                if (this.fechaPublicacion.getDia() < libro.getFechaPublicacion().getDia()){
                    nashe = true;
                    System.out.println(nashe);
                }
            }
        }
        if (nashe = true){
            System.out.println("La fecha del libro " + this.getTitulo() + " es MENOR a la del " + libro.getTitulo());
        }
        if (nashe = false){
            System.out.println("La fecha del libro " + this.getTitulo() + " es MAYOR a la del " + libro.getTitulo());
        }
    }



    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Persona getAutor() {
        return autor;
    }
    public void setAutor(Persona autor) {
        this.autor = autor;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public Editorial getEditorial() {
        return editorial;
    }
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public Libro(){
        this.titulo = "sin titulo";
        this.autor = new Persona();
        this.ISBN = 0;
        this.paginas = 0;
        this.editorial = Editorial.INTERZONA;
        this.fechaPublicacion = new Fecha(16, 4, 2025);
    }
    public Libro(int ISBN){
        this.titulo = "Buhler's book";
        this.autor = new Persona("Santiago", "Buhler", 1921, new Fecha(10, 10, 2000), "Casa de buhler");
        this.ISBN = ISBN;
        this.paginas = 100;
        this.editorial = Editorial.EL_ATANEO;
        this.fechaPublicacion = new Fecha(16, 4, 2025);
    }
    public Libro(String titulo, Persona autor, int ISBN, int paginas, Editorial editorial, Fecha fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }


}

