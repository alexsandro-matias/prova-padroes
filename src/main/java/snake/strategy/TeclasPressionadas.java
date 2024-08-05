package snake.strategy;

public class TeclasPressionadas {
    private DirecoesStrategy DirecoesStrategy;

    public TeclasPressionadas(DirecoesStrategy DirecoesStrategy) {
        this.DirecoesStrategy = DirecoesStrategy;
    }

    public void setDirecoesStrategy(DirecoesStrategy DirecoesStrategy) {
        this.DirecoesStrategy = DirecoesStrategy;
    }

    public DirecoesStrategy getDirecoesStrategy() {
        return DirecoesStrategy;
    }
}

