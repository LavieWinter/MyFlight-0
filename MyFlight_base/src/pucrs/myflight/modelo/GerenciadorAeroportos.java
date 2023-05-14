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

}
