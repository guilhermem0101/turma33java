package Lista2;

import java.util.Scanner;

public class Lista2Tarefa2 {
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
			if (b>c) {
				System.out.printf("A sequancia de numeros crescnetes � %d, %d e %d",c,b,a);	
			}
			else {
				System.out.printf("A sequancia de numeros crescnetes � %d, %d e %d",b,c,a);
			}
		}
		else if ((b>a) && (b>c)) {
			if (a>c) {
				System.out.printf("A sequancia de numeros crescnetes � %d, %d e %d",c,a,b);
			}
			else {
				System.out.printf("A sequancia de numeros crescnetes � %d, %d e %d",a,c,b);
			}
		}
		else if ((c>a) && (c>b)) {
			if (b>a) {
				System.out.printf("A sequancia de numeros crescnetes � %d, %d e %d",a,b,c);
			}
			else {
				System.out.printf("A sequancia de numeros crescnetes � %d, %d e %d",b,a,c);
			}
		}
	}
}
