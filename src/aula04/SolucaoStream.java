package aula04;

import java.util.stream.Stream;

public class SolucaoStream {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(2, 3, 4, 5, 6);

        stream.map(n -> n * 2).forEach(n -> System.out.println(n));

        //System.out.println(streamDobro);


    }

}
