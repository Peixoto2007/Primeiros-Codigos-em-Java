package livros;

public class Desktop extends computador {
    double acessorios;


    public Desktop(int GbMemoria , int processadores , double acessorios) {
    super(GbMemoria , processadores);
    this.acessorios = acessorios;


    }
    @Override
    public double calculaValor() {
        double total =((GbMemoria*200)+processadores)*400+acessorios;
        return total ;
    }

    }

