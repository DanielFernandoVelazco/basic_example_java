package com.basic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Devuelve "true" si "num" es par
		// De lo contrario, devuelve "false"
		// Tu código:
		System.out.println("""
                \nExample 011
                x == par   => true
                x == impar => impar""");
		System.out.println("Ingrese x");
		double x011 = scanner.nextDouble();
		if (x011 % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
