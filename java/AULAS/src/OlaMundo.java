import java.util.Scanner;

public class OlaMundo {
	public static void main(String[] args) {
		System.out.println("Olá mundo, turam33java");
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int anoAtual =2021;
		int anoNascimento;
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Digite seu ano de nascimento");
		anoNascimento = leia.nextInt();
		System.out.println("ola, "+nome+ " sua idade é "+ (anoAtual -anoNascimento));
	}

}
