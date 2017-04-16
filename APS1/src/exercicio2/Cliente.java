package exercicio2;

public class Cliente {
	

	private String cpf;
	private String nome;
	private ContaBancaria conta;
	
	public Cliente(String cpf, String nome,ContaBancaria conta) {
		
		this.cpf = cpf;
		this.nome = nome;
		this.conta = conta;
		
	}
	
	
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public ContaBancaria getConta() {
		return conta;
	}
	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	
	
	
	

}
