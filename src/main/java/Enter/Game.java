package Enter;

public class Game {
	
	private GameWindow gameWindow;
	private GamePanel gamePanel;
	
	public Game() {
		gamePanel = new GamePanel();
		gameWindow = new GameWindow(gamePanel);
	  //Элемент requestFocus (раздел Advanced) позволяет установить фокус на нужном компоненте. Предположим, что у вас имеется три текстовых поля, и нужно, чтобы фокус был на втором поле. В этом случае достаточно добавить тег requestFocus внутри нужного элемента:
		//Компонент является объектом, имеющим графическое изображение, которое может быть выведено на экран на экране, и это может взаимодействовать с пользователем. Примерами компонентов являются кнопки, флажки, и полосы прокрутки типичного графического интерфейса пользователя.
		gamePanel.requestFocus();

}
}