package func;

public class Funcionario {
	//atributos
	protected String matricula;
	protected String nome;
	protected int horas;
	protected double valorHora;
	
	//construtores
	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	public Funcionario(String matricula, String nome, int horas, double valorHora) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.horas = horas;
		this.valorHora = valorHora;
	//encapsulamento
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	//metodo
	public double salario () {
		return (horas*valorHora);
		
	}	
}
