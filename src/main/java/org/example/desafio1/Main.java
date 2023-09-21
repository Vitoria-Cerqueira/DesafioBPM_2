package org.example.desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrdenarParesImpares ordenarParesImpares = new OrdenarParesImpares();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.println("Digite a quantidade de valores: ");
        int qtaValores = scanner.nextInt();

        for (int i = 0; i < qtaValores; i++) {
            System.out.println("Digite os valores:");
            int valor = scanner.nextInt();
            ordenarParesImpares.separarValores(pares,impares,valor);
        }
        ordenarParesImpares.ordenarValores(pares,impares);
        ordenarParesImpares.exibirValores(pares,impares);

    }
}
