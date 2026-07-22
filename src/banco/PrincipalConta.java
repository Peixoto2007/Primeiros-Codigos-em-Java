package banco;

public class PrincipalConta {
    public static void main(String[] args) {
    try {
        Conta contadyego = new Conta("Dyego", 1320.20);
        Conta contaevelyn = new Conta("Evelyn", 3562.56);
        contadyego.sacar(40);
        System.out.println(contadyego.saldo);
        System.out.println(" ");
        contadyego.depositar(5);
        System.out.println(contadyego.saldo);
        System.out.println(" ");
        contadyego.tranferir(500,contaevelyn);
        System.out.println(contaevelyn.saldo);
        System.out.println(" ");
        contaevelyn.info();
        System.out.println(" ");
        contadyego.info();
    }
    catch (Exception problema) {
        System.out.println(problema.getMessage()); ;
    }
    finally {
        System.out.println("Fechando o programa...!");
    }


    }
}
