package classe;

public class Avião {//atrubutos
	private boolean ligado;
	private String marca;
	private int Anofabricação ;
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
	public int getAnofabricação() {
		return Anofabricação;
	}
	public void setAnofabricação(int anofabricação) {
		Anofabricação = anofabricação;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	//construtor
	
	
	public Avião(boolean ligado, String marca, int anofabricação, double velocidade) {
		super();
		this.ligado = ligado;
		this.marca = marca;
		Anofabricação = anofabricação;
		this.velocidade = velocidade;
	}


	

	
	//metodo
	public void aceleração() {	
		for (int x=0;x<100;x++) {
			velocidade++;
		}
	System.out.println("O Avião está "+ligado);
	System.out.println("A carca do avião é " +marca);
	System.out.println("Ano de fabricação é " + Anofabricação);
	System.out.println("A velocidade do avião após a aceleração é "+velocidade+"KM/H");
	
	}
}
