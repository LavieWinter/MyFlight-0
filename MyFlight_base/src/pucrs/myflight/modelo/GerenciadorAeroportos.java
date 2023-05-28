package pucrs.myflight.modelo;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GerenciadorAeroportos {


    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aeroporto){
        aeroportos.add(aeroporto);
    }

    public ArrayList<Aeroporto> listarTodos(){
        return aeroportos;
    }

    public Aeroporto buscarporCodigo(String cod){
        for (Aeroporto aeroporto : aeroportos){
            if(aeroporto.getCodigo() == cod){
                return aeroporto;
            }
        }
        return null;
    }
    
    public void addOrdenado(Aeroporto aeroporto){
        int i = 0;
        while(i < aeroportos.size() && aeroporto.getNome().compareTo(aeroportos.get(i).getNome()) > 0){
            i++;
        }
        aeroportos.add(i, aeroporto);
    }

    public boolean readFile(String nomeArq) {
        Path path1 = Paths.get("\\Files\\" + nomeArq);
        try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");
                
                double latitude = Double.parseDouble(dados[1]);
                double longitude = Double.parseDouble(dados[2]);

                Geo loc = new Geo(latitude, longitude);
                Aeroporto aeroporto = new Aeroporto(dados[0], dados[3], loc);

                adicionar(aeroporto);
            }
        }
        catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
        return true;
    }

    public static GerenciadorAeroportos getInstance() {
        return null;
    }

}
