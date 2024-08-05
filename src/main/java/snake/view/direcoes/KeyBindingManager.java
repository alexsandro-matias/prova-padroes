package snake.view.direcoes;

import java.util.HashMap;
import java.util.Map;

public class KeyBindingManager {
    private Map<String, String> keyBindings;

    public KeyBindingManager() {
        keyBindings = new HashMap<>();
        keyBindings.put("UP", "W");
        keyBindings.put("DOWN", "S");
        keyBindings.put("LEFT", "A");
        keyBindings.put("RIGHT", "D");
    }

    public String getKey(String direction) {
        return keyBindings.get(direction);
    }

    public void setKey(String direction, String key) {
        keyBindings.put(direction, key);
    }
}
