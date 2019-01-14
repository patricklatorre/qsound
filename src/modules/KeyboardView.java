package modules;

import ctrl.KeyboardCtrl;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sectionfx.Gooey;
import sectionfx.GooeyJob;

public class KeyboardView extends GooeyJob {

    @Override
    public void create() {
        window = new Stage();
        mainGooey = Gooey.create()
                .fromFXML("/view/keyboard-layout.fxml")
                .withScreen(900, 400);

        setKeyFlashing(true);
    }


    private void setKeyFlashing(boolean flag) {
        if (flag) {
            KeyboardCtrl ctrl = mainGooey.getController(KeyboardCtrl.class);

            // On press
            mainGooey.getScreen().setOnKeyPressed(keyPress -> {
                Button pressedBtn = ctrl.queryBtn(keyPress.getCode());
                if (pressedBtn != null)
                    flashKey(pressedBtn);
            });

            // On release
            mainGooey.getScreen().setOnKeyReleased(keyPress -> {
                Button pressedBtn = ctrl.queryBtn(keyPress.getCode());
                if (pressedBtn != null)
                    flashKey(pressedBtn);
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
