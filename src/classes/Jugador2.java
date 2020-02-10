package classes;

import java.awt.*;
import juego.Game;

public class Jugador2 implements Jugadores {
    

    int y;                  // Evento de teclado 

    private Game game;
    public Jugador2(Game game){
        this.game = game; 
    }
    
    public void paint(Graphics j2) {
        j2.setColor(Color.BLACK);
        j2.fillRect(game.getWidth()-30, this.y, 10, 80);  
    }

    
    public void move() {
      //FUNCION POR HACER  

    }

}