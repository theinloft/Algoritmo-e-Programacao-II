package exercicio3;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import com.senac.SimpleJava.*;

/*3) Crie uma classe que representa uma Pessoa,
 *  esta classe deve implementar os atributos Data de Nascimento, Idade e Signo.
 *   Voc� deve utilizar a classe LocalDate (dispon�vel a partir do Java  8, no pacote java.time).
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
		Console.println("Seu Signo � de Aquario.");
	}
	if(dtNascimento.getMonthValue()== 2 && dtNascimento.getDayOfMonth() >= 19 && dtNascimento.getDayOfMonth() <= 28 || dtNascimento.getMonthValue() == 3 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 20){
		Console.println("Seu Signo � de Peixes.");
	}
	if(dtNascimento.getMonthValue()== 3 && dtNascimento.getDayOfMonth() >= 20 && dtNascimento.getDayOfMonth() <= 31 || dtNascimento.getMonthValue() == 4 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 19){
		Console.println("Seu Signo � de Aries.");
	}
	if(dtNascimento.getMonthValue()== 4 && dtNascimento.getDayOfMonth() >= 20 && dtNascimento.getDayOfMonth() <= 30 || dtNascimento.getMonthValue() == 5 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 20){
		Console.println("Seu Signo � de Touro.");
	}
	if(dtNascimento.getMonthValue()== 5 && dtNascimento.getDayOfMonth() >= 21 && dtNascimento.getDayOfMonth() <= 31 || dtNascimento.getMonthValue() == 6 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 20){
		Console.println("Seu Signo � de G�meos.");
	}
	if(dtNascimento.getMonthValue()== 6 && dtNascimento.getDayOfMonth() >= 21 && dtNascimento.getDayOfMonth() <= 30 || dtNascimento.getMonthValue() == 7 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 22){
		Console.println("Seu Signo � de Cancer.");
	}
	if(dtNascimento.getMonthValue()== 7 && dtNascimento.getDayOfMonth() >= 23 && dtNascimento.getDayOfMonth() <= 31 || dtNascimento.getMonthValue() == 8 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 22){
		Console.println("Seu Signo � de Le�o.");
	}
	if(dtNascimento.getMonthValue()== 8 && dtNascimento.getDayOfMonth() >= 23 && dtNascimento.getDayOfMonth() <= 30 || dtNascimento.getMonthValue() == 9 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 22){
		Console.println("Seu Signo � de Virgem.");
	}
	if(dtNascimento.getMonthValue()== 9 && dtNascimento.getDayOfMonth() >= 23 && dtNascimento.getDayOfMonth() <= 31 || dtNascimento.getMonthValue() == 10 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 22){
		Console.println("Seu Signo � de Libra.");
	}
	if(dtNascimento.getMonthValue()== 10 && dtNascimento.getDayOfMonth() >= 22 && dtNascimento.getDayOfMonth() <= 30 || dtNascimento.getMonthValue() == 11 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 21){
		Console.println("Seu Signo � de Escorpi�o.");
	}
	if(dtNascimento.getMonthValue()== 11 && dtNascimento.getDayOfMonth() >= 22 && dtNascimento.getDayOfMonth() <= 31 || dtNascimento.getMonthValue() == 12 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 21){
		Console.println("Seu Signo � de Sagit�rio.");
	}
	if(dtNascimento.getMonthValue()== 12 && dtNascimento.getDayOfMonth() >= 22 && dtNascimento.getDayOfMonth() <= 30 || dtNascimento.getMonthValue() == 1 && dtNascimento.getDayOfMonth() >= 1 && dtNascimento.getDayOfMonth() <= 19){
		Console.println("Seu Signo � de Capric�rnio.");
	}
	
	
}

public void obterIdade(){
	LocalDate dtNascimento = LocalDate.parse(getDataNascimento());
	
	 LocalDate agora = LocalDate.now();
	long idade = ChronoUnit.YEARS.between(dtNascimento, agora);
	
	Console.println("A sua idade �: ", idade," Anos.");
	
	
}

public String getNome() {
	return nome;
}



public String getDataNascimento() {
	return dataNascimento;
}








}
