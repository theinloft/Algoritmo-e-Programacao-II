import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import com.senac.SimpleJava.Console;
import com.senac.SimpleJava.Graphics.Canvas;
import com.senac.SimpleJava.Graphics.Color;
import com.senac.SimpleJava.Graphics.GraphicApplication;
import com.senac.SimpleJava.Graphics.Image;
import com.senac.SimpleJava.Graphics.Point;
import com.senac.SimpleJava.Graphics.Resolution;







public class Cenario extends GraphicApplication {
	Sala sala[] = new Sala[31];
	int contador;
	 private Image img;

	
	

    @Override
    protected void draw(Canvas canvas) {
        /* desenho dos objetos do jogo */
    	
    	canvas.drawImage(img, 0, 0);
    	
    	
    	
        
        
    }

    @Override
    protected void setup() {
        /* configuração da tela do jogo */
        this.setResolution(Resolution.MSX);

		this.setFramesPerSecond(30);

		
		try {
		img = new Image("Imagens/cenario.png");
		}catch (IOException e) {
			e.printStackTrace();
			
		}
		
    }

    
    public void carregarArquivo (){
		String[] linhas = new String[31];
		Scanner scanner = null;
		int i = 0;
		
		try {
			scanner = new Scanner (new FileReader("Labirinto.txt")).useDelimiter("\n");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    @Override
    protected void loop() {
        /* lógica do jogo */
    }
}
