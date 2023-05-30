package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

// extends class Voo
public class VooVariasEscalas extends VooEscalas{

    private VooEscalas vooEscalas;

    public VooVariasEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
        super(rota, rotaFinal, datahora, duracao);
    }
    

}
