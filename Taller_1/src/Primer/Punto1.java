package Primer;

import java.util.Scanner;

public class Punto1 {
    private String nombre;
    private String apellidos;

    public Punto1() {
    }

    public Punto1(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public void Punto1() {
        this.solicitarNombre();
        this.nombre = this.capturarDato();
        this.solicitarApellido();
        this.apellidos = this.capturarDato();
    }
    private void solicitarNombre() {
        System.out.println("Por favor digite su nombre");
    }

    private void solicitarApellido() {
        System.out.println("Por favor digite su apellido");
    }
    private String capturarDato() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public String getApellidos() {
        return apellidos;
    }
}
