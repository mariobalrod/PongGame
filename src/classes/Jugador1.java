package classes;

import java.awt.*;
import juego.Game;

public class Jugador1 implements Jugadores {
    
    int y;                  // Evento de teclado 
    private Game game;

    public Jugador1(Game game) {
        this.game = game; 
	}


	public void paint(Graphics j) {
        j.setColor(Color.BLACK);
        j.fillRect(20, this.y, 10, 80); 
    }

    
    public void move() {
      //FUNCION POR HACER  

    }

}
