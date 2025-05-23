package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Retornar el area de un rectángulo teniendo su altura y ancho
        // Tu código:
        System.out.println("""
                \nExample 023
                Area = b * h""");
        System.out.println("Ingrese b");
        double x023 = scanner.nextDouble();
        System.out.println("Ingrese h");
        double y023 = scanner.nextDouble();
        System.out.println("Area = " + x023 * y023);


    }
}
