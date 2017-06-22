public class Monstro{
	private String nome;
	private int pontosdeEnergia;
	
	public Monstro(String nome){
		this.nome = nome;
		this.pontosdeEnergia = 100;
	}
	
	
	public void golpear(){
		/*Goblin: 80% de chance de acerto, causa 2 pontos de dano.
		 * Orc: 75% de chance de acerto, causa 4 pontos de dano.
		 * Troll: 50% de chance de acerto, causa 6 pontos de dano.
		 */
		
	if(nome.equalsIgnoreCase("goblin")){
		int valor = (int) (Math.random() * 101);
		
		if(valor<=80){
			int dano = 2;
		}
	}
	if(nome.equalsIgnoreCase("orc")){
int valor = (int) (Math.random() * 101);
		
		if(valor<=75){
			int dano = 4;
		}
		
	}

	if(nome.equalsIgnoreCase("troll")){
int valor = (int) (Math.random() * 101);
		
		if(valor<=50){
			int dano = 6;
		}
	
	}
	
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}




	public void setPontosDeEnergia(int pontosdeEnergia) {
		this.pontosdeEnergia = pontosdeEnergia;
	}


	public int getPontosDeEnergia() {
		// TODO Auto-generated method stub
		return pontosdeEnergia;
	}


	
}
	
