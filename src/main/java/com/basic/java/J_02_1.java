package com.basic.java;

import java.util.Scanner;

public class J_02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Example 001");
        // "Return" la string provista: str
        // Tu código:
        System.out.println("str");

        // "x" e "y" son números
        // Suma "x" e "y" juntos y devuelve el valor
        // Tu código:
        System.out.println("""
                \nExample 002
                Res = Var_1 + Var_2""");
        System.out.println("Inside Var 1");
        double x002 = scanner.nextDouble();
        System.out.println("Inside var 2");
        double y002 = scanner.nextDouble();
        double res002 = x002 + y002;
        System.out.println("Res = " + res002);

        // Resta "y" de "x" y devuelve el valor
        // Tu código:
        System.out.println("""
                \nExample 003
                Res = Var_1 - Var_2""");
        System.out.println("Inside Var 1");
        double x003 = scanner.nextDouble();
        System.out.println("Inside var 2");
        double y003 = scanner.nextDouble();
        double res003 = x003 - y003;
        System.out.println("Res = " + res003);

        // Multiplica "x" por "y" y devuelve el valor
        // Tu código:
        System.out.println("""
                \nExample 004
                Res = Var_1 * Var_2""");
        System.out.println("Inside Var_1");
        double x004 = scanner.nextDouble();
        System.out.println("Inside var_2");
        double y004 = scanner.nextDouble();
        double res004 = x004 * y004;
        System.out.println("Res = " + res004);

        // Divide "x" entre "y" y devuelve el valor
        // Tu código:
        System.out.println("""
                \nExample 005
                Res = Var_1 / Var_2""");
        System.out.println("Inside Var_1");
        double x005 = scanner.nextDouble();
        System.out.println("Inside var_2");
        double y005 = scanner.nextDouble();
        double res005 = x005 / y005;
        System.out.println("Res = " + res005);

        // Devuelve "true" si "x" e "y" son iguales
        // De lo contrario, devuelve "false"
        // Tu código:
        System.out.println("""
                \nExample 006
                Var_1 == Var_2 => true
                Var_1 =! Var_2 => false""");
        System.out.println("Inside Var_1");
        double x006 = scanner.nextDouble();
        System.out.println("Inside var_2");
        double y006 = scanner.nextDouble();
        if (x006 == y006) {
            System.out.println("Res = " + true);
        } else {
            System.out.println("Res = " + false);
        }

        // Devuelve "true" si las dos strings tienen la misma longitud
        // De lo contrario, devuelve "false"
        // Tu código:
        System.out.println("""
                \nExample 007
                if long str Var_1 == Var_2 => true
                if long str Var_1 =! Var_2 => false""");
        System.out.println("Into var_1 (str)");
        String x007 = scanner.nextLine();
        System.out.println("Into var_2 (str)");
        String y007 = scanner.nextLine();
        if (x007.length() == y007.length()) {
            System.out.println("Res = " + true);
        } else {
            System.out.println("Res = " + false);
        }

        // Devuelve "true" si el argumento de la función "num" es menor que noventa
        // De lo contrario, devuelve "false"
        // Tu código:


        // Devuelve "true" si el argumento de la función "num" es mayor que cincuenta
        // De lo contrario, devuelve "false"
        // Tu código:


        // Obten el resto de la división de "x" entre "y"
        // Tu código:


        // Devuelve "true" si "num" es par
        // De lo contrario, devuelve "false"
        // Tu código:


        // Devuelve "true" si "num" es impar
        // De lo contrario, devuelve "false"
        // Tu código:


        // Devuelve el valor de "num" elevado al cuadrado
        // ojo: No es raiz cuadrada!
        // Tu código:


        // Devuelve el valor de "num" elevado al cubo
        // Tu código:


        // Devuelve el valor de "num" elevado al exponente dado en "exponent"
        // Tu código:


        // Redondea "num" al entero más próximo y devuélvelo
        // Tu código:


        // Redondea "num" hacia arriba (al próximo entero) y devuélvelo
        // Tu código:


        //Generar un número al azar entre 0 y 1 y devolverlo
        //Pista: investigá qué hace el método Math.random()


        //La función va a recibir un entero. Devuelve como resultado una cadena de texto que indica si el número es positivo o negativo.
        //Si el número es positivo, devolver ---> "Es positivo"
        //Si el número es negativo, devolver ---> "Es negativo"
        //Si el número es 0, devuelve false


        // Agrega un símbolo de exclamación al final de la string "str" y devuelve una nueva string
        // Ejemplo: "hello world" pasaría a ser "hello world!"
        // Tu código:

        // Devuelve "nombre" y "apellido" combinados en una string y separados por un espacio.
        // Ejemplo: "Soy", "Henry" -> "Soy Henry"
        // Tu código:


        // Toma la string "nombre" y concatena otras string en la cadena para que tome la siguiente forma:
        // "Martin" -> "Hola Martin!"
        // Tu código:


        // Retornar el area de un rectángulo teniendo su altura y ancho
        // Tu código:


        //Escibe una función a la cual reciba el valor del lado de un cuadrado y retorne su perímetro.
        //Escribe tu código aquí


        //Desarrolle una función que calcule el área de un triángulo.
        //Escribe tu código aquí


        //Supongamos que 1 euro equivale a 1.20 dólares. Escribe un programa que reciba
        //como parámetro un número de euros y calcule el cambio en dólares.
        //Escribe tu código aquí


        //Escribe una función que reciba una letra y, si es una vocal, muestre el mensaje “Es vocal”.
        //Verificar si el usuario ingresó un string de más de un carácter, en ese caso, informarle
        //que no se puede procesar el dato mediante el mensaje "Dato incorrecto".
        // Si no es vocal, tambien debe devolver "Dato incorrecto".
        //Escribe tu código aquí


    }
}
