package Lista2;

import java.util.Scanner;

public class Lista2Tarefa4 {
	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		
		int numero;
		double a,b;
		System.out.println("Entre com um numero para saber se � par ou impar:");
		numero=leia.nextInt();
		
		if ((numero%2)==0 && numero!=0) {
			a=Math.sqrt(numero);
			System.out.printf("%d � par e sua raiz quadrada � %.2f",numero,a);
		}
		else if ((numero%2) !=0 && numero!=0) {
			b=Math.pow(numero, 2);
			System.out.printf("%d � impar e sua potencia de 2 � %d",numero,b);
		}
		else {
			System.out.printf("%d � neutro\n",numero);
		
		}
	}
	
}
