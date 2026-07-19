package livros;

public class Notebook extends computador{
    int polegadasTela;

    @Override
    public double calculaValor(){
        double total = ((((GbMemoria*250)+processadores)*500)+polegadasTela)*100 ;
        return total;
    }

    public Notebook (int polegadasTela , int GbMemoria, int processadores){
       super(GbMemoria, processadores);
       this.polegadasTela = polegadasTela;


    }

}
