
import com.senac.SimpleJava.*;

public class App {
public void run(){
	Funcionario f = null;
	int opcao;
	
	do{
	Console.print("***************************************\n");
	Console.println("Escolha uma op��o:\n");
	Console.print("1 - cadastrar um funcion�rio\n");
	Console.print("2 - efetuar a avalia��o anual / Salario bonus\n");
	Console.print("***************************************\n");
	
	opcao = Console.readInt();
	
	
	
	
	switch (opcao) {
	case 1:
		
		String nome = Console.readString("Digite o nome do funcion�rio:");
		String cargo = Console.readString("Digite o cargo do funcion�rio:");
		double salario = Console.readDouble("Digite o salario:");
		
		
		
		 f = new Funcionario(nome,cargo,salario);
		
		
		
		break;
		
	
	case 2:
		if(f == null){
		Console.print("Voc� deve cadastrar um funcion�rio antes de fazer a avalia��o anual / salario bonus");
			
		break;
		}
		int desempenho = Console.readInt("Digite o Desempenho do funcion�rio(escala de 0 � 10):\n");
		
		f.Bonus(desempenho);
		
		

	default:
		break;
	}
	
	
} while(opcao !=0);
	
	
}
}
