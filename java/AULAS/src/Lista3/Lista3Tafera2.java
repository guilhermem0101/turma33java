package Lista3;

import java.util.Scanner;

public class Lista3Tafera2 {

	public static void main(String[] args) {
		int contadorPar=0,contadorImpar=0,n;
		Scanner leia = new Scanner(System.in);
		for (int x=0;x<10;x++) {
			System.out.println("Entre com o numero ");
			n=leia.nextInt();
			if (n%2==0 && n!=0) {
				contadorPar++;
			}
			else{
				contadorImpar++;	
			}
		}System.out.printf("O nemero de vezes que foram digitado numeros pares é %d "
				+ "e numeros impares é %d",contadorPar,contadorImpar);

	}

}
