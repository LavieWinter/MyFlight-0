package pucrs.myflight.modelo;

import java.util.ArrayList;
// Classe de Gerenciamento de aeronaves
//Testes ainda por serem feitos
// Manipula os dados da classe "Aeronave"
public class GerenciadorAeronaves {

    private ArrayList<Aeronave> aeronaves;

// Construtor
    public GerenciadorAeronaves(){
        aeronaves = new ArrayList<>();
    }

//Adiciona aeronaves
    public void adicionar(Aeronave aviao){
        aeronaves.add(aviao);
    }

//Lista as aeronaves
    public ArrayList<Aeronave> listarTodas(){
        return aeronaves;
        
    }

//Busca as aeronaves por código.
    public Aeronave buscarPorCodigo(String cod){
        for(Aeronave aviao: aeronaves){
            if(aviao.getCodigo() == cod)
                return aviao;
        }
        return null;
    }

}

