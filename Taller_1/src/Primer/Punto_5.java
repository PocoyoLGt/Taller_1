package Primer;

import java.util.Scanner;

public class Punto_5 {
    private String Nombre_mascota;
    private String Tipo_mascota;
    private int Edad;

    private String Nombre_dueño;
    private Scanner input;

    public Punto_5(){

    }

    public void Punto_5(){
        this.input = new Scanner(System.in);
        this.solicitar_nombre_mascota();
        this.Nombre_mascota = this.capturarDatoString();
        this.solicitar_edad();
        this.Edad = this.capturarDatoInt();
        this.solicitar_tipo_mascota();
        this.Tipo_mascota = this.capturarDatoString();

        this.solicitar_nombre_dueño();
        this.Nombre_dueño = this.capturarDatoString();
        this.imprimir_mensaje();




    }


    private void solicitar_nombre_mascota() {
        System.out.println("¿Cual es el nombre de tu mascota?");
    }
    private void solicitar_edad() {
        System.out.println("¿Cual es la edad de tu mascota?");
    }
    private void solicitar_tipo_mascota() {
        System.out.println("¿Que especie de animal es tu mascota?");
    }
    private void solicitar_nombre_dueño() {
        System.out.println("¿Como te llamas?");
    }

    private String capturarDatoString() {
        return this.input.nextLine();
    }

    private int capturarDatoInt() {
        return this.input.nextInt();
    }


    private void imprimir_mensaje(){

        System.out.println(Nombre_mascota+ " es un o una "+ Tipo_mascota+", el cual, tiene "+Edad+" años de edad y "+ Nombre_dueño + " es actualmente su dueña o dueño ");
     return;
    }



}
