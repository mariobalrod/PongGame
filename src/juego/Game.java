package juego;

import classes.*;

import javax.swing.JFrame;
public class Game {
	public static void main(String[] args) {


		//Creando valores del Tablero
		Tablero tablero = new Tablero("Pong Game", 1000, 500);
		//Creamos el frameTablero
		JFrame frame = tablero.crearFrame();
		//Frame -> Visible
		frame.setVisible(true);
	}

	// int x = 0;
	// int y = 0;
	// int xa = 1;
	// int ya = 1;

	// private void moveBall() {
	// 	if (x + xa < 0)
	// 		xa = 1;
	// 	if (x + xa > getWidth() - 30)
	// 		xa = -1;
	// 	if (y + ya < 0)
	// 		ya = 1;
	// 	if (y + ya > getHeight() - 30)
	// 		ya = -1;

	// 	x = x + xa;
	// 	y = y + ya;
	// }

	// @Override
	// public void paint(Graphics g) {
	// 	super.paint(g);
	// 	Graphics2D g2d = (Graphics2D) g;
	// 	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	// 	g2d.fillOval(x, y, 30, 30);
	// }

	// public static void main(String[] args) throws InterruptedException {
	// 	JFrame frame = new JFrame("Pong Game");
	// 	Game game = new Game();
	// 	frame.add(game);
	// 	frame.setSize(1000, 500);
	// 	frame.setVisible(true);
	// 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// 	while (true) {
	// 		game.moveBall();
	// 		game.repaint();
	// 		Thread.sleep(5);
	// 	}
	// }

}
