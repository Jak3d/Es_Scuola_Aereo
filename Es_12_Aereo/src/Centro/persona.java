package Centro;

public class persona {
	
	private int age;
	private String nome;
	private int peso;
	
	public persona (int età, int peso, String nome) {
		this.age=età;
		this.peso=peso;
		this.nome=nome;
		
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome; 
	}
	
	public void setPeso (int peso) {
		this.peso = peso;
	}
	
	public int getPeso () {
		return peso;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public int getAge () {
		return age;
	}

}
