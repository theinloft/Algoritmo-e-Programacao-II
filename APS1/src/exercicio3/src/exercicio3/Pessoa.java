package exercicio3;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import com.senac.SimpleJava.*;

/*3) Crie uma classe que representa uma Pessoa,
 *  esta classe deve implementar os atributos Data de Nascimento, Idade e Signo.
 *   Você deve utilizar a classe LocalDate (disponível a partir do Java  8, no pacote java.time).
 */

public class Pessoa{

private String nome;
private String dataNascimento;

public Pessoa(String nome, String dataNascimento) {
	
	this.nome = nome;
	this.dataNascimento = dataNascimento;

	
}

public void obterSigno(){
	
}

public void obterIdade(){
	LocalDate dtNascimento = LocalDate.parse(getDataNascimento());
	
	 LocalDate agora = LocalDate.now();
	long idade = ChronoUnit.YEARS.between(dtNascimento, agora);
	
	Console.println("A sua idade é: ", idade," Anos.");
	
	
}

public String getNome() {
	return nome;
}



public String getDataNascimento() {
	return dataNascimento;
}








}
