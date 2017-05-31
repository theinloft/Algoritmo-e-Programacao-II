
public class Personagem {

private String nome;
private int pontosDeEnergia;
private Arma arma;
private Chave chave;

public Personagem(String nome,Arma arma, Chave chave) {
	this.nome = nome;
	this.pontosDeEnergia = 20;
	this.arma = arma;
	this.chave = chave;
}


public void golpear(){
	
	if(arma.name()!= null){
		switch (arma) {
		case Adaga:
			
			int valor = (int) (Math.random() * 101);
			
			if(valor<=75){
				//acertou o golpe com adaga
				
			}
			else{
				//errou o golpe com adaga
			}
		case Faca:
			valor = (int) (Math.random() * 101);
			
			if(valor <=80){
				//acertou o golpe com faca
			}
			else{
				//errou o golpe com faca
			}
			
			break;

		default:
			break;
		}
	}
}


public int getPontosDeEnergia() {
	return pontosDeEnergia;
}


public void setPontosDeEnergia(int pontosDeEnergia) {
	this.pontosDeEnergia = pontosDeEnergia;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public Arma getArma() {
	return arma;
}


public void setArma(Arma arma) {
	this.arma = arma;
}


public Chave getChave() {
	return chave;
}


public void setChave(Chave chave) {
	this.chave = chave;
}

	
	
	
}
