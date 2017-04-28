import com.senac.SimpleJava.Console;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, String cargo, double salario){
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void Bonus(int desempenho){
		/*desempenho de 0 à 10
		*se desempenho for 1 à 5: 15% por exemplo. 
		*de 6 à 10: 20%.
		*/
		double bonus = 0;
		
		if(desempenho >=1 && desempenho <= 5 ){
			/*Bonus  15% para Desenvolvedores.
			 * Bonus 20% para Testadores.
			 * Bonus 80% para Gerentes.
			 */
		
				if("Desenvolvedor".equalsIgnoreCase(getCargo())){
					 bonus = getSalario() * 0.15;  
				}
				if("Testador".equalsIgnoreCase(getCargo())){
					bonus = getSalario() * 0.20;
				}
				if("Gerente".equalsIgnoreCase(getCargo())){
					bonus = getSalario() * 0.80;
				}
		}
		
		if(desempenho >=6 && desempenho <=10){
			
			if("Desenvolvedor".equalsIgnoreCase(getCargo())){
				 bonus = getSalario() * 0.20;  
			}
			if("Testador".equalsIgnoreCase(getCargo())){
				bonus = getSalario() * 0.30;
			}
			if("Gerente".equalsIgnoreCase(getCargo())){
				bonus = getSalario() * 0.85;
			}
			
			else{
				bonus = 0;
			}
			
			
			
		}
		Console.println("Salario de bonus anual é de R$:", bonus);
		Console.println("Salario Total do mês R$:",getSalario()+bonus);
	}

}
