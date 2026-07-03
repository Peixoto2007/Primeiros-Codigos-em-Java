package aluno;



public class Conta {

    int numero;String titular;Double saldo;Double limite;
    Conta (int numero,String titular,Double saldo,Double limite){

        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;



    };

boolean sacar (double valor) {

    if ( valor > limite || valor > saldo){
        return false;
    }
    saldo -= valor;
    return true;
}


    boolean depositar (double valor) {
    if ( valor < 0){
        return false;
        }
    saldo +=valor;
    return true;
    }


    void info(){
        System.out.println("Numero da conta:" + numero);
        System.out.println("nome:" + titular);
        System.out.println("Saldo:" + saldo);
        System.out.println("Limite Disponivel:" + limite);

    }
}
