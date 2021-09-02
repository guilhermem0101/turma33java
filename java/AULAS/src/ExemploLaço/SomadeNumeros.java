package ExemploLaço;

public class SomadeNumeros {
	public static void main (String[]args) {
		
		double soma=0.0;
		for (int n=3; n<=500;n+=3){
				if ((n%2)!=0){
					soma = soma+ n;
					System.out.println(n);
					}
				}System.out.printf("A soma dos multiplos de 3 impares é %.2f ",soma);
	}

}
