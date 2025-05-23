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
        System.out.println("""
                \nExample 008
                Var <  90 => true
                Var => 90 => false""");
        System.out.println("Ingrese un numero");
        double var008 = scanner.nextDouble();
        boolean respuesta008 = (var008 < 90) ? true : false;
        System.out.println("Respuesta = " + respuesta008);


        // Devuelve "true" si el argumento de la función "num" es mayor que cincuenta
        // De lo contrario, devuelve "false"
        // Tu código:
        System.out.println("""
                \nExample 009
                Var <  50 => true
                Var => 50 => false""");
        System.out.println("Ingrese un numero");
        double x009 = scanner.nextDouble();
        boolean respuesta009 = (x009 < 50) ? true : false;
        System.out.println("Respuesta = " + respuesta009);

        // Obten el resto de la división de "x" entre "y"
        // Tu código:
        System.out.println("""
                \nExample 010
                x % y""");
        System.out.println("Ingrese x");
        double x010 = scanner.nextDouble();
        System.out.println("Ingrese y");
        double y010 = scanner.nextDouble();
        System.out.println("El resto de la divison es =" + x010 % y010);

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

        // Devuelve el valor de "num" elevado al cuadrado
        // ojo: No es raiz cuadrada!
        // Tu código:
        System.out.println("""
                \nExample 013
                x = x * x""");
        System.out.println("Ingrese x");
        double x013 = scanner.nextDouble();
        System.out.println("respuesta = " + Math.pow(x013, 2));

        // Devuelve el valor de "num" elevado al cubo
        // Tu código:
        System.out.println("""
                \nExample 014
                x = x ^ 3""");
        System.out.println("Ingrese x");
        double x014 = scanner.nextDouble();
        System.out.println("Respuesta = " + Math.pow(x014, 3));

        // Devuelve el valor de "num" elevado al exponente dado en "exponent"
        // Tu código:
        System.out.println("""
                \nExample 015
                res = x ^ y""");
        System.out.println("Ingrese x");
        double x015 = scanner.nextDouble();
        System.out.println("Ingrese y");
        double y015 = scanner.nextDouble();
        System.out.println("Respuesta = " + Math.pow(x015, y015));

        // Redondea "num" al entero más próximo y devuélvelo
        // Tu código:
        System.out.println("""
                \nExample 016
                x = |x|""");
        System.out.println("Ingrese x");
        double x016 = scanner.nextDouble();
        System.out.println("Respuesta = " + Math.round(x016));

        // Redondea "num" hacia arriba (al próximo entero) y devuélvelo
        // Tu código:
        System.out.println("""
                \nExample 017
                x = |x| => x""");
        System.out.println("Ingrese x ");
        double x017 = scanner.nextDouble();
        System.out.println("Respuesta = " + Math.ceil(x017));

        //Generar un número al azar entre 0 y 1 y devolverlo
        //Pista: investigá qué hace el método Math.random()
        System.out.println("""
                \nExample 018
                x = random()""");
        System.out.println("Respuesta = " + Math.random());

        //La función va a recibir un entero. Devuelve como resultado una cadena de texto que indica si el número es positivo o negativo.
        //Si el número es positivo, devolver ---> "Es positivo"
        //Si el número es negativo, devolver ---> "Es negativo"
        //Si el número es 0, devuelve false
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

        // Agrega un símbolo de exclamación al final de la string "str" y devuelve una nueva string
        // Ejemplo: "hello world" pasaría a ser "hello world!"
        // Tu código:
        System.out.println("""
                \nExample 020
                x = agregar simbolo de exclamacion !""");
        System.out.println("Inserte la cadena de texto");
        String x020 = scanner.nextLine();
        System.out.println("Respuesta = " + x020 + "!");

        // Devuelve "nombre" y "apellido" combinados en una string y separados por un espacio.
        // Ejemplo: "Soy", "Henry" -> "Soy Henry"
        // Tu código:
        System.out.println("""
                \nExample 021
                Unir Nombre Apellido""");
        System.out.println("Inserte Nombre");
        String x021 = scanner.nextLine();
        System.out.println("Inserte Apellido");
        String y021 = scanner.nextLine();
        System.out.println("Respuesta = " + x021 + " " + y021);

        // Toma la string "nombre" y concatena otras string en la cadena para que tome la siguiente forma:
        // "Martin" -> "Hola Martin!"
        // Tu código:
        System.out.println("""
                \nExample 022
                Unir Hola con nombre""");
        System.out.println("Ingrese el nombre");
        String x022 = scanner.nextLine();
        System.out.println("Hola " + x022 + "!");

        // Retornar el area de un rectángulo teniendo su altura y ancho
        // Tu código:
        System.out.println("""
                \nExample 023
                Area = b * h""");
        System.out.println("Ingrese b");
        double x023 = scanner.nextDouble();
        System.out.println("Ingrese h");
        double y023 = scanner.nextDouble();
        System.out.println("Area = " + x023 * y023);

        //Escibe una función a la cual reciba el valor del lado de un cuadrado y retorne su perímetro.
        //Escribe tu código aquí
        System.out.println("""
                \nExample 024
                Perimetro = l + l + l + l""");
        System.out.println("Ingrese el lado (l)");
        double x024 = scanner.nextDouble();
        System.out.println("Perimetro = " + 4 * x024);

        //Desarrolle una función que calcule el área de un triángulo.
        //Escribe tu código aquí
        System.out.println("""
                \nExample 025
                Area Triagulo = (b*h)/2""");
        System.out.println("Ingrese b");
        double x025 = scanner.nextDouble();
        System.out.println("Ingrese h");
        double y025 = scanner.nextDouble();
        System.out.println("Area = " + (x025 * y025) / 2);

        //Supongamos que 1 euro equivale a 1.20 dólares. Escribe un programa que reciba
        //como parámetro un número de euros y calcule el cambio en dólares.
        //Escribe tu código aquí
        System.out.println("""
                \nExample 026
                Euros = 1.20 * Dolares""");
        System.out.println("Ingrese Cantidad Dolares");
        double x026 = scanner.nextDouble();
        System.out.println("Respuesta Euros = " + 1.20 * x026);

        //Escribe una función que reciba una letra y, si es una vocal, muestre el mensaje “Es vocal”.
        //Verificar si el usuario ingresó un string de más de un carácter, en ese caso, informarle
        //que no se puede procesar el dato mediante el mensaje "Dato incorrecto".
        // Si no es vocal, tambien debe devolver "Dato incorrecto".
        //Escribe tu código aquí


    }
}
