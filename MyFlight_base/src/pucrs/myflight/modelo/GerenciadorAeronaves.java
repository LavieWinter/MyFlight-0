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
    private ArrayList<Aeronave> listarTodas(){
        return aeronaves;
        
    }

//Busca as aeronaves por código. Ainda não completa.
    public Aeronave buscarPorCodigo(String cod){
        return null;
    }

}

