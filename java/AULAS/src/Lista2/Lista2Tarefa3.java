package Lista2;

import java.util.Scanner;

public class Lista2Tarefa3 {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		int idade;
		System.out.println("Entre com sua idade para saber sua categoria: ");
		idade = leia.nextInt();
		
		if (idade>=10 && idade<15) {
			System.out.printf("Sua categoria � infantil, sua idade � %d", idade);
		}
		
		else if (idade>=15 && idade<18) {
			System.out.printf("Sua categoria � juvenil, sua idade � %d", idade);
		}	
		
		else if (idade>=18 && idade<26) {
			System.out.printf("Sua categoria � adulto, sua idade � %d", idade);
		}
		
		else {
			System.out.println("Entrada invalida");
		}
	}
}
