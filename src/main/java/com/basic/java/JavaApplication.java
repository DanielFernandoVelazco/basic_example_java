package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Agrega un símbolo de exclamación al final de la string "str" y devuelve una nueva string
        // Ejemplo: "hello world" pasaría a ser "hello world!"
        // Tu código:
        System.out.println("""
                \nExample 020
                x = agregar simbolo de exclamacion !""");
        System.out.println("Inserte la cadena de texto");
        String x020 = scanner.nextLine();
        System.out.println("Respuesta = " + x020 + "!");


    }
}
