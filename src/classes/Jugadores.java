package classes;

import java.awt.Graphics;


public interface Jugadores{

    void paint(Graphics j);
    void move();

    //int y1;                             //Coordenadas y del jugador 1(eventos de movimiento).
    //int y2;                             //Coordenadas y del jugador 2(eventos de movimiento).

    /*private Game game;

    public Jugadores(Game game) {
        this.game = game;
    }*/

    

    /*public void paint(Graphics j1) {   
        j1.setColor(Color.BLACK);
        j1.fillRect(20, 60, 10, 80);       
    }
  
    public void paint2(Graphics j2) {   
        j2.setColor(Color.BLACK);
        j2.fillRect(game.getWidth()-30, 60, 10, 80);       
    }*/
}
