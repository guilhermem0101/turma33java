package func;

public class Terceiro extends Funcionario{
	private int adicional;
	
	public Terceiro(String matricula, String nome) {
		super(matricula, nome);	
	}	
	public int getAdicional() {
		return adicional;
	}
	public void setAdicional(int adicional) {
		this.adicional = adicional;
	}
	
	public Terceiro(String matricula, String nome, int horas, double valorHora, int adicional) {
		super(matricula, nome, horas, valorHora);
		this.adicional = adicional;
	}
	@Override
	public double salario () {
		return ((horas*valorHora)+adicional);	
	}
}
