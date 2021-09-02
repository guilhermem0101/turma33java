package Lista3;

import java.util.Scanner;

public class Lista3Tarefa4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, nPessoas = 1, nCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0;
		String sexo, temperamento;
		int sexo1, temperamento1, nNervosas = 0,outrosCalmos=0, nNervosas40=0, nCalmas18=0;
		
		
		while (nPessoas <= 150) {
			nPessoas++;
			System.out.println("Entre com sua idade");
			idade = leia.nextInt();

			System.out.println("Entre com seu sexo. 1 para feminino, 2 para masculino e 3 para outros");
			sexo1 = leia.nextInt();
			while (sexo1 != 1 && sexo1 != 2 && sexo1 != 3) {
				System.out.println("Opção invalidada");
				System.out.println("Entre com seu sexo. 1 para feminino, 2 para masculino e 3 para outros");
				sexo1 = leia.nextInt();
			}

			if (sexo1 == 1) {
				sexo = "Feminino";
				System.out.println("Entre com seu temperamento. 1 para calme, 2 para nervose e 3 para agressive");
				temperamento1 = leia.nextInt();
				while (temperamento1 != 1 && temperamento1 != 2 && temperamento1 != 3) {
					System.out.println("Opção invalidada");
					System.out.println("Entre com seu temperamento. 1 para calme, 2 para nervose e 3 para agressive");
					temperamento1 = leia.nextInt();
				}

				if (temperamento1 == 1) {
					temperamento = "calma";
					nCalmas++;
					if (idade<18) {
						nCalmas18++;
					}
				} else if (temperamento1 == 2) {
					temperamento = "nervosa";
					mulheresNervosas++;
					nNervosas++;
					if (idade>40) {
						nNervosas40++;
					}
				} else if (temperamento1 == 3) {
					temperamento = "agressiva";
				}

			} else if (sexo1 == 2) {
				sexo = "Masculino";
				System.out.println("Entre com seu temperamento. 1 para calme, 2 para nervose e 3 para agressive");
				temperamento1 = leia.nextInt();
				while (temperamento1 != 1 && temperamento1 != 2 && temperamento1 != 3) {
					System.out.println("Opção invalidada");
					System.out.println("Entre com seu temperamento. 1 para calme, 2 para nervose e 3 para agressive");
					temperamento1 = leia.nextInt();
				}

				if (temperamento1 == 1) {
					temperamento = "calmo";
					nCalmas++;
					if (idade<18) {
						nCalmas18++;
					}
				} else if (temperamento1 == 2) {
					temperamento = "nervoso";
					nNervosas++;
					if (idade>40) {
						nNervosas40++;
					}

				} else if (temperamento1 == 3) {
					temperamento = "agressivo";
					homensAgressivos++;
					
				}

			} else if (sexo1 == 3) {
				sexo = "Outro";
				System.out.println("Entre com seu temperamento. 1 para calme, 2 para nervose e 3 para agressive");
				temperamento1 = leia.nextInt();
				while (temperamento1 != 1 && temperamento1 != 2 && temperamento1 != 3) {
					System.out.println("Opção invalidada");
					System.out.println("Entre com seu temperamento. 1 para calme, 2 para nervose e 3 para agressive");
					temperamento1 = leia.nextInt();
				}

				if (temperamento1 == 1) {
					temperamento = "calmo";
					nCalmas++;
					outrosCalmos++;
					if (idade<18) {
						nCalmas18++;
					}
				} else if (temperamento1 == 2) {
					temperamento = "nervoso";
					nNervosas++;
					if (idade>40) {
						nNervosas40++;
					}
				} else if (temperamento1 == 3) {
					temperamento = "agressivo";

				}

			}

		}System.out.println("Numero de pessoas calmas "+nCalmas);
		System.out.println("Numero de mulheres nervosas "+mulheresNervosas);
		System.out.println("Numero de homens agressivos "+homensAgressivos);
		System.out.println("Numero de outros calmos "+ outrosCalmos);
		System.out.println("Numero de pessoas nervosas com mais de 40 anos "+nNervosas40);
		System.out.println("Numero de pessoas calmas com menos de 18 "+nCalmas18);
	}

}
