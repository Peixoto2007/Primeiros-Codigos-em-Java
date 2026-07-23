package banco;

public class Conta {
    String nome;
    double saldo;


    public Conta (String nome , double saldo){
        this.nome = nome;
        this.saldo = saldo;

    }

    public void depositar(double valor) throws Exception{
        if (valor<0|| valor==0){
            throw new Exception("Valor Invalido");
        }

        saldo += valor;

    }

    public void sacar(double valor) throws Exception {

        if (valor>saldo){
            throw new Exception("Saldo Insuficiente");
        }
        if (valor<0){
            throw new Exception( "Valor Invalido");
        }

        saldo -= valor;

    }

    void info(){
        System.out.println("Nome : "+nome);
        System.out.println("Saldo : "+saldo);
    }

    public void tranferir(double valor , Conta contadestino) throws Exception{
        if (valor>saldo || valor ==0 || valor<0){
            throw new Exception("Digite uma valor Valido");

        }
        this.sacar(valor);
        contadestino.depositar(valor);







    }
}
