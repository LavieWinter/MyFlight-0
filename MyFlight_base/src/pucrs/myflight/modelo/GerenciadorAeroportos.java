package pucrs.myflight.modelo;
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

}
