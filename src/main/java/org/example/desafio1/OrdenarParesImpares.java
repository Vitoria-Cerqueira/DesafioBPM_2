package org.example.desafio1;

import java.util.Collections;
import java.util.List;

public class OrdenarParesImpares {
    public void separarValores(List<Integer> pares,List<Integer> impares, int valor){
        if (valor % 2 == 0){
            pares.add(valor);
        }else {
            impares.add(valor);
        }
    }
    public void ordenarValores(List<Integer> pares, List<Integer> impares){
        Collections.sort(pares);
        Collections.sort(impares,Collections.reverseOrder());
    }
    public void exibirValores(List<Integer> pares, List<Integer> impares){
        System.out.println("Valores ordenados");
        for (int par: pares){
            System.out.println(par);
        }
        for (int impar:impares) {
            System.out.println(impar);
        }
    }
}
