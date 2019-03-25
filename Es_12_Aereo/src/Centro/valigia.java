package Centro;

public class valigia {
	
	private String proprietario;
	public int pesoVal;
	
	public valigia(int pesoVal, String proprietario) {
		this.pesoVal = pesoVal;
		
	}
	
	public int getPeso() {
		return pesoVal;
	}
	
	public String getProp() {
		return proprietario;
	}
}
