package pucrs.myflight.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
			if (cia.getNome() == nome)
				return cia;
		}
		return null;
	}
    public static GerenciadorCias getInstance() {
        return null;
    }

	public boolean readFile() {
        Path path1 = Paths.get("src/pucrs/myflight/modelo/Files/airlines");
        try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");
                
                String id = dados[0];
                String desc = dados[1];

                CiaAerea empresa = new CiaAerea(id, desc);

                adicionar(empresa);
            }
        }
        catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
        return true;
    }
}
