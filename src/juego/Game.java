package juego;

import classes.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.RenderingHints;

@SuppressWarnings("serial")
public class Game extends JPanel{

	//Creando la Bola
	Ball ball = new Ball(this);
	//Creando Jugadores
	Jugadores jugadores = new Jugadores(this);
	
	//Creando el Score
	Score score = new Score(0, 0);

	public static void main(String[] args) throws InterruptedException{
		
		Game game = new Game();
		
		//Creamos el frameTablero
		JFrame frame = new JFrame("Pong Game");
		frame.setSize(1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		//Añadiendo objetos del juego al frame (Tablero, ball, score)
		frame.add(game);

		//Establecer la posicion de la ventana
		frame.setLocation(450, 250);

		//Frame -> Visible
		frame.setVisible(true);


		//Movimiento de la Bola
		while(true) {
			game.move();
			game.repaint();
			Thread.sleep(5);
		}
	}

	//Movimientos del Juego
	private void move() {
		ball.moveBall();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		ball.paint(g2d);
		jugadores.paint(g2d);		

		g2d.setColor(Color.GRAY);
		g2d.setFont(new Font("Verdana", Font.BOLD, 30));
		g2d.drawString(String.valueOf(score.getScoreJug1() + " | " + score.getScoreJug2()), 460, 30);
    }

}
