package aula03.exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        List<Produto> carrinhoDeCompras = new ArrayList<>();

        Produto produto1 = new Produto("Produto 1", 10.0);
        Produto produto2 = new Produto("Produto 2", 20.0);
        Produto produto3 = new Produto("Produto 3", 15.0);

        carrinhoDeCompras.add(produto1);
        carrinhoDeCompras.add(produto2);
        carrinhoDeCompras.add(produto3);

        double precoTotal = calcularPrecoTotal(carrinhoDeCompras, (subtotal, produto) -> subtotal + produto.getPreco());

        System.out.println("Preço total do carrinho: " + precoTotal);
    }

    public static double calcularPrecoTotal(List<Produto> carrinhoDeCompras, BiFunction<Double, Produto, Double> calculadora) {
        double precoTotal = 0.0;

        for (Produto produto : carrinhoDeCompras) {
            precoTotal = calculadora.apply(precoTotal, produto);
        }

        return precoTotal;
    }
}