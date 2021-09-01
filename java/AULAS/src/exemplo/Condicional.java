package exemplo;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		String nome;
		int anoNascimento, idade;
		System.out.println("Escreva seu nome: ");
		nome = leia.next();
		System.out.println("Entre com seu ano de nascimento");
		anoNascimento = leia.nextInt();
		idade= 2021 - anoNascimento;
		System.out.printf("Ola, %s, sua idade é %d",nome,idade);
		if (idade>18); {
			System.out.println("Maior de idade");
			
		}
		//else; {
			
		}
	}


