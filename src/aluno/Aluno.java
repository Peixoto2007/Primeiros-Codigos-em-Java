package aluno;

public class Aluno {
    int matricula;
    String nome;
    String cpf;
    static String genero = "masculino";

    Aluno(int pmatricula, String pnome, String pcpf) {

        matricula=pmatricula;
        nome =pnome;
        cpf= pcpf;
}

    void saida(){
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(matricula);
        System.out.println(genero);

    }

}
