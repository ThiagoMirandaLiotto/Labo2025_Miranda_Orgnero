import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        //Main Circulo:
        /*Circulo c1 = new Circulo(4);
        System.out.println("Radio: " + c1.getRadio());
        System.out.println("Area: " + c1.calcularArea());
        System.out.println("Perimetro: " + c1.calcularPerimetro());


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio para el segundo círculo: ");
        float radioUsuario = scanner.nextFloat();

        Circulo c2 = new Circulo(radioUsuario);
        System.out.println("Radio: " + c2.getRadio());
        System.out.println("Area: " + c2.calcularArea());
        System.out.println("Perimetro: " + c2.calcularPerimetro());*/


        //Main Rectangulo
        /*Scanner scanner1 = new Scanner(System.in);
        float base = scanner1.nextFloat();
        Scanner scanner2 = new Scanner(System.in);
        float altura = scanner2.nextFloat();

        Rectangulo r1 = new Rectangulo(base, altura);

        System.out.println(r1.getBase());
        System.out.println(r1.getAltura());

        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());*/


        //Main Coche
        /*Coche coche = new Coche("marca", "modelo", "rojo");

        coche.mostrarVelocidadActual();
        coche.acelerar();
        coche.mostrarVelocidadActual();
        coche.frenar();
        coche.mostrarVelocidadActual();*/



        //Main Persona
        /*Persona persona = new Persona("pepe", 206, "Avenida 1");

        persona.mostrarDatos();*/


        //Main fecha
        Fecha fecha = new Fecha(20, 10 ,2010);
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

        fecha.igualQue(new Fecha(20, 10, 2010));
        fecha.igualQue(new Fecha(21, 10, 2010));
        System.out.println(" ");

        fecha.menorQue(new Fecha(20, 10, 2010));
        fecha.menorQue(new Fecha(30, 10, 2010));
        System.out.println(" ");

        fecha.mayorQue(new Fecha(20, 10, 2010));
        fecha.mayorQue(new Fecha(30, 10, 2010));

    }
}
