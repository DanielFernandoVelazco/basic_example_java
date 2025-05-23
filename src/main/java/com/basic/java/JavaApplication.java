package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Escibe una función a la cual reciba el valor del lado de un cuadrado y retorne su perímetro.
        //Escribe tu código aquí
        System.out.println("""
                \nExample 024
                Perimetro = l + l + l + l""");
        System.out.println("Ingrese el lado (l)");
        double x024 = scanner.nextDouble();
        System.out.println("Perimetro = " + 4 * x024);

    }
}
