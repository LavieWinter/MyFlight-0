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


    //percebi que essa é meio complicada. vou pesquisar mais antes de fazer.
    public ArrayList<Rota> buscarPorOrigem(Aeroporto orig){
        return null;
    }

}
