package pucrs.myflight.modelo;

public class Aeronave implements Contavel{
	private String codigo;
	private String descricao;
	public int capacidade;
	private static int contador = 0;
	
	public Aeronave(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + " Descrição: " + descricao + " Capacidade: " + capacidade;
	}

	@Override
	public void novoObjeto() {
		contador++;
	}

	@Override
	public int getContavel() {
		return contador;
	}

}
