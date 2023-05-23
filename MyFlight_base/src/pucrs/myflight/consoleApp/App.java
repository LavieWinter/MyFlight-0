package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.GerenciadorAeroportos;
import pucrs.myflight.modelo.GerenciadorRotas;
import pucrs.myflight.modelo.Rota;
import pucrs.myflight.modelo.Voo;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

		GerenciadorAeroportos listaAero = new GerenciadorAeroportos();
		GerenciadorRotas listaRotas = new GerenciadorRotas();
		//Passando valores das companinhas aéreas

		CiaAerea ca1 = new CiaAerea("JJ", "LATAM Linhas Aéreas");
		CiaAerea ca2 = new CiaAerea("G3", "Gol Linhas Aéreas SA");
		CiaAerea ca3 = new CiaAerea("TP", "TAP Portugal");
		CiaAerea ca4 = new CiaAerea("AD", "Azul Linhas Aéreas");

		System.out.println(ca1);
		System.out.println(ca2);
		System.out.println(ca3);
		System.out.println(ca4);

		//Passando valores das aeronaves

		Aeronave a1 = new Aeronave("773", "Boeing 737-300");//Capacidade 140
		Aeronave a2 = new Aeronave("73G", "Boeing 737-700");//Capacidade 126
		Aeronave a3 = new Aeronave("380", "Airbus Industrie A380");//Capacidade 644
		Aeronave a4 = new Aeronave("764", "Boeing 767-400");//Capacidade 304

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);

		//Pasaando Valores dos aeroportos 

		Aeroporto ae1 = new Aeroporto("POA", "Salgado Filho Intl Apt", null);
		Aeroporto ae2 = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", null);
		Aeroporto ae3 = new Aeroporto("LIS", "Lisbon", null);
		Aeroporto ae4 = new Aeroporto("MIA", "Miami International Apt", null);

		System.out.println(ae1);
		System.out.println(ae2);
		System.out.println(ae3);
		System.out.println(ae4);

		//adicionando aeroportos na lista de forma ordenada
		listaAero.addOrdenado(ae1);
		listaAero.addOrdenado(ae2);
		listaAero.addOrdenado(ae3);
		listaAero.addOrdenado(ae4);
		System.out.println("\n------------aeroportos ordenados--------------");
		//para ver se a lista está ordenada
		for(Aeroporto aeroporto : listaAero.listarTodos()){
			System.out.println(aeroporto);
		}
		System.out.println("------------aeroportos ordenados--------------\n");

		//Pasando valores de rotas
		Rota r1 = new Rota(ca2, ae2, ae1, a4);//Trocar a4 por 738
		Rota r2 = new Rota(ca2, ae1, ae2, a4);//trocar a4 por 738
		Rota r3 = new Rota(ca3, ae4, ae3, a4);//trocar a4 por 332
		Rota r4 = new Rota(ca1, ae2, ae4, a4);//trocar ae4 por GIG e trocar a4 por 320


		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		//rotas adicionadadas a lista usando o método de ordenação por CiaAérea
		listaRotas.addOrdenado(r4);
		listaRotas.addOrdenado(r2);
		listaRotas.addOrdenado(r3);
		listaRotas.addOrdenado(r1);
		System.out.println("\n------------rotas ordenadas--------------");
		//para ver se a lista está ordenada
		for(Rota rota : listaRotas.listarTodas()){
			System.out.println(rota);
		}
		System.out.println("------------aeroportos ordenados--------------\n");



		//Passando valores de vooa
		Voo v1 = new Voo(r1,null );// Mudar Valores
		Voo v2 = new Voo(r2, null);// Mudar Valores
		Voo v3 = new Voo(r3, null);// Mudar Valores
		

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		//Teste da classe Geo: POA e GRU STATIC
		Geo g0 = new Geo(-30.0277, -51.2287);
		Geo g1 = new Geo(-23.413,  -46.4445);

		double calculo = Geo.distancia(g0, g1);

		System.out.println(calculo);
		
		// NÂO STATIC

		System.out.println(g0.caldis(g1));
	}
}
