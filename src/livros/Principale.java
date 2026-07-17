package livros;

public class Principale {
    public static void main(String[] args) {

//        Livro livrooos [] = {new Livro("Quem pensa Enriquece",(new Autor("Napoleon Hill","Dyego2020@Gmail.com","Noruega")),"Financas",2007),
//                new LivroDigital("Cosmos",(new Autor("Carl Sagan","Carlsagan1998@gmail,com","American")),"Ciencia",2014,20,5.10),
//                new LivroFisico("Agua viva",(new Autor("Clarice Lispector","claricelispctor@2011.com","Brasileira")),"Filosofia",2009,200,10)};
//        Livro dyego = new Livro("Como arranjar seu Primeiro Estagio", new Autor("Dyego","Evelyn@gmail.com","Espanha"), "Autoajuda", 2026);
//        LivroDigital evelyn = new LivroDigital("Feio como nos filmes",new Autor("Neymar","Dyegoquerestagio@gmail.com","Brasil")
//                ,"Masculino",2029,120,2.00);
//        evelyn.info();
//
//        System.out.println();
//        Livro g;
//        for(int z=0; z<livrooos.length; z++){
//            g = livrooos[z];
//            System.out.println(g.titulo + g.autor);


        LivroDigital livrao = new LivroDigital("Cosmos",(new Autor("Carl Sagan","Carlsagan1998@gmail,com","American")),"Ciencia",2014,20,5.10);
        LivroFisico livrao2 = new LivroFisico("Agua viva",(new Autor("Clarice Lispector","claricelispctor@2011.com","Brasileira")),"Filosofia",2009,200,10);

        Livro livross;
        livross = livrao;
        livross.info();
        livross = livrao2;

        livross.info();
    };

    }