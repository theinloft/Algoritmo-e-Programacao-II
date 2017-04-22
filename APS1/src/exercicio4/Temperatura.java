package exercicio4;

import com.senac.SimpleJava.Console;

public class Temperatura {

	
	private String grauTemperatura;
	

	
	
	public Temperatura(String grauTemperatura) {
		
		this.grauTemperatura = grauTemperatura;
	}

	
	
	
	public void setGrautemperatura(String grautemperatura) {
		this.grauTemperatura = grautemperatura;
	}
	
	
	public String getGrautemperatura() {
		return grauTemperatura;
	}
	
	public void conversaoEscalaDeTemperatura(String grauTemperatura){
		if(grauTemperatura.endsWith("C")){
			
			String temp = grauTemperatura.substring(0, 2);
			double temperat  = Double.parseDouble(temp);
			double grauTempFarenh = 1.8 * temperat + 32;
			
			Console.println("temperatura convertida para Farenheit:", grauTempFarenh, " F");
			
		}
		if(grauTemperatura.endsWith("F")){
			String temp = grauTemperatura.substring(0, 2);
			double temperat = Double.parseDouble(temp);
			double grauTempCel = (temperat - 32) / 1.8;
			
			Console.println("temperatura convertida para Celsius:", grauTempCel, " C");
		}
		else{
			Console.print("temperatura ou escala escolhida é inválida");
		}
	}
	
}
