package Action.GameAction;

import Main.Menu;

public class FinishAction implements Runnable {

    private final Menu game = Menu.instance;

    @Override
    public void run() {
        System.out.println("Finish");
        game.onDisable();
    }
}
