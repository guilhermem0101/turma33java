package exemplo;

import java.util.Scanner;

public class ParouImpar {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		while (true) {
			int numero;
			System.out.println("Entre com um numero para saber se � par ou impar:");
			numero=leia.nextInt();
		
			if ((numero%2)==0 && numero!=0) {
			System.out.printf("%d � par\n",numero);
			}
			else if ((numero%2) !=0 && numero!=0) {
			System.out.printf("%d � impar\n",numero);
			}
			else {
			System.out.printf("%d � neutro\n",numero);
		
			}
		}	
	}
}
