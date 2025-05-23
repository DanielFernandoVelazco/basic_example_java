package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Desarrolle una función que calcule el área de un triángulo.
        //Escribe tu código aquí
        System.out.println("""
                \nExample 025
                Area Triagulo = (b*h)/2""");
        System.out.println("Ingrese b");
        double x025 = scanner.nextDouble();
        System.out.println("Ingrese h");
        double y025 = scanner.nextDouble();
        System.out.println("Area = " + (x025 * y025) / 2);

    }
}
