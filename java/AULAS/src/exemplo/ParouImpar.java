package exemplo;

import java.util.Scanner;

public class ParouImpar {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		while (true) {
			int numero;
			System.out.println("Entre com um numero para saber se é par ou impar:");
			numero=leia.nextInt();
		
			if ((numero%2)==0 && numero!=0) {
			System.out.printf("%d é par\n",numero);
			}
			else if ((numero%2) !=0 && numero!=0) {
			System.out.printf("%d é impar\n",numero);
			}
			else {
			System.out.printf("%d é neutro\n",numero);
		
			}
		}	
	}
}
