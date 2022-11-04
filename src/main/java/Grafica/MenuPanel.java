package Grafica;

import Action.ClickAction;
import Control.Interfaces.WindowPanel;
import Main.States;
import Models.Button;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MenuPanel extends JPanel implements WindowPanel {
    private final int panelWidth = 400;
    private final int panelHeight = 450;

    public MenuPanel() {
        JLabel title = new JLabel("TheAdventureMaze");
        title.setHorizontalAlignment( SwingConstants.CENTER );
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Impact", Font.PLAIN, 30));

        add(title, 0, 0);

        Button startButton = new Button(
                "Finish",
                new ClickAction(States.FINISH),
                40
        );
        add(startButton);

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(panelWidth, panelHeight);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    @Override
    public void addAction(List<?> args) {
    }
}