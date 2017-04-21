package exercicio3;

import com.senac.SimpleJava.Console;

public class App {
	public void run(){
		Pessoa pessoa;
		
			String nome = Console.readString("Digite seu nome:");
			String dataNascimento = Console.readString("Digite sua data de nascimento(Formato AAAA-MM-DD):");
			
			pessoa = new Pessoa(nome,dataNascimento);
			
			Console.println("Seu nome:",pessoa.getNome());
			pessoa.obterIdade();
		
	}

}
