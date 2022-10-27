package netbiis;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class StreamAppDesafio {

	static List<String> clientes = new ArrayList<>();

	public static void filtrarPorLetraSemStream(String letra){
		System.out.println("Clientes começados com a letra "+letra+": ");
		for(String cliente: clientes){

			if(cliente.startsWith(letra)){

				System.out.println(cliente);
			}
		}
	}

	public static void ordenarSemStream(){
		Collections.sort(clientes);
		System.out.println("Clientes ordenados: "+ clientes);
	}

	public static void contarPrimeiraLetraSemStream(String letra){
		int nLetras = 0;
		for(String cliente: clientes){
			if(cliente.startsWith(letra)){
				nLetras++;
			}
		}
		System.out.println("Foram contados "+nLetras+" nomes começados pela letra "+letra);

	}
	public static void main(String[] args) {
		// Adicionando clientes
		clientes.add("José");
		clientes.add("Anderson");
		clientes.add("Antônio");
		clientes.add("Sampaio");
		
		ordenarSemStream();
		contarPrimeiraLetraSemStream("J");
		filtrarPorLetraSemStream("A");


	}
}
