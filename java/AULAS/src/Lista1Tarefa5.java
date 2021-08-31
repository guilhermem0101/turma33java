import java.util.Scanner;

public class Lista1Tarefa5 {
	public static void main (String[] args) {
		//Excercicio5 Média ponderada 
		//variaveis
		double nota1, nota2, nota3, m;
		System.out.println("Para calcular a média do aluno,\nescreva as três  notas. Escreva nota 1 ");	
		Scanner leia = new Scanner(System.in);
		nota1 = leia.nextDouble();
		System.out.println("Escreva nota 2 ");
		nota2 = leia.nextDouble();
		System.out.println("Escreva nota 3 ");
		nota3 = leia.nextDouble();
		//A media ponderada
		m= (nota1*2 + nota2*3 + nota3*5)/(2 + 3 + 5);
		System.out.println("A meida do aluno é: "+ m);
	}

}
