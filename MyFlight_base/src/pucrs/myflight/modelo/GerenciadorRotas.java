package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {

    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        rotas = new ArrayList<>();
    }

    public void adicionar(Rota rota){
        rotas.add(rota);
    }

    public ArrayList<Rota> listarTodas(){
        return rotas;
    }

    public ArrayList<Rota> buscarCodigo(String orig){
        ArrayList<Rota> resultado = new ArrayList<>();
		for(int i = 0; i < rotas.size(); i++){
			if (rotas.get(i).getOrigem().equals(orig))
				resultado.add(rotas.get(i));
		}
		return resultado;
	}

    public void addOrdenado(Rota rota){
        int i = 0;
        while(i < rotas.size() && rota.getCia().getNome().compareTo(rotas.get(i).getCia().getNome()) > 0){
            i++;
        }
        rotas.add(rota);
    }
}
