package desafio002;

public class Veiculo {
	
	private String marca;
	private int ano;
	
	public Veiculo(String marca,int ano) {
		this.marca = marca;
		this.ano = ano;
		}
	
	public String getMarca() {
		return marca;
	}
	
	public int getAno() {
		return ano;
	}
			
	public void acelerar() {
		System.out.println("Veículo acelerando...");
	}
	
	public String toString() {
		return String.format("%s%s", marca,ano);
	}
	
	
}
