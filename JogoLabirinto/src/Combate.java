

public class Combate {
	Personagem personagem;
	Monstro monstro;
	
	
	public void sofrerDano(){
		if(personagem.golpear() != 0){
			int pontosdeEnergia = monstro.getPontosDeEnergia() - personagem.golpear();
			monstro.setPontosDeEnergia(pontosdeEnergia);
		}
		
		
	}
	
	
	
}
