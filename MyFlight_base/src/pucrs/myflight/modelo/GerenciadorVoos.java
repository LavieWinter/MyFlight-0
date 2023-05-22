package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;

    public GerenciadorVoos(){
        voos = new ArrayList<>();
    }

    public void adicionar(Voo voo){
        voos.add(voo);
    }

    public ArrayList<Voo> listarTodos(){
        return voos;
    }

    
    public ArrayList<Voo> buscarPorData(String date){
        ArrayList<Voo> resultado = new ArrayList<>();
            for(int i = 0; i< voos.size(); i++){
                if(voos.get(i).getDatahora().equals(date))
                    resultado.add(voos.get(i));
            }
            return resultado;
    }
    
}

