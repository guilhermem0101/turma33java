package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		int x;
		String nome;
		Scanner leia=new Scanner(System.in);
		List<String> times = new ArrayList<>();
		
		/*times.add("SPFC");
		times.add("Cotintians");
		times.add("Santos");
		times.add("Palmeiras");
		times.add(2, "Ponte");
		nome = leia.next();
		x = times.indexOf(nome);*/
		//System.out.println(times.get(2));
		System.out.println();
		for (String item : times) {
			System.out.println(item);
		}
		
	}

}
