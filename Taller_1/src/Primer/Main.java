package Primer;

import java.io.IOException;
import java.util.Scanner;

public class Main {
   private static boolean bandera = true;
   private static int opcion;




    public static void main(String[] args) throws IOException {

        do {
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while(bandera);

    }
    private static void menu() {
        System.out.println("Escoja un punto del taller");
        System.out.println("1. Punto #1");
        System.out.println("2. Punto #2");
        System.out.println("3. Punto #3");
        System.out.println("4. Punto #4");
        System.out.println("5. Punto #5");
        System.out.println("0. Salir del taller");
    }
    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion){
            case 0:
                return false;

            case 1:
                Punto1 p1 = new Punto1();
                p1.Punto1();
                return true;
            case 2:
                Punto_2 p2 = new Punto_2();
                p2.Punto2();
                return true;
            case 3:
                Punto_3 p3 = new Punto_3();
                p3.Punto_3();
                return true;
            case 4:
                Punto_4 p4 = new Punto_4();
                p4.Punto_4();
                return true;
            case 5:
                Punto_5 p5 = new Punto_5();
                p5.Punto_5();
                return true;

            default:
                System.out.println("Opción incorrecta");
                System.in.read();
                return true;





        }





    }

    private static void limpiarPantalla() {
        System.out.print("\u001b[H\u001b[2J");
        System.out.flush();
    }
}
