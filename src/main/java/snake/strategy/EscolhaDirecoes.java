package snake.strategy;

import java.util.Scanner;


public class EscolhaDirecoes implements DirecoesStrategy {
    private final String upKey;
    private final String downKey;
    private final String leftKey;
    private final String rightKey;

    public EscolhaDirecoes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a tecla para cima: ");
        upKey = scanner.nextLine();

        System.out.println("Escolha a tecla para baixo: ");
        downKey = scanner.nextLine();

        System.out.println("Escolha a tecla para esquerda: ");
        leftKey = scanner.nextLine();

        System.out.println("Escolha a tecla para direita: ");
        rightKey = scanner.nextLine();
    }

    @Override
    public String getUpKey() {
        return upKey;
    }

    @Override
    public String getDownKey() {
        return downKey;
    }

    @Override
    public String getLeftKey() {
        return leftKey;
    }

    @Override
    public String getRightKey() {
        return rightKey;
    }
}


