package Primer;

import java.util.Scanner;

public class Punto_2 {
    private String nombre;
    private String apellidos;
    private int edad;
    private double estatura;
    private Scanner input;

    public Punto_2() {
    }

    public void Punto2() {
        this.input = new Scanner(System.in);
        this.solicitarNombre();
        this.nombre = this.capturarDatoString();
        this.solicitarApellido();
        this.apellidos = this.capturarDatoString();
        this.solicitarEdad();
        this.edad = this.capturarDatoInt();
        this.solicitarAltura();
        this.estatura = this.capturarDatoDouble();
    }

    private void solicitarNombre() {
        System.out.println("Por favor digite su nombre");
    }

    private void solicitarApellido() {
        System.out.println("Por favor digite su apellido");
    }

    private void solicitarEdad() {
        System.out.println("Por favor digite su edad");
    }

    private void solicitarAltura() {
        System.out.println("Por favor digite su altura");
    }

    private String capturarDatoString() {
        return this.input.nextLine();
    }

    private int capturarDatoInt() {
        return this.input.nextInt();
    }

    private double capturarDatoDouble() {
        return this.input.nextDouble();
    }
}
