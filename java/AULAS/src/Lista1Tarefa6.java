import java.util.Scanner;
import java.math.*;
public class Lista1Tarefa6 {
	public static void main (String[] args) {
		double x1, x2, y1, y2, x, y, d, a;
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com x1 ");
		x1 = leia.nextDouble();
		System.out.println("Entre com x2 ");
		x2 = leia.nextDouble();
		System.out.println("Entre com y1 ");
		y1=leia.nextDouble();
		System.out.println("Entre com y2 ");
		y2= leia.nextDouble();
		x = Math.pow(x2-x1, 2.00); 
		y = Math.pow(y2-y1, 2.00);
		a=x+y;
		d = Math.sqrt(a);
		
		System.out.println("A Distancia dos pontos cartesianos é "+ d);
	}

}
