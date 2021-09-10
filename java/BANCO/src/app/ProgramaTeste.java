package app;

import entities.Conta;

public class ProgramaTeste {

	public static void main(String[] args) {
		Conta cli1 = new Conta(213,"456");
		
		cli1.credito(10.00);
		cli1.debito(0);
		System.out.print(cli1.getSaldo());
	}

}
