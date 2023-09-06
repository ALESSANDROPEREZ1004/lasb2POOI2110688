/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2pooi2110688;

/**
 *
 * @author Alumno
 */
public class Lab2POOI2110688 {
    //Ejercicio a
    public static void main(String[] args) {
        System.out.println("Hello World!");
    import java.util.Scanner;

    public class Solution {
        public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número a evaluar: ");
        long n = sc.nextLong();
        
        System.out.println(n + " puede ser almacenado en: ");
        
        if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
            System.out.println("(*) byte");
        }
        
        if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
            System.out.println("(*) short");
        }
        
        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
            System.out.println("(*) int");
        }
        
        System.out.println("(*) long");
        
        if (n < Byte.MIN_VALUE || n > Long.MAX_VALUE) {
            System.out.println(n + " no se puede almacenar en ningún tipo de dato primitivo.");
        }
        
        sc.close();
        }
    }
}
    //Ejercicio b
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        
        if (n % 2 == 1) {
            System.out.println("Luna");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("Sol");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Tierra");
            } else {
                System.out.println("Galaxia");
            }
        }
        
        sc.close();
    }
}
    //Ejercicio c
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        double currentSalary;
        double rating;
        double raise;
        
        Scanner sc = new Scanner(System.in);
        
        // Pedir el salario anual actual del empleado
        System.out.print("Ingrese el salario anual actual del empleado: ");
        double salarioActual = sc.nextDouble();
        
        // Pedir la calificación de desempeño del empleado (1=excelente, 2=bueno, 3=malo)
        System.out.print("Ingrese la calificación de desempeño (1=excelente, 2=bueno, 3=malo): ");
        int calificacion = sc.nextInt();
        
        double aumento = 0.0; // Variable para almacenar el aumento
        
        // Calcular el aumento según la calificación
        if (calificacion == 1) {
            aumento = salarioActual * 0.06;
        } else if (calificacion == 2) {
            aumento = salarioActual * 0.04;
        } else if (calificacion == 3) {
            aumento = salarioActual * 0.015;
        } else {
            System.out.println("Calificación no válida. Debe ser 1, 2 o 3.");
            sc.close();
            return;
        }
        
        // Calcular el nuevo salario
        double nuevoSalario = salarioActual + aumento;
        
        // Mostrar el aumento y el nuevo salario
        System.out.println("Aumento: $" + aumento);
        System.out.println("Nuevo salario: $" + nuevoSalario);
        
        sc.close();
    }
}
    //Ejercicio d
public class ZodiacSign {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Por favor, ingrese un año como argumento.");
            return;
        }

        try {
            int year = Integer.parseInt(args[0]);
            int remainder = year % 12;
            
            String zodiacSign;

            switch (remainder) {
                case 0:
                    zodiacSign = "Monkey";
                    break;
                case 1:
                    zodiacSign = "Gallo";
                    break;
                case 2:
                    zodiacSign = "Perro";
                    break;
                case 3:
                    zodiacSign = "Cerdo";
                    break;
                case 4:
                    zodiacSign = "Rata";
                    break;
                case 5:
                    zodiacSign = "Buey";
                    break;
                case 6:
                    zodiacSign = "Tigre";
                    break;
                case 7:
                    zodiacSign = "Conejo";
                    break;
                case 8:
                    zodiacSign = "Dragón";
                    break;
                case 9:
                    zodiacSign = "Serpiente";
                    break;
                case 10:
                    zodiacSign = "Caballo";
                    break;
                case 11:
                    zodiacSign = "Cabra";
                    break;
                default:
                    zodiacSign = "Año no válido";
                    break;
            }

            System.out.println(year + " es el año del " + zodiacSign + ".");
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un año válido como argumento.");
        }
    }
}




