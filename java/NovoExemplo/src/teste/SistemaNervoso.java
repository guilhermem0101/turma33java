package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classe.Sintese;


public class SistemaNervoso {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int resposta, conexoes,contador=0;
		
		List<Sintese> sistemaNervoso= new ArrayList<>();
		sistemaNervoso.add(new Sintese("neuronio1",3,1,false));
		sistemaNervoso.add(new Sintese("neuronio2",3,1,false));
		sistemaNervoso.add(new Sintese("neuronio3",3,1,false));
		sistemaNervoso.add(new Sintese("neuronio3",3,1,false));
		for (Sintese n : sistemaNervoso) {
			System.out.println(n.getNeuronio() + " " + "possui " +n.getDentritos() + " conexões.");
		}
		System.out.println("Podes despolarizar um ou dois neuronios, caso despolarize dois, o sistema nervoso inteiro será dexcitado. Quantos neuronios deseja despolarizar?");
		resposta = leia.nextInt();
		while(resposta != 1 && resposta !=2) {
			System.out.println("Resposta errada, digite novamente 1 ou 2 ");
			resposta = leia.nextInt();
		}
		
		sistemaNervoso.set(0, )
		for (Sintese x :sistemaNervoso ) {
			if (x.isDespolarizado()) {
				contador++;
			}
				
		}
		if (contador>=2) {
			System.out.println("o sistema todo foi excitado.");
		}
		

	}

}
