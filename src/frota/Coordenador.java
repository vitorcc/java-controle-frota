package frota;

public class Coordenador extends Funcionario {
	
	private String senha;
	
	public Coordenador(String nome, String cpf, int matricula) {
		super(nome, cpf, matricula);
		// TODO Auto-generated constructor stub
	}

	public void setCnh(String senha) {
		this.senha = senha;
	}
	
}
