package classes;

public class Produto {
	
	//atributo
	private String codigo;
	private String nome;
	private int estoque;
	private double valor;
	
	//construtor
	public Produto(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	//metodos
	public void tiraEstoque(int qtde) {
		if (qtde > estoque || qtde <=0) {
			System.out.println("Valor incorreto.");
		} 
		
		this.estoque -= qtde;
		
	}
		
	public void incluirEstoque(int qtde) {
		this.estoque += qtde;
	}
}