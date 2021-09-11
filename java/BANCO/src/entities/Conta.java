package entities;

public class Conta {
// Atributos
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativo;
	
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	} 

	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void credito(double valor) {
		this.saldo += valor;
	}
	
	public void debito(double valor) {
		
		if (valor == 0) {
			System.out.println("Valor zerado. Por favor, verifique e tente novamente.");
		}
		else if(valor < 0) {
			System.out.println("Impossível realizar esta operação com valor negativo.\nPor favor, verifique e tente novamente.");
		}
		else if (valor > saldo) {
			System.out.println("Saldo insuficiente.");
		} 
		else {
			saldo -= valor;
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Conta numero=" + numero + ", cpf=" + cpf + ", saldo=" + saldo ;
	}

	

}
