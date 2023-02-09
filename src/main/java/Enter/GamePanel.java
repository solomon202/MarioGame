package Enter;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import inputs.Keyboardsinput;

public class GamePanel extends JPanel{
	
	
   public GamePanel() {
	   
	   addKeyListener(new Keyboardsinput());
	   
   }
	   
   
   public void paintComponent(Graphics g) {
	   super.paintComponent(g);
	   
	   g.fillRect(100, 100,200 , 50);
	   
   
   }
}
