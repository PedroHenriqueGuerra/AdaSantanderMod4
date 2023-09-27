package aula05.exercicio01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 2500.0, 10),
                new Produto("Impressora", 800.0, 5),
                new Produto("Mouse", 50.0, 20),
                new Produto("Teclado", 100.0, 15)
        );

        System.out.println("Produtos com preço acima de 500,00");
        produtos.stream().filter(produto -> produto.getPreco() > 500.0)
                .map(Produto::getNome)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Preço dos produtos");
        produtos.stream().map(Produto::getPreco)
                        .forEach(System.out::println);

        System.out.println();

        System.out.println("Produto com o menor preço");
        produtos.stream().min(Comparator.comparing(Produto::getPreco))
                        .ifPresent(produto -> System.out.println(produto.getNome()));

        System.out.println();

        System.out.println("Produtos com estoque menor que 10");
        produtos.stream().filter(produto -> produto.getQuantidade() < 10)
                .map(Produto::getNome)
                .forEach(System.out::println);

    }

}
