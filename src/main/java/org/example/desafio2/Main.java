package org.example.desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConverterHora converterHora = new ConverterHora();

        System.out.println("Digite o valor em segundos: ");
        long segundos = scanner.nextLong();

        String dataFormatada = converterHora.converterSegundoParaHora(segundos);
        System.out.println("Data e hora formatadas: " + dataFormatada);
    }
}
