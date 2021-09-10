package app;

import entities.ContaCorrente;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente(14,"456",1000);
	//	ContaEmpresa
		
		
		
		cc1.credito(45);
		cc1.debito(5);
		
		System.out.println(cc1.toString());
		
		

	}

}
