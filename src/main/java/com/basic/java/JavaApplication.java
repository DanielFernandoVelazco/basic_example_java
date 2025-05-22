package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                \nExample 019
                x > 0 => es positivo
                x < 0 => es negativo
                x = 0 => es falso""");
        System.out.println("x = ");
        double x019 = scanner.nextDouble();
        if (x019 > 0) System.out.println("Es Positivo");
        if (x019 < 0) System.out.println("Es Negativo");
        if (x019 == 0) System.out.println(false);


    }
}
