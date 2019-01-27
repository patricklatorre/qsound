package modules;

import ctrl.KeyboardCtrl;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import model.KeyboardConfig;
import modules.generic.stringinput.StringInput;
import sectionfx.Gooey;
import sectionfx.GooeyJob;
import sound.engine.Sound;

public class Keyboard extends GooeyJob {

    private KeyboardConfig keyboardConfig;

    @Override
    public void create() {
        window = new Stage();
        mainGooey = Gooey.create()
                .fromFXML("/view/keyboard-layout.fxml")
                .withScreen(900, 400);

        KeyboardCtrl ctrl = mainGooey.getController(KeyboardCtrl.class);

        // On key press & release
        mainGooey.getScreen().setOnKeyPressed(keyEvent -> onKeyPressed(keyEvent.getCode()));
        mainGooey.getScreen().setOnKeyReleased(keyEvent -> onKeyReleased(keyEvent.getCode()));

        // Load new board config
        keyboardConfig = new KeyboardConfig(ctrl);

        // On key click & touch
        for (Button btn : ctrl.getAllButtons()) {
            onKeyBtnClick(btn);
        }
    }

    private void onKeyBtnClick(Button btn) {
        btn.setOnMouseClicked(e -> {
            String soundPath = StringInput.display("File", "Workspace sound:");
            // TODO: validate soundfile before loading in

            Sound sound = new Sound(soundPath);
            keyboardConfig.loadSoundToBtn(btn, sound);
        });
    }

    private void onKeyPressed(KeyCode keyCode) {
        Button pressedBtn = mainGooey.getController(KeyboardCtrl.class).queryBtn(keyCode);

        if (pressedBtn != null) {
            // Play sound
            Sound sound = keyboardConfig.getKeySoundMap().get(keyCode);
            if (sound != null) {
                sound.play();
            }

            // Impact effect
            keyImpactFX(pressedBtn);
        }
    }

    private void onKeyReleased(KeyCode keyCode) {
        KeyboardCtrl ctrl = mainGooey.getController(KeyboardCtrl.class);
        Button pressedBtn = ctrl.queryBtn(keyCode);

        if (pressedBtn != null) {
            keyImpactFX(pressedBtn);
        }
    }

    private void keyImpactFX(Button btn) {
        if (btn.getStyleClass().contains("unpressed")) {
            btn.getStyleClass().remove("unpressed");
            btn.getStyleClass().add("pressed");
        } else {
            btn.getStyleClass().remove("pressed");
            btn.getStyleClass().add("unpressed");
        }
    }

    /*
    private void onKeyTouchPress(Button btn) {
        KeyboardCtrl ctrl = mainGooey.getController(KeyboardCtrl.class);
        btn.setOnTouchPressed(e -> {
            onKeyPressed(ctrl.inferKeyCode(btn.getText()));
        });
    }

    private void onKeyTouchRelease(Button btn) {
        KeyboardCtrl ctrl = mainGooey.getController(KeyboardCtrl.class);
        btn.setOnTouchPressed(e -> {
            onKeyReleased(ctrl.inferKeyCode(btn.getText()));
        });
    }
    */
}