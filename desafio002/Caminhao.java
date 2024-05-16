package desafio002;

public class Caminhao extends Veiculo {
	
	private float cargaMax;
	
	public Caminhao (String marca, int ano, float cargaMax) {
		super (marca,ano);
		this.cargaMax = cargaMax;
	}
	
	public void setCargaMax(float cargaMax) {
		this.cargaMax = cargaMax;	
	}
	
	public float getCargaMax() {
		return cargaMax;
	}
	
	public void carregarCarga() {
		System.out.println("Carregando a carga...");
	}
	
	@Override
	public String toString() {
		return String.format("%s%s%s", getMarca(), getAno(), cargaMax);
	}

}
