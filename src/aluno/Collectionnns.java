package aluno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Collectionnns {

    public static void main(String args[]) {
        HashMap<String, String> capitais = new HashMap<>();

        capitais.put("Brasil", "brasilial");
        capitais.put("Russia", "Moscou");
        capitais.put("Chile", "Santiago");

        System.out.println(capitais);

//        ClassesData
        LocalDate datahoje = LocalDate.now();

        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(datahoje.format(formatar));
    }
}
