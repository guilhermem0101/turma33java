package ExemploList;

public class Time {
	private String nome;
	private int pontos;
	
	

	public Time(String nome, int pontos) {
		super();
		this.nome = nome;
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public void ganhaPontos(char resultado) {
		if(resultado =='g') {
			this.pontos +=3;
		}
		else if(resultado=='e') {
			this.pontos++;
		}
		else {
		}
	}
	
	
}
