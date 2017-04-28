
import com.senac.SimpleJava.*;

public class App {
public void run(){
	Funcionario f = null;
	int opcao;
	
	do{
	Console.print("***************************************\n");
	Console.println("Escolha uma opção:\n");
	Console.print("1 - cadastrar um funcionário\n");
	Console.print("2 - efetuar a avaliação anual / Salario bonus\n");
	Console.print("***************************************\n");
	
	opcao = Console.readInt();
	
	
	
	
	switch (opcao) {
	case 1:
		
		String nome = Console.readString("Digite o nome do funcionário:");
		String cargo = Console.readString("Digite o cargo do funcionário:");
		double salario = Console.readDouble("Digite o salario:");
		
		
		
		 f = new Funcionario(nome,cargo,salario);
		
		
		
		break;
		
	
	case 2:
		if(f == null){
		Console.print("Você deve cadastrar um funcionário antes de fazer a avaliação anual / salario bonus");
			
		break;
		}
		int desempenho = Console.readInt("Digite o Desempenho do funcionário(escala de 0 à 10):\n");
		
		f.Bonus(desempenho);
		
		

	default:
		break;
	}
	
	
} while(opcao !=0);
	
	
}
}
