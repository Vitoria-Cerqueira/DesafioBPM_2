package org.example.desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fibonacci  fibonacci = new Fibonacci();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int valor = scanner.nextInt();

        System.out.println("FIB = " + fibonacci.calcularFibonacci(valor));
    }
}
