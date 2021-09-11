package entities;

public class ContaEmpresa extends Conta {

	// atributos
	private double emprestimoEmpresa;

	// contrutor
	public ContaEmpresa(int numero, String cpf, double emprestimoEmpresa) {
		super(numero, cpf);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	// encapsulamento
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	// metodos
	public void pedirEmprestimo(double emprestimo) {
		if (emprestimo > emprestimoEmpresa) {
			System.out.println("Valor solicitado é maior que o valor aprovado para empréstimo.");

		} else {
			super.credito(emprestimo);
			this.emprestimoEmpresa -= emprestimo;
			System.out.println("Saldo atual emprestimo R$ " + this.emprestimoEmpresa);
			System.out.println("Emprestimo realizado com sucesso.\nSaldo atualizado: R$ " + super.getSaldo());

		}
	}
}