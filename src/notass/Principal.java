package notass;

public class Principal {

    public static void main(String[] args){


    Notas maria = new Notas();
    maria.setNota1(6);
    maria.setNota2(8);
    maria.faltas = 4;

    maria.resultado();

    Alunos dyego = new Alunos("Dyego",111,0.1,new Curso("Analise e Desenvolvimento",1000));

    dyego.info();
    System.out.println("Pagamento :" + dyego.pagamento());



    }
}
