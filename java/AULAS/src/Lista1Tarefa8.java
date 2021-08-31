import java.util.Scanner;

public class Lista1Tarefa8 {
	public static void main (String[] args) {
		double valorCarro, custoFabricacao;  
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva o custo de frabricação do carro "); 
		custoFabricacao = leia.nextDouble();
		
		valorCarro = custoFabricacao*(1+0.45+0.28);

		System.out.println("valor do carro é "+ valorCarro);
	}

}
