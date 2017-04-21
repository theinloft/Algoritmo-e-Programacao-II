package exercicio2;

import com.senac.SimpleJava.Console;
import java.util.*;

public class ContaBancaria {
	
	private int numero;
	private double saldo;
	
	
	
	public ContaBancaria() {
		
	numero = (int) (Math.random() * 101);
	saldo=0.00;
	}

	
	
	
	
	
public boolean saque(double valor){
		if(saldo > 0){
			saldo-=valor;
			return true;
			
		}
		return false;
	}
	public void deposito(double valor){
		saldo+=valor;
	}
	
	public boolean hasSaldo(){
		if(saldo >0){
			Console.println("Saldo:",saldo);
			
			return true;
		}
		Console.println("saldo insuficiente");
		return false;
	}
	public double getSaldo() {
		return saldo;
	}






	public int getNumero() {
		return numero;
	}






	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
