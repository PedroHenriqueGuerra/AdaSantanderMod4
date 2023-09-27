package aula02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class AtividadeEx03 {

    public static void main(String[] args) {


        ZonedDateTime zonedDateTimeNovaYork = ZonedDateTime.now( ZoneId.of("America/New_York"));
        ZonedDateTime zonedDateTimeParis = ZonedDateTime.now( ZoneId.of("Europe/Paris"));
        ZonedDateTime zonedDateTimeTokyo = ZonedDateTime.now( ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String horaNovaYork = zonedDateTimeNovaYork.format(formatter);
        String horaParis = zonedDateTimeParis.format(formatter);
        String horaTokyo = zonedDateTimeTokyo.format(formatter);

        System.out.println(horaNovaYork);
        System.out.println(horaParis);
        System.out.println(horaTokyo);
    }

}
