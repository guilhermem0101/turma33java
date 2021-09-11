package classes;

import java.util.ArrayList;
import java.util.List;

public class Loja {

	
		public static void main(String[] args) {
			
			List<String> nomes = new ArrayList<>();
			
			List <Produto> lista = new ArrayList<>();
			
			lista.add(new Produto("001","Caderno"));
			lista.add(new Produto("002","Lápis"));
			lista.add(new Produto("003","Folhas"));
			
			
			
			
			
			
			for (Produto item : lista) {
				System.out.println(item.getNome());
			}

	}

}
