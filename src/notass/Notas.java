package notass;

public class Notas {

    private double nota1;
    private double nota2;
    protected int faltas;

    public void resultado(){
        double media = (nota1 + nota2) / 2.0;
        if(nota1+nota2 <= 5){
            System.out.println("Reprovado por nota ");
        }
        
        if(faltas >=5){
            System.out.println("Reprovado por Faltas ");
        }
        else{
            System.out.println("Aprovado");
        }
        System.out.println("Sua media :" + media);
        System.out.println("Suas Faltas :" + faltas);

    }

    public double getNota1() {
        return nota1;
    };

    public double getNota2() {
        return nota2;
    }

    public void setNota1(double nota1){
        if (nota1 < 0 || nota1>10) {
            System.out.println("Nota Invalida");
            return;
        }
        this.nota1 = nota1;

    };

    public void setNota2(double nota2) {
        if (nota2 < 0 || nota2>10) {
            System.out.println("Nota Invalida");
            return;
        }
        this.nota2 = nota2;
    }
}
