package livros;

public abstract class computador {
     int GbMemoria;
     int processadores;


     public computador(int GbMemoria , int processadores){
         super();
         this.GbMemoria = GbMemoria;
         this.processadores = processadores;

     }



    public abstract double calculaValor();



}
