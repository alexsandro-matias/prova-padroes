package snake.view.direcoes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyBindingPanel extends JPanel {
    private final KeyBindingManager keyBindingManager;
    private final JTextField upField;
    private final JTextField downField;
    private final JTextField leftField;
    private final JTextField rightField;

    public KeyBindingPanel(KeyBindingManager keyBindingManager) {
        this.keyBindingManager = keyBindingManager;
        setLayout(new GridLayout(3, 3));

        // Adiciona as setas
        add(new JLabel(" "));
        add(new JLabel("UP", SwingConstants.CENTER));
        add(new JLabel(" "));

        add(new JLabel("LEFT", SwingConstants.CENTER));
        upField = new JTextField(keyBindingManager.getKey("UP"));
        downField = new JTextField(keyBindingManager.getKey("DOWN"));
        leftField = new JTextField(keyBindingManager.getKey("LEFT"));
        rightField = new JTextField(keyBindingManager.getKey("RIGHT"));

        add(leftField);
        add(upField);
        add(rightField);

        add(new JLabel(" "));
        add(new JLabel("DOWN", SwingConstants.CENTER));
        add(new JLabel(" "));

        // Configura a área para editar as teclas
        JButton saveButton = new JButton("Salvar");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveKeyBindings();
            }
        });
        add(new JLabel(" "));
        add(saveButton);
        add(new JLabel(" "));
    }

    private void saveKeyBindings() {
        keyBindingManager.setKey("UP", upField.getText());
        keyBindingManager.setKey("DOWN", downField.getText());
        keyBindingManager.setKey("LEFT", leftField.getText());
        keyBindingManager.setKey("RIGHT", rightField.getText());

        JOptionPane.showMessageDialog(this, "Teclas salvas com sucesso!");
    }
}

