package aula05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LerArquivo {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/resources/employee.csv"); //Caminho do arquivo

        Stream<String> lines =  Files.lines(path);

        List<Funcionario> funcionarios = new ArrayList<>();

        lines.forEach(string ->{
            String[] funcionarioString = string.split(",");

            Funcionario funcionario = new Funcionario();
            funcionario.setId(Integer.parseInt(funcionarioString[0]));
            funcionario.setNome(funcionarioString[1]);
            funcionario.setSexo(funcionarioString[2]);
            funcionario.setDataNascimento(LocalDate.parse(funcionarioString[3]));
            funcionario.setCidade(funcionarioString[4]);
            funcionario.setCargo(funcionarioString[5]);
            funcionario.setDataAdmissao(LocalDate.parse(funcionarioString[6]));
            funcionario.setSalario(Double.parseDouble(funcionarioString[7]));

            funcionarios.add(funcionario);

        });

        System.out.println(funcionarios);

    }

}
