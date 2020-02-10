package classes;

import java.awt.*;
import java.awt.event.KeyEvent;

import juego.Game;

public class Jugador2 implements Jugadores {
    

    int y;                  // Evento de teclado 

    private Game game;

    //Coordenadas que va sumando o restando el evento de teclado
    int xa;

    public Jugador2(Game game){
        this.game = game;
        this.y = 165;
    }
    
    public void paint(Graphics j2) {
        j2.setColor(Color.BLACK);
        j2.fillRect(game.getWidth()-30, this.y, 10, 80);  
    }

    
    public void move() {
        if (this.y + xa > 0 && this.y + xa < game.getHeight()-79)
			    this.y = this.y + xa; 
    }

    public void keyReleased(KeyEvent e) {
        xa = 0;
    }
  
    public void keyPressed(KeyEvent e) {
      if (e.getKeyCode() == KeyEvent.VK_SHIFT)
        xa = -1;
      if (e.getKeyCode() == KeyEvent.VK_CONTROL)
        xa = 1;
    }

}