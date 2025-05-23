package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Toma la string "nombre" y concatena otras string en la cadena para que tome la siguiente forma:
        // "Martin" -> "Hola Martin!"
        // Tu código:
        System.out.println("""
                \nExample 022
                Unir Hola con nombre""");
        System.out.println("Ingrese el nombre");
        String x022 = scanner.nextLine();
        System.out.println("Hola " + x022 + "!");


    }
}
