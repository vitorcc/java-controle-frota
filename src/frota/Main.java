package frota;

public class Main {

	public static void main(String[] args) {
		
		Motorista radja = new Motorista("Radja", "999.999.999-99", 444-5, "Cnh: 45845");
		Motorista jose = new Motorista("José da Van", "888.888.888-99", 123-5, "Cnh: 12345");
				
		CalculadorDeMultas calculaMultas = new CalculadorDeMultas();
		
		radja.setValorInfracao(299.1);
		jose.setValorInfracao(1200.0);
		
		System.out.println(calculaMultas.calcularMultas(jose));
		System.out.println(calculaMultas.calcularMultas(radja));
		
	

	}

}
