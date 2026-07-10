package notass;

public class Alunos {
    String nome;
    int matricula;
    double desconto;
    Curso curso;


    public Alunos(String nome, int matricula , double desconto , Curso curso){
        this.nome= nome;
        this.matricula= matricula;
        this.desconto= desconto;
        this.curso= curso;

    };

    void info(){
        System.out.println("Nome do aluno :" + nome);
        System.out.println("Matricula do aluno :" + matricula);
        System.out.println("Desconto do aluno :" + desconto);
        curso.info();
        System.out.println("O aluno devera pagar :" + pagamento());
    };

     double pagamento(){
        return (curso.mensalidade*desconto)/100;


    };






}
