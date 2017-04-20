package exercicio3;

import java.time.LocalDate;

/*3) Crie uma classe que representa uma Pessoa,
 *  esta classe deve implementar os atributos Data de Nascimento, Idade e Signo.
 *   Você deve utilizar a classe LocalDate (disponível a partir do Java  8, no pacote java.time).
 */

public class Pessoa{

private String nome;
private LocalDate dataNascimento;

public Pessoa(String nome, LocalDate dataNascimento) {
	
	this.nome = nome;
	this.dataNascimento = dataNascimento;

	
}

public void obterSigno(){
	
}

public void obterIdade(){
	getDataNascimento();
	/* ler sobre a Local date now.
	 * LocalDate now = new LocalDate();
	Years age = Years.yearsBetween(birthdate, now);*/
}

public String getNome() {
	return nome;
}



public LocalDate getDataNascimento() {
	return dataNascimento;
}








}
