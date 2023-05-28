package pucrs.myflight.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    public static GerenciadorAeronaves getInstance() {
        return null;
    }

    public boolean readFile() {
        Path path1 = Paths.get("src/pucrs/myflight/modelo/Files/equipment");
        try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");
                
                String id = dados[0];
                String desc = dados[1];
                int cap = Integer.parseInt(dados[2]);

                Aeronave aeronave = new Aeronave(id, desc, cap);

                adicionar(aeronave);
            }
        }
        catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
        return true;
    }

}

