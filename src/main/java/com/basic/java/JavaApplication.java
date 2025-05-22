package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Redondea "num" al entero más próximo y devuélvelo
        // Tu código:
        System.out.println("""
                \nExample 016
                x = |x|""");
        System.out.println("Ingrese x");
        double x016 = scanner.nextDouble();
        System.out.println("Respuesta = " + Math.round(x016));


    }
}
