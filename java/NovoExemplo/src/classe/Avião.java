package classe;

public class Avi�o {//atrubutos
	private boolean ligado;
	private String marca;
	private int Anofabrica��o ;
	private double velocidade;
	
	
	
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnofabrica��o() {
		return Anofabrica��o;
	}
	public void setAnofabrica��o(int anofabrica��o) {
		Anofabrica��o = anofabrica��o;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	//construtor
	
	
	public Avi�o(boolean ligado, String marca, int anofabrica��o, double velocidade) {
		super();
		this.ligado = ligado;
		this.marca = marca;
		Anofabrica��o = anofabrica��o;
		this.velocidade = velocidade;
	}


	

	
	//metodo
	public void acelera��o() {	
		for (int x=0;x<100;x++) {
			velocidade++;
		}
	System.out.println("O Avi�o est� "+ligado);
	System.out.println("A carca do avi�o � " +marca);
	System.out.println("Ano de fabrica��o � " + Anofabrica��o);
	System.out.println("A velocidade do avi�o ap�s a acelera��o � "+velocidade+"KM/H");
	
	}
}
