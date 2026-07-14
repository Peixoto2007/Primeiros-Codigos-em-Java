package livros;

public class Livro {
    protected String titulo;
    protected Autor autor;
    protected String genero;
    protected int edicao;

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    public Livro(String titulo, Autor autor , String genero, int edicao){
        
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.edicao = edicao;
    };

    public void info(){
        System.out.println("Titulo :" +titulo);
        System.out.println("Autor :" +autor);
        System.out.println("Genero :" +genero);
        System.out.println("Edicao :" +edicao);
    };
}
