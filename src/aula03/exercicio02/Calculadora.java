package aula03.exercicio02;

import java.util.function.BiFunction;

public class Calculadora {

    public static int executar(int num1, int num2, BiFunction<Integer, Integer, Integer> operacao) {
        return operacao.apply(num1, num2);
    }

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;

        // Operação de soma
        int resultadoSoma = executar(numero1, numero2, (a, b) -> a + b);
        System.out.println("Soma: " + resultadoSoma);

        // Operação de subtração
        int resultadoSubtracao = executar(numero1, numero2, (a, b) -> a - b);
        System.out.println("Subtração: " + resultadoSubtracao);

        // Operação de multiplicação
        int resultadoMultiplicacao = executar(numero1, numero2, (a, b) -> a * b);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        // Operação de divisão
        int resultadoDivisao = executar(numero1, numero2, (a, b) -> a / b);
        System.out.println("Divisão: " + resultadoDivisao);
    }
}
