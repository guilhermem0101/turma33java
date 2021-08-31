import java.util.Scanner;

public class Lista1tarefa3 {
	public static void main (String[] args) {
		int tempoSegundo,horas,minutos,segundos;
		System.out.println("Entre com o tempo do evento em segundos: ");
		Scanner leia = new Scanner (System.in);
		tempoSegundo = leia.nextInt();
		

		horas = tempoSegundo/3600;
		minutos = (tempoSegundo%3600)/60;
		segundos = ((tempoSegundo%3600)%60);
		
		System.out.println("O tempo decorrido é " +horas+ " horas, " +minutos+ " minutos e " +segundos+ " segundos.");
		
	}

}
