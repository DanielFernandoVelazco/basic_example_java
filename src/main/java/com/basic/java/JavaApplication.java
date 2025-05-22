package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Devuelve el valor de "num" elevado al cuadrado
        // ojo: No es raiz cuadrada!
        // Tu código:
        System.out.println("""
                \nExample 013
                x = x * x""");
        System.out.println("Ingrese x");
        double x013 = scanner.nextDouble();
        System.out.println("respuesta = " + Math.pow(x013, 2));


    }
}
