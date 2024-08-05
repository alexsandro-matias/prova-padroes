package snake.view.direcoes;

import javax.swing.*;

public class JoystickApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TelaSelecaoTeclas();
            }
        });
    }

    private static void TelaSelecaoTeclas() {
        JFrame frame = new JFrame("Selecione Teclas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        KeyBindingManager keyBindingManager = new KeyBindingManager();
        KeyBindingPanel keyBindingPanel = new KeyBindingPanel(keyBindingManager);

        frame.add(keyBindingPanel);
        frame.setVisible(true);
    }
}

