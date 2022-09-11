package frota;

public class CalculadorDeMultas {
	
	private double valorMultas;
	
	
	public double calcularMultas(Infracoes infracoes) {		
		return this.valorMultas += infracoes.getTotalInfracoes();		
	}

}
