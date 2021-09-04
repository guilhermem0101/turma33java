package Lista4;

import java.util.Scanner;

public class Lista4Tarefa1 {

	public static void main(String[] args) {
	
			Scanner leia=new Scanner(System.in);
			int x=0,maiorNumero=0;
			int numeros[]=new int [5];
				for ( x=0;x<5;x++){
					System.out.println("Digite a nota: ");
					numeros[x]=leia.nextInt();
					
					
					if(numeros[x] > maiorNumero){
						maiorNumero = numeros[x];
					}
				}

				System.out.printf("A maior numero é: %d", maiorNumero);

	}

}
