package classe;

public class Sintese {
	private String neuronio;
	//private String neurotransmissor;
	private int dentritos;
	private int axonio=1;
	private boolean despolarizado;
	public Sintese(String neuronio, int dentritos, int axonio, boolean despolarizado) {
		super();
		this.neuronio = neuronio;
		this.dentritos = dentritos;
		this.axonio = axonio;
		this.despolarizado = despolarizado;
	}
	public String getNeuronio() {
		return neuronio;
	}
	public void setNeuronio(String neuronio) {
		this.neuronio = neuronio;
	}
	public int getDentritos() {
		return dentritos;
	}
	public void setDentritos(int dentritos) {
		this.dentritos = dentritos;
	}
	public int getAxonio() {
		return axonio;
	}
	public void setAxonio(int axonio) {
		this.axonio = axonio;
	}
	public boolean isDespolarizado() {
		return despolarizado;
	}
	public void setDespolarizado(boolean polarizado) {
		this.despolarizado = polarizado;
	}
	
	public void despolarização (int conexao) {
		
			this.despolarizado = true;
		
	}
	@Override
	public String toString() {
		return "Sintese [neuronio=" + neuronio + ", dentritos=" + dentritos + ", axonio=" + axonio + ", polarizado="
				+ despolarizado + "]";
	}
	
	
}
