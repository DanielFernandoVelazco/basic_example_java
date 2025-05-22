package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Redondea "num" hacia arriba (al próximo entero) y devuélvelo
        // Tu código:
        System.out.println("""
                \nExample 017
                x = |x| => x""");
        System.out.println("Ingrese x ");
        double x017 = scanner.nextDouble();
        System.out.println("Respuesta = " + Math.ceil(x017));



    }
}
