package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Devuelve el valor de "num" elevado al cubo
        // Tu código:
        System.out.println("""
                \nExample 014
                x = x ^ 3""");
        System.out.println("Ingrese x");
        double x014 = scanner.nextDouble();
        System.out.println("Respuesta = " + Math.pow(x014, 3));


    }
}
