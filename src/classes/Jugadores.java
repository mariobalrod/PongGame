package classes;

import juego.Game;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;

public class Jugadores extends JPanel {

    int x;
    int y; // Variable y sera controlada por eventos de teclado
    // variable ya y xa = constantes
    int xa;
    int ya;

    private Game game;

    public Jugadores(Game game) {
        this.game = game;
    }

    private static final long serialVersionUID = 1L;

    public void paint(Graphics j2) {   
        j2.setColor(Color.red);
        j2.drawRect(0, 0, 50, 20);       
    }
  
}
