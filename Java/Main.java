import fechas.Fecha;
import personas.Persona;

public class Main {
    public static void main(String[] args) {
        //Main figuras_geometricas.Circulo:
        /*figuras_geometricas.Circulo c1 = new figuras_geometricas.Circulo(4);
        System.out.println("Radio: " + c1.getRadio());
        System.out.println("Area: " + c1.calcularArea());
        System.out.println("Perimetro: " + c1.calcularPerimetro());


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio para el segundo círculo: ");
        float radioUsuario = scanner.nextFloat();

        figuras_geometricas.Circulo c2 = new figuras_geometricas.Circulo(radioUsuario);
        System.out.println("Radio: " + c2.getRadio());
        System.out.println("Area: " + c2.calcularArea());
        System.out.println("Perimetro: " + c2.calcularPerimetro());*/


        //Main figuras_geometricas.Rectangulo
        /*Scanner scanner1 = new Scanner(System.in);
        float base = scanner1.nextFloat();
        Scanner scanner2 = new Scanner(System.in);
        float altura = scanner2.nextFloat();

        figuras_geometricas.Rectangulo r1 = new figuras_geometricas.Rectangulo(base, altura);

        System.out.println(r1.getBase());
        System.out.println(r1.getAltura());

        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());*/


        //Main objetos.Coche
        /*objetos.Coche coche = new objetos.Coche("marca", "modelo", "rojo");

        coche.mostrarVelocidadActual();
        coche.acelerar();
        coche.mostrarVelocidadActual();
        coche.frenar();
        coche.mostrarVelocidadActual();*/



        //Main personas.Persona
        Persona persona = new Persona("pepe", 206, "Avenida 1");

        //persona.mostrarDatos();


        //Main fecha
        Fecha fecha = new Fecha(20, 10 ,2010);
        /*
        fecha.valida();
        fecha.diasMes();
        fecha.corta();
        fecha.larga();
        System.out.println(" ");

        fecha.siguiente();
        fecha.corta();
        fecha.anterior();
        fecha.corta();
        System.out.println(" ");

        fecha.igualQue(new fechas.Fecha(20, 10, 2010));
        fecha.igualQue(new fechas.Fecha(21, 10, 2010));
        System.out.println(" ");

        fecha.menorQue(new fechas.Fecha(20, 10, 2010));
        fecha.menorQue(new fechas.Fecha(30, 10, 2010));
        System.out.println(" ");

        fecha.mayorQue(new fechas.Fecha(20, 10, 2010));
        fecha.mayorQue(new fechas.Fecha(30, 10, 2010));*/


        //Main libro
        /*objetos.Libro libro = new objetos.Libro("las aventuras de buhler", persona, 22, 200, "Santillana", fecha);
        libro.mostrarInformacion();

        objetos.Libro libro2 = new objetos.Libro(1);

        libro.fechaEsAnterior(libro2);*/

        //Main cafetera
        /*objetos.Cafetera cafetera = new objetos.Cafetera(1000, 10);

        System.out.println(cafetera.cantidadActual);
        cafetera.servirTaza(100);
        System.out.println(cafetera.cantidadActual);
        cafetera.vaciarCafetera();
        System.out.println(cafetera.cantidadActual);
        cafetera.llenarCafetera();
        System.out.println(cafetera.cantidadActual);
        cafetera.vaciarCafetera();
        System.out.println(cafetera.cantidadActual);
        cafetera.agregarCafe(500);
        System.out.println(cafetera.cantidadActual);*/




    }
}
