package desafio002;

public class Carro extends Veiculo {
	
	private int numeroPortas;
	
	public Carro(String marca, int ano, int numeroPortas) {
		super(marca,ano);
		this.numeroPortas = numeroPortas;
	}
	
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	
	public int getNumeroPortas() {
		return numeroPortas;
	}
	
	public void ligarRadio() {
		System.out.println("Rádio ligado no carro.");
	}
	
	@Override
	public String toString() {
		return String.format("%s%s%s", getMarca(),getAno(),numeroPortas);
	}
	

}
