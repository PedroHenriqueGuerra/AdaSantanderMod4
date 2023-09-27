package aula04.exercicio01;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Produto> produtos = List.of(
                new Produto("Notebook", "Eletrônicos"),
                new Produto("Camisa", "Vestuário"),
                new Produto("Smartphone", "Eletrônicos"),
                new Produto("Tênis", "Calçados")
        );

        System.out.println("Produtos da categoria vestuário");

        produtos.stream().filter(produto -> produto.getCategoria().equalsIgnoreCase("Vestuário"))
                .map(Produto::getNome)
                .forEach(System.out::println);
    }

}
