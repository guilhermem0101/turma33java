import java.util.Scanner;

public class Lista1Tarefa7 {
	public static void main(String[] args) {
		double a, b, c, d, e, f, x, y;
		System.out.println("Para resolver o sistema de equações lineare,\nentre com os valores dos coeficientes. Diga a ");
		Scanner leia = new Scanner(System.in);
		a = leia.nextDouble();
		System.out.println("Diga b ");
		b = leia.nextDouble();
		System.out.println("Diga c ");	
		c = leia.nextDouble();
		System.out.println("Diga d ");	
		d = leia.nextDouble();
		System.out.println("Diga e ");
		e = leia.nextDouble();
		System.out.println("Diga f ");
		f = leia.nextDouble();
		
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d); 
		
		//Observação: Para a operação ser realizada, (aE-bd) deve ser != 0
		
		System.out.println("O resultado de x é "+ x +" e de y é "+ y);		
		
	}
}
