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
	private int xDelta =100,yDelta = 100;
	private int frames = 0;
	private long lastCheck = 0;
	
   public GamePanel() { 
	   
	   mouseInputs = new MouseInputs(this);                                        
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
	  
   }
   
   public void changeYDelta(int value) {
	   this.yDelta += value;
	   
   }
   
   public void setRectPos(int x,int y) {
	   this.xDelta = x;
	   this.yDelta = y;
	   
   }
   
   public void paintComponent(Graphics g) {
	   super.paintComponent(g);
	   
	   updateRectangle();
	   //прямоугольник 100+дельта его позицыя
	   g.fillRect(xDelta, yDelta,200 , 50);
	   frames++;
	   //количество кадров 
	   if(System.currentTimeMillis()- lastCheck >= 1000) {
		   lastCheck = System.currentTimeMillis();
		   System.out.println("FPS: " + frames);
		   frames = 0;
	   }
	   repaint();
  
   }
   //обновление кадров
     private  void updateRectangle() {
    	 
     }
}
