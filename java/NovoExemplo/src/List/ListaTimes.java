package List;

import java.util.ArrayList;
import java.util.List;

import ExemploList.Time;

public class ListaTimes {

	public static void main(String[] args) {
		List<Time> listaTime = new ArrayList<>();
		listaTime.add(new Time("SPFC",2));
		listaTime.add(new Time("Santos",2));
		listaTime.add(new Time("Palmeiras",3));
		
		//listaTime.get(0).ganhaPontos('g');
		
		
		
		for (Time equipe : listaTime) {
			System.out.println(equipe.getNome()+ " "+equipe.getPontos());
		}
		/*for (Time equipe : listaTime) {
			if (equipe.getNome().equals());
		}*/

	}

}
