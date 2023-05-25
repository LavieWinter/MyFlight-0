package pucrs.myflight.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;

public class GerenciadorRotas {

    private static final String CharSequence = null;
    private ArrayList<Rota> rotas;

    public GerenciadorRotas() {
        rotas = new ArrayList<>();
    }

    public void adicionar(Rota rota) {
        rotas.add(rota);
    }

    public ArrayList<Rota> listarTodas() {
        return rotas;
    }

    public ArrayList<Rota> buscarCodigo(String orig) {
        ArrayList<Rota> resultado = new ArrayList<>();
        for (int i = 0; i < rotas.size(); i++) {
            if (rotas.get(i).getOrigem().equals(orig))
                resultado.add(rotas.get(i));
        }
        return resultado;
    }

    public void addOrdenado(Rota rota) {
        int i = 0;
        while (i < rotas.size() && rota.getCia().getNome().compareTo(rotas.get(i).getCia().getNome()) > 0) {
            i++;
        }
        rotas.add(rota);
    }

    public void carregaDados() throws IOException {
        GerenciadorCias empresas = GerenciadorCias.getInstance();
        GerenciadorAeroportos aeroportos = GerenciadorAeroportos.getInstance();
        GerenciadorAeronaves aeronaves = GerenciadorAeronaves.getInstance();
        Path path1 = Paths.get("src/pucrs/myflight/modelo/Files");
        try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");
                
                String codAero = dados[5].substring(0, 3);

                CiaAerea cia = empresas.buscarCodigo(dados[0]);
                Aeroporto origemAeroporto = aeroportos.buscarporCodigo(dados[1]);
                Aeroporto dAeroporto = aeroportos.buscarporCodigo(dados[2]);
                Aeronave aeronave = aeronaves.buscarPorCodigo(codAero);

                Rota rota = new Rota(cia, origemAeroporto, dAeroporto, aeronave);

                adicionar(rota);
            }
        }
        catch(Exception e){
            System.err.format("Erro de E/S: %s%n", e);
        }
    }
}
