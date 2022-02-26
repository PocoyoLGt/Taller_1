package Primer;

import java.util.Scanner;

public class Punto_3 {

    private String Nombre_Completo;
    private String Nombre_Madre;
    private String Nombre_Padre;
    private Scanner input;

    public Punto_3(){
    }

    public  void Punto_3(){
        this.input = new Scanner(System.in);
        this.solicitarNombre_Completo();
        this.Nombre_Completo = this.capturarDatoString();
        this.solicitarNombre_Madre();
        this.Nombre_Madre = this.capturarDatoString();
        this.solicitarNombre_Padre();
        this.Nombre_Padre = this.capturarDatoString();
        this.imprimir_mensaje();

    }

    private void solicitarNombre_Completo() {
        System.out.println("Por favor digite su nombre y apellido");
    }

    private void solicitarNombre_Madre() {
        System.out.println("Por favor digite el nombre y apellido de su madre");
    }
    private void solicitarNombre_Padre() {
        System.out.println("Por favor digite el nombre y apellido de su padre");
    }

    private String capturarDatoString() {
        return this.input.nextLine();
    }
    private void imprimir_mensaje(){

      System.out.println("Yo "+Nombre_Completo+", Soy hijo de "+ Nombre_Madre+ " y "+Nombre_Padre);
    }
}
