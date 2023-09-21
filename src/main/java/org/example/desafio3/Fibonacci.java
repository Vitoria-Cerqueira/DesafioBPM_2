package org.example.desafio3;

public class Fibonacci {
    public int calcularFibonacci(int n){
        if (n <=1){
            return n;
        }else {
            int fibAtual = 1;
            int fibAnterior = 0;

            for (int i = 2; i <= n; i++){
                int fib = fibAtual;
                fibAtual = fibAtual + fibAnterior;
                fibAnterior = fib;
            }
            return fibAtual;
        }
    }
}
