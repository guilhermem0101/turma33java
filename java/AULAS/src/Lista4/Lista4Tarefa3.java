package Lista4;

import java.util.Random;

public class Lista4Tarefa3 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int c, l, n1[][]=new int [4][6] ,n2[][]=new int [4][6], n3[][]=new int [4][6],n4[][]=new int [4][6], x=0;
				for (l=0;l<4;l++){
					for(c=0;c<6;c++){
						n1[l][c] = gerador.nextInt(10);
						n2[l][c] = gerador.nextInt(10);
						n3[l][c] = n1[l][c] + n2[l][c];
						n4[l][c] = n1[l][c] - n2[l][c];							
					}				
				}System.out.print("\n\nA matriz N1 é \n");
				for (l=0;l<4;l++){					
					System.out.print("\n");
					for(c=0;c<6;c++){
						System.out.print(n1[l][c]+ "\t");					
					}
				}
				System.out.print("\n\nA matriz N2 é \n");
				for (l=0;l<4;l++){
					System.out.print("\n");
					for(c=0;c<6;c++){
						System.out.print(n2[l][c]+ "\t");
					}					
				}
				System.out.print("\n\nA matriz N3=N1+N2 é \n");
				for (l=0;l<4;l++){
					System.out.print("\n");
					for(c=0;c<6;c++){
						System.out.print(n3[l][c]+ "\t");
					}			
				}
				System.out.print("\n\nA matriz N4=N1-N2 é \n");
				for (l=0;l<4;l++){System.out.print("\n");
					for(c=0;c<6;c++){
					System.out.print(n4[l][c]+ "\t");
					}	
				}				

	}

}
