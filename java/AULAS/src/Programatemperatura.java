import java.util.Scanner;

public class Programatemperatura {
	public static void main(String[] args) {
	
		int C, F;
		String nome;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu nome ");
		nome = leia.next();
		System.out.println("Digite a temperatura em °C ");
		C = leia.nextInt();
		F = (9*C)/5 +32; 
		System.out.println("Olá " +nome+ " a temperatura em °F é "+F);
		
	}
}
