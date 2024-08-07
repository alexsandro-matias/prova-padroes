package snake.strategy;

import snake.model.Direction;
import snake.model.SnakeGame;

import java.awt.event.KeyEvent;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapaTeclasCustomizadas extends DirecoesStrategy {

    public MapaTeclasCustomizadas(SnakeGame game) {
        super(game);
        configurarTeclas(KeyEvent.VK_D, KeyEvent.VK_A, KeyEvent.VK_W,KeyEvent.VK_S);
    }

    @Override
    public Map<Integer, Direction> configurarTeclas(int direita, int esquerda, int cima, int baixo) {

        Map<Integer, Direction> map = Stream.of(new Object[][]{
                        {esquerda, Direction.LEFT},
                        {direita, Direction.RIGHT},
                        {cima, Direction.UP},
                        {baixo, Direction.DOWN}})
                .collect(Collectors.toMap(data -> (Integer) data[0], data -> (Direction) data[1]));

        super.map = map;
        return map;
    }

}
