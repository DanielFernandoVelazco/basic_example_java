package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Devuelve "nombre" y "apellido" combinados en una string y separados por un espacio.
        // Ejemplo: "Soy", "Henry" -> "Soy Henry"
        // Tu código:
        System.out.println("""
                \nExample 021
                Unir Nombre Apellido""");
        System.out.println("Inserte Nombre");
        String x021 = scanner.nextLine();
        System.out.println("Inserte Apellido");
        String y021 = scanner.nextLine();
        System.out.println("Respuesta = " + x021 + " " + y021);


    }
}
