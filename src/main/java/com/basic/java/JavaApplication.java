package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Generar un número al azar entre 0 y 1 y devolverlo
        //Pista: investigá qué hace el método Math.random()
        System.out.println("""
                \nExample 017
                x = random()""");
        System.out.println("Respuesta = " + Math.random());


    }
}
