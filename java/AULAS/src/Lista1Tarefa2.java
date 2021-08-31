import java.util.Scanner;

public class Lista1Tarefa2 {
	public static void main (String[] args) {
		int dias,diasRestantenes,meses, anos;
		System.out.println("Entre com sua idade em dias: ");
		Scanner leia = new Scanner (System.in);
		dias = leia.nextInt();
				
		anos = dias/365;
		meses = (dias%365)/30;
		diasRestantenes = ((meses%365)%30);
		
		System.out.println("Os anos decorridos são " +anos+ ", "  + meses+ " meses e " +diasRestantenes+ " dias");
	}

}
