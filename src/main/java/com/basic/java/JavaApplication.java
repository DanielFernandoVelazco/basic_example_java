package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Devuelve el valor de "num" elevado al exponente dado en "exponent"
        // Tu código:
        System.out.println("""
                \nExample 015
                res = x ^ y""");
        System.out.println("Ingrese x");
        double x015 = scanner.nextDouble();
        System.out.println("Ingrese y");
        double y015 = scanner.nextDouble();
        System.out.println("Respuesta = " + Math.pow(x015, y015));


    }
}
