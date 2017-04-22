package exercicio4;

import com.senac.SimpleJava.*;

public class App {
	public void run(){
		Temperatura t = null;
		
		String grauTemperatura = Console.readString("Digite a temperatura:(Digite a escala 'C' para Celsius ou 'F' Fahreit):\n");
		
		t = new Temperatura(grauTemperatura);
		
		t.conversaoEscalaDeTemperatura(grauTemperatura);
	}

}
