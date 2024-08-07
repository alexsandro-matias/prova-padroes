package snake.view;

import snake.difficulty.Advanced;
import snake.difficulty.Beginner;
import snake.difficulty.Intermediate;
import snake.view.direcoes.JoystickApp;
import snake.view.direcoes.KeyBindingManager;
import snake.view.direcoes.KeyBindingPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class GameFrame extends JFrame {

    private static void actionPerformed(ActionEvent al) {
        new JoystickApp();
    }

    public static void main(String[] args) {
        GameFrame gf = new GameFrame();
        gf.start();
    }

    public void start() {
        GamePanel panel = new GamePanel();
        this.setTitle("Snake");
        this.add(panel);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        JMenuBar menubar = new JMenuBar();
        this.setJMenuBar(menubar);
        JMenu menuOptions = new JMenu("Options");
        menuOptions.setMnemonic(KeyEvent.VK_O);
        menubar.add(menuOptions);
        JMenuItem startItem = new JMenuItem("Start");
        startItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
        startItem.addActionListener(al -> panel.startGame());
        menuOptions.add(startItem);
        JMenu menuDiff = new JMenu("Difficulty");
        menuOptions.add(menuDiff);
        JMenuItem beginnerItem = new JMenuItem("Begginner");
        beginnerItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.ALT_DOWN_MASK));
        beginnerItem.addActionListener(al -> panel.setDifficulty(new Beginner()));
        JMenuItem intermedItem = new JMenuItem("Intermediate");
        intermedItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.ALT_DOWN_MASK));
        intermedItem.addActionListener(al -> panel.setDifficulty(new Intermediate()));
        JMenuItem advancedItem = new JMenuItem("Advanced");
        advancedItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.ALT_DOWN_MASK));
        advancedItem.addActionListener(al -> panel.setDifficulty(new Advanced()));
        menuDiff.add(beginnerItem);
        menuDiff.add(intermedItem);
        menuDiff.add(advancedItem);
        JMenuItem menuExit = new JMenuItem("Exit");
        menuExit.addActionListener(al -> System.exit(0));
        menuOptions.add(menuExit);

        // início da resposta
        JMenuItem selecioneDirecao = new JMenuItem("Selecione Teclas");
        menuOptions.add(selecioneDirecao);
        //adicionando um atalho ou Hotkey
        selecioneDirecao.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.CTRL_DOWN_MASK));
        // setando as teclas
//        selecioneDirecao.addActionListener(al -> panel.setDifficulty(new Beginner()));

        selecioneDirecao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cria a nova janela
                JFrame janela = new JFrame("Selecione as teclas");
                janela.setSize(300, 200);
                janela.setVisible(true);



//
                KeyBindingManager keyBindingManager = new KeyBindingManager();
                KeyBindingPanel keyBindingPanel = new KeyBindingPanel(keyBindingManager);

                janela.add(keyBindingPanel);
                janela.setVisible(true);
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });


        StatusBar statusBar = new StatusBar();
        getContentPane().add(statusBar, java.awt.BorderLayout.SOUTH);
        panel.setStatusBar(statusBar);

        this.pack();
    }
}
