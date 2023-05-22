package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo {
    
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO }; 
    
    //private LocalDateTime datahora;
    //private Duration duracao;
    //private Rota rota;
    private Rota rotaFinal;
    //private Status status;

    // Construtor
    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
        super(rota, datahora, duracao); // chama o construtor de Voo
        this.rotaFinal = rotaFinal;
     }
   
   /*  public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime dh, Duration dur) {
    this.rota = rota;
    this.rotaFinal = rotaFinal;
    this.datahora = dh;
    this.duracao = dur;
    } */

    /*public Rota getRota(){
        return rota;
    }*/

    public Rota getRotaFinal(){
        return rotaFinal;
    }

    /*public LocalDateTime getDataHora(){
        return datahora;
    }*/

    /*public Duration getDuracao(){
        return duracao;
    }*/

    /*@Override
    public String toString() {
       return status + " " + datahora + "("+duracao+"): " + rota + " -> " + rotaFinal;
    }*/

    /*@Override
    public String toString() {
       return getStatus() + " " + getDataHora() + "("+getDuracao()+"): " + getRota() + " -> " + rotaFinal;
    }*/

    @Override
    public String toString() {
       return super.toString() + " -> " + rotaFinal;
    }

}
