package aula02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AtividadeEx01 {

    public static void main(String[] args) {
        List<String> datasStrings = new ArrayList<>();
        datasStrings.add("2023-08-10");
        datasStrings.add("2022-05-10");
        datasStrings.add("2021-11-30");

        List<LocalDate> datasLocalDate = new ArrayList<>();

        for(int i = 0; i < datasStrings.size(); i++){
            LocalDate dataLocalDate = LocalDate.parse(datasStrings.get(i));
            datasLocalDate.add(dataLocalDate);
        }
    }

}
