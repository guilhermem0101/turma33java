import java.util.Scanner;
import java.math.*;
public class Lista1Tarefa4 {
	public static void main (String[] args) {
		double A,B,C,D,S,R;
		System.out.println("Entre com numeros reais A, B, C, tal que satisfação a equação: D = ((A+B)^2 + (B+C)^2)/2");
		System.out.println("Entre com o numero A ");
		Scanner leia = new Scanner (System.in);
		A = leia.nextInt();
		System.out.println("Entre com o numero B ");
		B = leia.nextInt();
		System.out.println("Entre com o numero C ");
		C = leia.nextInt();
		D= 0.0;
		//Resolução do problema
		S= Math.pow((A+B), 2);
		R= Math.pow((B+C),2.0);
		D = ((S) + (R))/2;
		System.out.println("o resulatado de D é: " + D);
	}
}


