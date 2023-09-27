package aula04;

import java.util.Arrays;
import java.util.List;

public class ProblemaStream {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(2, 3, 4, 5, 6);

        for(int i = 0; i < lista.size(); i++){
            lista.set(i, lista.get(i) * 2);
        }
        System.out.println(lista);
    }

}
