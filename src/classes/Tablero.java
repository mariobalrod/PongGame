package classes;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Tablero extends JFrame{
	String nombreJuego;
	int width;
	int height;
	
	public Tablero (String nombreJuego, int width, int height) {
		this.nombreJuego = nombreJuego;
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public JFrame crearFrame() {
		JFrame frame = new JFrame(this.nombreJuego);
		frame.setSize(this.width, this.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		return frame;
	}
	
}
