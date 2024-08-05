package snake.strategy;

public class DirecaoPadrao implements DirecoesStrategy {
    @Override
    public String getUpKey() {
        return "W";
    }

    @Override
    public String getDownKey() {
        return "S";
    }

    @Override
    public String getLeftKey() {
        return "A";
    }

    @Override
    public String getRightKey() {
        return "D";
    }
}