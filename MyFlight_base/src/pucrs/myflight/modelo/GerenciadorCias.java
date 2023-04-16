package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	//construtor
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}
	//Adiciona CiaAerea
	public void adicionar(CiaAerea cia){
        empresas.add(cia);
    }

	//Lista todas as cias
    public ArrayList<CiaAerea> listarTodas(){
        return empresas;
        
    }

	public CiaAerea buscarCodigo(String cod){
		for (CiaAerea cia: empresas) {
			if (cia.getCodigo() == cod)
				return cia;
		}
		return null;
	}

	public CiaAerea buscarNome(String nome){
		for (CiaAerea cia: empresas) {
			if (cia.getCodigo() == nome)
				return cia;
		}
		return null;
	}
}
