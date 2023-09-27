package aula02;

import java.time.LocalDate;

public class ExercicioVacina {

    public static void main(String[] args) {
        LocalDate primeiraDose = LocalDate.of(2023, 02, 01);
        System.out.println("Primeira dose: " + primeiraDose);

        LocalDate segundaDose = primeiraDose.plusMonths(1);
        System.out.println("Segunda dose: " + segundaDose);

        LocalDate terceiraDose = segundaDose.plusMonths(1);
        System.out.println("Terceira dose: " + terceiraDose);

    }

}
