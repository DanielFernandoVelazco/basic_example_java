package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Escribe una función que reciba una letra y, si es una vocal, muestre el mensaje “Es vocal”.
        //Verificar si el usuario ingresó un string de más de un carácter, en ese caso, informarle
        //que no se puede procesar el dato mediante el mensaje "Dato incorrecto".
        // Si no es vocal, tambien debe devolver "Dato incorrecto".
        //Escribe tu código aquí
        System.out.println("""
                \nExample 027
                Validacion Vocales""");
        System.out.println("Ingrese un string");
        String x027 = scanner.nextLine();
        if (x027.length() != 1) System.out.println("Dato Incorrecto");
        x027 = x027.toLowerCase();
        if (x027.equals("a") || x027.equals("e") || x027.equals("i")
                || x027.equals("o") || x027.equals("u")) {
            System.out.println("Es vocal");
        } else {
            System.out.println("Dato Incorrecto");
        }

    }
}
