package classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.*;

public class Score extends JFrame {

	private char[] getScore;
	public MiMarco() {
		
		this("Juego Pong");
	}
	public MiMarco(String name) {
		
		this.setTitle(name);
		this.setSize(600,300);
		this.setResizable(false);;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.GRAY);
		g2d.setFont(new Font("Verdana", Font.BOLD, 30));
		g2d.drawString(String.valueOf("0 | 0"), 100,150); 
		
 }
}
