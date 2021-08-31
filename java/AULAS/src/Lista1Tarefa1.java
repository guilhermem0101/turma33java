import java.util.Scanner;

public class Lista1Tarefa1 {
	public static void main(String[] args){
		int anos, dias;
		
		System.out.println("Entre com a idade em anos: ");
		Scanner leia = new Scanner(System.in);
		anos = leia.nextInt();		

		dias = (anos*365);
		System.out.println("A sua idade em dias é "+ dias);
	}

}
