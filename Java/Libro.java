public class Libro {
    String titulo;
    Persona autor;
    int ISBN;
    int paginas;
    String editorial;
    Fecha fechaPublicacion;


    public void mostrarInformacion(){
        System.out.println("Nombre: " + this.titulo);
        System.out.println("Autor: ");
        this.autor.mostrarDatos();

        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Paginas: " + this.paginas);
        System.out.println("Editorial: " + this.editorial);
        System.out.println("Fecha de publicacion: ");
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
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
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
        this.editorial = "sin editorial";
        this.fechaPublicacion = new Fecha(16, 4, 2025);
    }
    public Libro(int ISBN){
        this.titulo = "Buhler's book";
        this.autor = new Persona("Santiago Buhler", 16, "Bunker 1320");
        this.ISBN = ISBN;
        this.paginas = 100;
        this.editorial = "editorial bunker";
        this.fechaPublicacion = new Fecha(16, 4, 2025);
    }
    public Libro(String titulo, Persona autor, int ISBN, int paginas, String editorial, Fecha fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }


}
