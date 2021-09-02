package ExemploLaço;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double n = 0.0, soma = 0.0, media, total = 0.0;
		while (n >= 0) {

			System.out.println("Entre com um numero positivo, caso o numero seja negativo, programa irá interromper ");
			n = leia.nextDouble();
			if (n >= 0) {
				soma = soma + n;
				total++;
			}
		}
		media = soma / total;
		System.out.printf(
				"Você entrou com um numero negativo, a somatória total é %.2f\n A média é %.2f\n e o número de entradas foi %.0f",
				soma, media, total);

	}

}
