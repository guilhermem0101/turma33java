package ExemploLa�o;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double n = 0.0, soma = 0.0, media, total = 0.0;
		while (n >= 0) {

			System.out.println("Entre com um numero positivo, caso o numero seja negativo, programa ir� interromper ");
			n = leia.nextDouble();
			if (n >= 0) {
				soma = soma + n;
				total++;
			}
		}
		media = soma / total;
		System.out.printf(
				"Voc� entrou com um numero negativo, a somat�ria total � %.2f\n A m�dia � %.2f\n e o n�mero de entradas foi %.0f",
				soma, media, total);

	}

}
