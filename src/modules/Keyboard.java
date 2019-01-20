package modules;

import ctrl.KeyboardCtrl;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.KeyboardConfig;
import modules.modals.StringInput;
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

        keyPressLogic(true);
        keyboardConfig = new KeyboardConfig(mainGooey.getController(KeyboardCtrl.class));

        for (Button btn : mainGooey.getController(KeyboardCtrl.class).getAllButtons()) {
            btn.setOnAction(e -> {
                String soundPath = StringInput.display("File", "Sound file path:");
                Sound sound = new Sound(soundPath);
                keyboardConfig.loadSoundToBtn(btn, sound);
            });


        }
    }

    // Flashing keys functionality
    private void keyPressLogic(boolean flag) {
        if (flag) {
            KeyboardCtrl ctrl = mainGooey.getController(KeyboardCtrl.class);

            // On press
            mainGooey.getScreen().setOnKeyPressed(keyPress -> {
                Button pressedBtn = ctrl.queryBtn(keyPress.getCode());
                if (pressedBtn != null) {
                    // Play sound
                    Sound sound = keyboardConfig.getKeySoundMap().get(keyPress.getCode());
                    if (sound != null)
                        sound.play();

                    // Pseudo animation
                    flashKey(pressedBtn);
                }
            });

            // On release
            mainGooey.getScreen().setOnKeyReleased(keyPress -> {
                Button pressedBtn = ctrl.queryBtn(keyPress.getCode());
                if (pressedBtn != null) {
                    flashKey(pressedBtn);
                }
            });
        }
    }
    private void flashKey(Button btn) {
        if (btn.getStyleClass().contains("unpressed")) {
            btn.getStyleClass().remove("unpressed");
            btn.getStyleClass().add("pressed");
        } else {
            btn.getStyleClass().remove("pressed");
            btn.getStyleClass().add("unpressed");
        }
    }
}
