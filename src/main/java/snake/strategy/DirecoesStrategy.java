package snake.strategy;

import snake.model.Direction;
import snake.model.SnakeGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Map;

public abstract class DirecoesStrategy extends KeyAdapter {

    protected Map<Integer, Direction> map;
    private SnakeGame game;

    public DirecoesStrategy(SnakeGame game) {
        this.game = game;
    }

    public void setGame(SnakeGame game) {
        this.game = game;
    }

    public abstract Map<Integer, Direction> configurarTeclas(int direita, int esquerda, int cima, int baixo);


    public Map<Integer, Direction> getMap() {

        return map;
    }

    public void keyPressed(KeyEvent e) {

        game.setDirection(this.getMap().get(e.getKeyCode()));
    }


}
