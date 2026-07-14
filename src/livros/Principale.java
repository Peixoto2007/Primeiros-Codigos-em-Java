package livros;

public class Principale {
    public static void main(String[] args) {


        Livro dyego = new Livro("Como arranjar seu Primeiro Estagio", new Autor("Dyego","Evelyn@gmail.com","Espanha"), "Autoajuda", 2026);
        LivroDigital evelyn = new LivroDigital("Feio como nos filmes",new Autor("Neymar","Dyegoquerestagio@gmail.com","Brasil")
                ,"Masculino",2029,120,2.00);
        evelyn.info();

    }
}