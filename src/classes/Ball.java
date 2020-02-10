package classes;

import juego.Game;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ball extends JPanel{

    int x = 0;
    int y = 0;
    
    // Velocidad a la que se suman
    int xa = 2;
    int ya = 2;

    private Game game;

    //Constructores
    public Ball (){}

    public Ball (Game game){
        this.game = game;
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
		g.fillOval(x, y, 25, 25);
    }
    
    public void moveBall() {
		if (this.x + this.xa < 0)
            this.xa = 1;

		if (this.x + this.xa > game.getWidth() - 30)
            this.xa = -1;

		if (this.y + this.ya < 0)
            this.ya = 1;

		if (this.y + this.ya > game.getHeight() - 30)
            this.ya = -1;

		this.x = this.x + this.xa;
		this.y = this.y + this.ya;
    }

}
