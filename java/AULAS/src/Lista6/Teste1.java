package Lista6;

import classes.Cachorro;
import classes.Cavalo;
import classes.Preguica;

public class Teste1 {

	public static void main(String[] args) {
		Cachorro cao1 = new Cachorro("Max", 6);
		Cavalo cav1 =new Cavalo("Alasão",14);
		Preguica preg1=new Preguica("Lerda",9);
		
		
		System.out.println(cav1.toString());
		cav1.correr();
		cav1.emitirSom();
		
		System.out.println(cao1.toString());
		cao1.emitirSom();
		
		System.out.println(preg1.toString());
		preg1.subirArvore();
		preg1.emitirSom();			
	}
}
