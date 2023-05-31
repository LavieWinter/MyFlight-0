package pucrs.myflight.modelo;
import java.time.Duration;
import java.time.LocalDateTime;


public class VooDireto extends Voo {
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
    private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
    

    public VooDireto(Rota rota, LocalDateTime datahora) {
        super(datahora);
        this.rota = rota;       
        this.status = Status.CONFIRMADO;
    }

    public Rota getRota(){
        return rota;    
    }

    public Duration getDuracao(){
        double distancia = Geo.distancia(rota.getOrigem().getLocal(), rota.getDestino().getLocal());
        
        return Duration.ofMinutes((long) (distancia/805*60+30));
    }

    @Override
    public String toString() {
        return "VooDireto [datahora=" + datahora + ", duracao=" + getDuracao() + ", rota=" + rota + ", status=" + status
                + "]";
    }




}
