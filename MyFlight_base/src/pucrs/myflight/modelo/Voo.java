package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Voo {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Status status;	
	
	public Voo(LocalDateTime datahora) {
		
		this.datahora = datahora;
		this.status = Status.CONFIRMADO;
	}

	
	
	public abstract Rota getRota(); 
	
	
	public LocalDateTime getDatahora() {
		return datahora;
	}
	
	public abstract Duration getDuracao();



	@Override
	public String toString() {
		return "Voo [datahora=" + datahora + ", status=" + status + "]";
	}



	
	
		
	

	

	
}
