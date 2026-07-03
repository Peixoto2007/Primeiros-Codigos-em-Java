package aluno;

public class Aluno {
    int matricula;
    String nome;
    String curso;
    Avaliacao notas;


    Aluno (String nome, String curso, Avaliacao notas) {
        this.nome = nome;
        this.curso= curso;
        this.notas = notas;

}

    void saida(){
        System.out.println(nome);
        System.out.println(curso);
        System.out.println(notas.mediaarit());

    }

}
