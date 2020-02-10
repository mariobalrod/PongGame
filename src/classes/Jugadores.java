package classes;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;

public class MyPanel extends JPanel {

    int x;
    int y; // Variable y sera controlada por eventos de teclado
    // variable ya y xa = constantes
    int xa;
    int ya;

    public MyPanel() {
    }

    public MyPanel(int x, int y, int xa, int ya) {
        this.x = x;
        this.y = y;
        this.xa = xa;
        this.ya = ya;
    }

    private static final long serialVersionUID = 1L;

    public void paint(Graphics j2) {   
        j2.setColor(Color.red);
        j2.drawRect(0, 0, 50, 20);       
    }
  
}
