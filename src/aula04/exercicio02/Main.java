package aula04.exercicio02;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Produto> produtos = List.of(
                new Produto("Notebook", 2500.0),
                new Produto("Camisa", 50.0),
                new Produto("Smartphone", 1200.0),
                new Produto("Tênis", 150.0)
        );

        System.out.println("Produto mais caro: ");
        produtos.stream().max(Comparator.comparing(Produto::getPreco))
                .ifPresent(produto -> System.out.println(produto.getNome()));

    }

}
