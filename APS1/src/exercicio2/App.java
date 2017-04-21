package exercicio2;

import com.senac.SimpleJava.Console;

public class App {
	public void run(){
		Cliente cliente = null;
		ContaBancaria conta = null;
		
		int opc=0;
		
		do{
			do{
		Console.println("----------------\n");
		Console.println("****Menu Principal:****");
		Console.println("1-Criar conta\n");
		Console.println("2-Consultar Conta existente\n");
		Console.println("0 - Sair\n");
		Console.println("----------------");
		opc = Console.readInt();
		
	
		
		
		switch (opc) {
						case 1:{
							
							String nome = Console.readString("Digite nome do cliente:");
							String cpf =  Console.readLine("Digite o Cpf do cliente:");
							conta = new ContaBancaria();
							
									cliente = new Cliente(cpf, nome,conta); 
									Console.println("**********************************");
									Console.println("Conta Bancária criada nº:",conta.getNumero());
									Console.println("Titular:", cliente.getNome());
									Console.println("CPF:", cliente.getCpf());
									Console.println("**********************************");
									
									int subopc = 0;
									do{
										
											Console.println("****Menu:****");
											Console.println("1- Efetuar deposito");
											Console.println("2- Efetuar saque");
											Console.println("0 - sair");
											
											subopc = Console.readInt();
														if(subopc == 1){
													Console.println("insira o valor à ser depositado R$:");
													double valor = Console.readDouble();
															if(valor >0){
																	conta.deposito(valor);
																	Console.println("valor depositado com sucesso.");
																	Console.println("Saldo atual:", conta.getSaldo());
																	break;
																		}
															else{
																	Console.print("valor inválido.");
																	break;
											     				}
														}
														
									}
									while(subopc<0 && subopc>2); 
						}
		
					
					
		
			break;
					
			
			
								case 2:{
					
				
											int numConta = Console.readInt("Digite o nº da conta:");
													
													if(numConta == conta.getNumero()){
															Console.println("Conta:", conta.getNumero());
															Console.println("Saldo:", conta.getSaldo());
															}
														else{
															Console.println("conta inexistente");
														
											
														}
										}
								
					
		
		
			
					}
			
		}while(opc < 0 && opc > 2);
			
			
		}while(opc!=0);
	}
			
		
		}
	
		
	
  
 
	

					
					
					
		
	
	

	
			
					

					
		
		
		

