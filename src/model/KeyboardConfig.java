package model;

import ctrl.KeyboardCtrl;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import sound.engine.Sound;

import java.util.HashMap;

public class KeyboardConfig {
    private KeyboardCtrl ctrl;
    private HashMap<KeyCode, Sound> keySoundMap;

    public KeyboardConfig(KeyboardCtrl ctrl) {
        this.ctrl = ctrl;
        keySoundMap = new HashMap<>();
    }

    public void loadSoundToBtn(Button btn, Sound sound) {
        KeyCode keyCode = ctrl.inferKeyCode(btn.getText());
        keySoundMap.put(keyCode, sound);
    }


    /* GETTERS AND SETTERS */

    public HashMap<KeyCode, Sound> getKeySoundMap() {
        return keySoundMap;
    }

    public void setKeySoundMap(HashMap<KeyCode, Sound> keySoundMap) {
        this.keySoundMap = keySoundMap;
    }
}
