import java.io.*;
import com.senac.SimpleJava.Graphics.Image;

public class Sala {
	private String nome;
	Image backgrd;
	
	public Sala(String nome) {
		
		this.nome = nome;
		adicionarImagem();
	}

	private void adicionarImagem() {
		try {
			this.backgrd = new Image("Imagens/cenario.png");
		} catch (Exception e) {
		e.printStackTrace();	
		}
		
	}

	
	
	
}
