package Lista3;

import java.util.Scanner;

public class Lista3Tarefa5 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int n,soma=0;
		do {
			System.out.println("Entre com o numero ");
			n=leia.nextInt();
			soma+=n;
			
		}while(n!=0);
		System.out.printf("A soma dos numeros digitado é %d",soma);
		
	}
}
