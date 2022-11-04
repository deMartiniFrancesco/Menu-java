package Action.GameAction;

import Grafica.MenuPanel;
import Main.Menu;

public class MenuAction implements Runnable {

    private final Menu game = Menu.instance;


    @Override
    public void run() {
        game.clearFrame();
        game.mainPane = new MenuPanel();
        game.frame.addComponent(game.mainPane);
    }

}
