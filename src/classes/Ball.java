package classes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Ball extends Tablero{
    int x;
    int y;
// Velocidad a la que se suman
    int xa;
    int ya;
//Constructores

    public Ball (){}

    public Ball (int x, int y, int xa, int ya){
        this.x = x;
        this.y = y;
        this.xa = xa;
        this.ya = ya;
    }

//set 

    public void setX (int x){
        this.x = x;
    }
    public void setY (int y){
        this.y = y;
    }
    public void setXa (int xa){
        this.xa = xa;
    }
    public void setYa (int ya){
        this.ya = ya;
    }

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 30, 30);
    }
    
    private void moveBall() {
		if (x + xa < 0)
			xa = 1;
		if (x + xa > getWidth() - 30)
			xa = -1;
		if (y + ya < 0)
			ya = 1;
		if (y + ya > getHeight() - 30)
			ya = -1;

		x = x + xa;
		y = y + ya;
    }

   
    

}
