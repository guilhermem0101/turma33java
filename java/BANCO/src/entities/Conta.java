package entities;

public abstract class Conta {
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativo;
	//construtor
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		
	}
	//encapsulamento
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
	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	//metodos
	public void credito(double valor) {
		this.saldo = saldo + valor;
		
	}
	
	public void debito(double valor) {
		
		if (valor <=0) {
			System.out.println("Valor incorreto");
		}
		else if (valor>saldo) {
			System.out.println("Valor incorreto");
		}
		else {
			this.saldo = saldo - valor;
		}
		
		
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", cpf=" + cpf + ", saldo=" + saldo + "]";
	}
}
