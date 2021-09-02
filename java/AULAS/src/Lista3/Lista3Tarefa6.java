package Lista3;

import java.util.Scanner;

public class Lista3Tarefa6 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double	soma=0,media;
		int n, contador=0;
		do {
			
			System.out.println("Entre com o numero ");
			n=leia.nextInt();
			if(n%3==0 && n!=0) {
				soma+=n;
				contador++;
			}
		}while(n!=0);
		media=soma/contador;
		System.out.printf("A media dos numeros digitado é %.2f",media);

	}

}
