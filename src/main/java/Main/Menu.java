package Main;

import Action.Listener.GameActionListener;
import Control.Interfaces.Application;
import Grafica.MainFrame;

import javax.swing.*;

public class Menu implements Application {

    public static Menu instance;
    private static String projectPath;
    public States state;

    public GameActionListener actionListener;

    public JPanel mainPane;
    public MainFrame frame;

    public Menu(String projectPath) {
        Menu.projectPath = projectPath;
    }

    @Override
    public String getResources() {
        return projectPath + "/Resources/";
    }

    @Override
    public void onDataLoad() {
        instance = this;

        actionListener = new GameActionListener();
    }

    @Override
    public void onEnable() {
        actionListener.performAction(States.MENU);
    }

    public void clearFrame() {
        if (frame != null) {
            JPanel contentPane = (JPanel) frame.getContentPane();
            contentPane.removeAll();
        } else {
            frame = new MainFrame("TheAdventuresMaze");
        }
    }


    @Override
    public void onDisable() {
        System.exit(0);
    }
}