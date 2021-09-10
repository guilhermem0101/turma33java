package teste;

import classe.Lista5Tarefa1;

public class Cliente {
	public static void main (String[]args) {
		Lista5Tarefa1 cliente1 = new Lista5Tarefa1("Guilherme",24);
		Lista5Tarefa1 cliente2 = new Lista5Tarefa1("Silvio",23);
		
		cliente1.informacoesDoCliente();
		cliente2.informacoesDoCliente();		
	}
}
