package exemploVetorMatriz;

import java.util.Random;

public class matriz {
	public static void main(String[] args) {
		Random gerador = new Random();
		int matriz[][]= new int [3][3];
		int soma=0,somaDiagonal=0;
		for (int x=0; x<3;x++) {
			System.out.println();
			for (int y=0; y<3;y++) {
				matriz[x][y] = gerador.nextInt(10);
				System.out.print(matriz[x][y]+"\t");
				soma= soma + matriz[x][y];
				if (x==y) {
					somaDiagonal= somaDiagonal +matriz[x][y];
					
				}
			}
		} System.out.printf("Os a soma dos valores da matriz é %d e da diagonal é %d",soma,somaDiagonal);
		
	}
}
