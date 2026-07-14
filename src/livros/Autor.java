package livros;

public class Autor {
    protected String autor;
    protected String email;
    protected String nacionalidade;


    public String getNome() {
        return autor;
    }

    public void setNome(String nome) {
        this.autor = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public Autor(String nome,String email, String nacionalidade){
        this.autor=autor;
        this.email=email;
        this.nacionalidade=nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public void infos(){
        System.out.println("Nome Autor :" +autor);
        System.out.println("Email Autor :" +email);
        System.out.println("Nacionalidade Autor :" +nacionalidade);
    };
}
