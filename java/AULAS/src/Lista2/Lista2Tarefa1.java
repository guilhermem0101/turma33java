package Lista2;

import java.util.Scanner;

public class Lista2Tarefa1 {
	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		int a,b,c;
		System.out.println("Entre com um numero: ");
		a = leia.nextInt();
		System.out.println("Entre com outro numero: ");
		b = leia.nextInt();
		System.out.println("Entre com mais um numero: ");
		c = leia.nextInt();
		if ((a>b) && (a>c)) {
			System.out.printf("%d é o maior numero",a);
						
		}
		else if ((b>a) && (b>c)) {
			System.out.printf("%d é o maior numero",b);
		}
		else if ((c>a) && (c>b)) {
			System.out.printf("%d é o maior numero",c);
		}
	}

}
