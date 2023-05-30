package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo {
    
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO }; 
    
    private Rota rotaFinal;

    // Construtor
    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
        super(rota, datahora, duracao); // chama o construtor de Voo
        this.rotaFinal = rotaFinal;
     }

    //getter 
    public Rota getRotaFinal(){
        return rotaFinal;
    }

    //toString
    @Override
    public String toString() {
       return super.toString() + " -> " + rotaFinal;
    }

}
