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
	LocalDate dtNascimento = LocalDate.parse(getDataNascimento());
	if(dtNascimento.getMonthValue()== 1 && dtNascimento.getDayOfMonth() >= 18 && dtNascimento.getDayOfMonth() <= 31 || dtNascimento.getMonthValue() == 2 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 28){
		Console.println("Seu Signo é de Aquario.");
	}
	if(dtNascimento.getMonthValue()== 2 && dtNascimento.getDayOfMonth() >= 19 && dtNascimento.getDayOfMonth() <= 28 || dtNascimento.getMonthValue() == 3 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 20){
		Console.println("Seu Signo é de Peixes.");
	}
	if(dtNascimento.getMonthValue()== 3 && dtNascimento.getDayOfMonth() >= 20 && dtNascimento.getDayOfMonth() <= 31 || dtNascimento.getMonthValue() == 4 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 19){
		Console.println("Seu Signo é de Aries.");
	}
	if(dtNascimento.getMonthValue()== 4 && dtNascimento.getDayOfMonth() >= 20 && dtNascimento.getDayOfMonth() <= 30 || dtNascimento.getMonthValue() == 5 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 20){
		Console.println("Seu Signo é de Touro.");
	}
	if(dtNascimento.getMonthValue()== 5 && dtNascimento.getDayOfMonth() >= 21 && dtNascimento.getDayOfMonth() <= 31 || dtNascimento.getMonthValue() == 6 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 20){
		Console.println("Seu Signo é de Gêmeos.");
	}
	if(dtNascimento.getMonthValue()== 6 && dtNascimento.getDayOfMonth() >= 21 && dtNascimento.getDayOfMonth() <= 30 || dtNascimento.getMonthValue() == 7 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 22){
		Console.println("Seu Signo é de Cancer.");
	}
	if(dtNascimento.getMonthValue()== 7 && dtNascimento.getDayOfMonth() >= 23 && dtNascimento.getDayOfMonth() <= 31 || dtNascimento.getMonthValue() == 8 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 22){
		Console.println("Seu Signo é de Leão.");
	}
	if(dtNascimento.getMonthValue()== 8 && dtNascimento.getDayOfMonth() >= 23 && dtNascimento.getDayOfMonth() <= 30 || dtNascimento.getMonthValue() == 9 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 22){
		Console.println("Seu Signo é de Virgem.");
	}
	if(dtNascimento.getMonthValue()== 9 && dtNascimento.getDayOfMonth() >= 23 && dtNascimento.getDayOfMonth() <= 31 || dtNascimento.getMonthValue() == 10 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 22){
		Console.println("Seu Signo é de Libra.");
	}
	if(dtNascimento.getMonthValue()== 10 && dtNascimento.getDayOfMonth() >= 22 && dtNascimento.getDayOfMonth() <= 30 || dtNascimento.getMonthValue() == 11 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 21){
		Console.println("Seu Signo é de Escorpião.");
	}
	if(dtNascimento.getMonthValue()== 11 && dtNascimento.getDayOfMonth() >= 22 && dtNascimento.getDayOfMonth() <= 31 || dtNascimento.getMonthValue() == 12 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 21){
		Console.println("Seu Signo é de Sagitário.");
	}
	if(dtNascimento.getMonthValue()== 12 && dtNascimento.getDayOfMonth() >= 22 && dtNascimento.getDayOfMonth() <= 30 || dtNascimento.getMonthValue() == 1 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 19){
		Console.println("Seu Signo é de Capricórnio.");
	}
	
	
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
