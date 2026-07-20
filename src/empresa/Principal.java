package empresa;

public class  Principal {

    public static void main(String[] args) {

        /// INTERFACE

        Funcionario dyego = new Funcionario("Dyego","00*.555.665.78");
        Carro a = new Carro("BMW","Vermelha",4);

    Imprimivel i = dyego;

    i.imprimir();

    i = a;

    i.imprimir();
    }
}
