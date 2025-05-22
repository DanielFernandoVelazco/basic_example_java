package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Devuelve "true" si "num" es impar
        // De lo contrario, devuelve "false"
        // Tu código:
        System.out.println("""
                \nExample 012
                x == impar => true
                x == par   => impar""");
        System.out.println("Ingrese x");
        double x012 = scanner.nextDouble();
        boolean respuesta = (x012 % 2 == 0) ? false : true;
        System.out.println(respuesta);


    }
}
