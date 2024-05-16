package desafio002;

public class Main {

	public static void main(String[] args) {
		Carro veiculo1 = new Carro("Ford", 2022, 4);
		
		veiculo1.acelerar();
		veiculo1.ligarRadio();
		
		System.out.printf("Carro: %s\nAno: %s\nNúmero de portas: %s ", veiculo1.getMarca(), veiculo1.getAno(),veiculo1.getNumeroPortas());
		
		Caminhao veiculo2 = new Caminhao("Volvo", 2000, (float) 1550.3);
		
		System.out.println("\n"); // pra pular linha
		
		veiculo2.carregarCarga();
		veiculo2.acelerar();
		
		System.out.printf("Caminhão: %s\nAno: %s\nCarga maxima: %s", veiculo2.getMarca(), veiculo2.getAno(), veiculo2.getCargaMax());
		
		Carro veiculo3 = new Carro("Landrover", 2020, 4);
		
		System.out.println("\n");
		System.out.printf("Carro de painho: %s %s\n", veiculo3.getMarca(), veiculo3.getAno());
		
	}

}


// 