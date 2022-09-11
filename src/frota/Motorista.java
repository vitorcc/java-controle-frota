package frota;

public class Motorista extends Funcionario implements Infracoes{
	
	private String cnh;
	private double valorInfracao;
	
	public Motorista(String nome, String cpf, int matricula) {
		super(nome, cpf, matricula);
	}
	
	public Motorista(String nome, String cpf, int matricula, String cnh) {		
		super(nome, cpf, matricula);
		this.cnh = cnh;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	public void setValorInfracao(double valor) {
		this.valorInfracao = valor;
	}

	@Override
	public double getTotalInfracoes() {
		System.out.println("Calculando multas de: " + super.getNome());
		return this.valorInfracao;
	}
}
