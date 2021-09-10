package classe;

public class FuncionarioTarefa4 {//atrubutos
	private boolean vivo;
	private String nome;
	private int idade ;
	private char pronome;
	
	
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getPronome() {
		return pronome;
	}
	public void setPronome(char pronome) {
		this.pronome = pronome;
	}
	//construtor
	public FuncionarioTarefa4(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	//metodo
	public void informacoesDofuncionario() {	
		System.out.println(nome+" "+idade+" "+pronome);	
	}

}
