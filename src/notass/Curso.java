package notass;

public class Curso {

     String nome;
     double mensalidade;

    public Curso ( String nome, double mensalidade){

        this.nome = nome;
        this.mensalidade = mensalidade;
    }

    void info(){
        System.out.println("Nome do Curso :" + nome);
        System.out.println("Mensalidade do Curso :" + mensalidade);
    };
}
