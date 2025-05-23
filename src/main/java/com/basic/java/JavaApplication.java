package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Supongamos que 1 euro equivale a 1.20 dólares. Escribe un programa que reciba
        //como parámetro un número de euros y calcule el cambio en dólares.
        //Escribe tu código aquí
        System.out.println("""
                \nExample 026
                Euros = 1.20 * Dolares""");
        System.out.println("Ingrese Cantidad Dolares");
        double x026 = scanner.nextDouble();
        System.out.println("Respuesta Euros = " + 1.20 * x026);

    }
}
