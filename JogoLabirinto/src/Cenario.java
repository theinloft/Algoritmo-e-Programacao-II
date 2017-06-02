import com.senac.SimpleJava.Graphics.Canvas;
import com.senac.SimpleJava.Graphics.Color;
import com.senac.SimpleJava.Graphics.GraphicApplication;
import com.senac.SimpleJava.Graphics.Point;
import com.senac.SimpleJava.Graphics.Resolution;
import com.senac.SimpleJava.Graphics.Sprite;



public class Cenario extends GraphicApplication {
	

	
	

    @Override
    protected void draw(Canvas canvas) {
        /* desenho dos objetos do jogo */
    	canvas.drawLine(0, 15, 15, 30);
        canvas.setBackground(Color.DARKGRAY);
        canvas.clear();
        
    }

    @Override
    protected void setup() {
        /* configuração da tela do jogo */
        this.setResolution(Resolution.MSX);
    }

    @Override
    protected void loop() {
        /* lógica do jogo */
    }
}
