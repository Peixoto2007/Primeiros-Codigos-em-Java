package aluno;

public class Aluno {
    private int matricula;
    public String nome;
    public String curso;
    private String escola;


    Aluno (int matricula,String nome, String curso, String escola) {

        this.matricula = matricula;
        this.nome = nome;
        this.curso= curso;
        this.escola = escola;

}

    void saida(){
        System.out.println(nome);
        System.out.println(curso);


    }

}
