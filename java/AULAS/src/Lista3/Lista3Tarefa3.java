package Lista3;

import java.util.Scanner;

public class Lista3Tarefa3 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int idade=0,contadorMenor=0,contadorMaior=0;
		while(idade!=-99) {
			System.out.println("Entre com a idade da pessoa. ");
			idade=leia.nextInt();
			if(idade<21 && idade>0) {
				contadorMenor++;
			}else if(idade>50) {
				contadorMaior++;
			}else if (idade<=0 && idade!=-99) {
				System.out.println("Idade incorreta, tente novamente");
			}
		}System.out.printf("O total de pessoas menores que 21 anos é %d. E o"
				+ "total de pessoas com maid de 50 anos é %d",contadorMenor,contadorMaior);
		
	}

}
