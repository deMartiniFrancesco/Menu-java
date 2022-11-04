package Action.Listener;

import Action.GameAction.*;
import Main.Menu;
import Main.States;

public class GameActionListener {
    private final Menu game = Menu.instance;
    private final Runnable menuAction;
    private final Runnable finishAction;


    public GameActionListener() {
        menuAction = new MenuAction();
        finishAction = new FinishAction();
    }

    public void performAction(States state) {
        game.state = state;

        switch (state) {
            case MENU -> menuAction.run();
            case FINISH -> finishAction.run();
        }
    }
}