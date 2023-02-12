package Enter;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import inputs.Keyboardsinput;
import inputs.MouseInputs;

public class GamePanel extends JPanel{
	//есть уже заданые параметры или получить через конструктор изменяемые данные .
	private MouseInputs mouseInputs;
	private int xDelta = 0,yDelta = 0;
	
   public GamePanel() { 
	   
	   mouseInputs = new MouseInputs();                                        
	   // для обработки событий клавиатуры необходимо реализовать специальный интерфейс, а затем добавить получившегося слушателя к интересуемому компоненту. 
	   addKeyListener(new Keyboardsinput(this));
	   //эти интерфейса содержат методы, принимающие и обрабатывающие различные типы событий от мыши
	   addMouseListener(mouseInputs);
	   addMouseMotionListener(mouseInputs);
	   
   }
   //метод с получаемым параметром 
   public void changeXDelta(int value) {
	   //есть какаята картинка изночально позицыя квадрата 100 потом при нажатии присваиваиваится новая позиция дельта 0 и перересовыется уже не 0
	   //тоесть  это позиция и + новая дэльта.
	   this.xDelta += value;
	   repaint();
   }
   
   public void changeYDelta(int value) {
	   this.yDelta += value;
	   repaint();
   }
   
   public void paintComponent(Graphics g) {
	   super.paintComponent(g);
	   //прямоугольник 100+дельта его позицыя
	   g.fillRect(100+xDelta, 100+yDelta,200 , 50);
	   
   
   }
}
