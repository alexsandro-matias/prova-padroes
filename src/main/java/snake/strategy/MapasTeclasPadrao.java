package snake.strategy;

import snake.model.Direction;
import snake.model.SnakeGame;

import java.awt.event.KeyEvent;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapasTeclasPadrao extends DirecoesStrategy {

    public MapasTeclasPadrao(SnakeGame game) {
        super(game);
        configurarTeclas(1,2,3,4);
    }

    @Override
    public Map<Integer, Direction> configurarTeclas(int direita, int esquerda, int cima, int baixo) {

        Map<Integer, Direction> map = Stream.of(new Object[][]{
                {KeyEvent.VK_LEFT, Direction.LEFT},
                {KeyEvent.VK_RIGHT, Direction.RIGHT},
                {KeyEvent.VK_UP, Direction.UP},
                {KeyEvent.VK_DOWN, Direction.DOWN}
        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (Direction) data[1]));

        super.map = map;
        return map;
    }

}
