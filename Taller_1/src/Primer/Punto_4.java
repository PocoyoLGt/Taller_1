package Primer;

import java.util.Scanner;

public class Punto_4 {

    private String ciudad;
    private String pais;
    private Scanner input;


    public Punto_4(){


    }

    public void Punto_4(){
        this.input = new Scanner(System.in);
        this.solicitar_ciudad();
        this.ciudad = this.capturarDatoString();
        this.solicitar_pais();
        this.pais = this.capturarDatoString();
        this.imprimir_mensaje();



    }


    private void solicitar_ciudad() {
        System.out.println("Por favor digite el nombre de una capital");
    }
    private void solicitar_pais() {
        System.out.println("Por favor digite el nombre del pais de esta ciudad");
    }
    private String capturarDatoString() {
        return this.input.nextLine();
    }
    private void imprimir_mensaje(){

        System.out.println("La ciudad "+ciudad+", es capital del pais "+pais);
    }

}
