import java.util.Scanner;

public class areadotriangulo {
	public static void main (String[]args) {
		Scanner leia = new Scanner (System.in);
		double base, altura,area=0.0;
		
		double base1,altura1,area1=0;
		System.out.print("entre com a base do triangulo ");
		base = leia.nextDouble();
		while(base<=0.0) {
			System.out.print("Valor incorreto, digite novamente ");
			base = leia.nextDouble();
		}
		System.out.print("entre com a altura do triangulo ");
		altura = leia.nextDouble();
		while(altura<=0.0) {
			System.out.print("Valor incorreto, digite novamente ");
			altura = leia.nextDouble();
		}
		area =(base*altura)/2;
		System.out.printf("a area do triangulo é %.1f",area);
		
		
		
		
		System.out.print("entre com a base do triangulo 2 ");
		base1 = leia.nextDouble();
		while(base<=0.0) {
			System.out.print("Valor incorreto, digite novamente ");
			base1 = leia.nextDouble();
		}
		System.out.print("entre com a altura do triangulo 2 ");
		altura1 = leia.nextDouble();
		while(altura<=0.0) {
			System.out.print("Valor incorreto, digite novamente ");
			altura1 = leia.nextDouble();
		}
		area =(base1*altura1)/2;
		System.out.printf("a area do triangulo 2 é %.1f",area1);
		
		if (area>area1) {
			System.out.printf("A area do triangulo 1 é maior que a do triangulo 2");
		}
		else {
			System.out.printf("A area do triangulo 2 é maior que a do triangulo 1");
		}
	}

}
