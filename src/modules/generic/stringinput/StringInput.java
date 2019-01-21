package modules.generic.stringinput;

import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import sectionfx.Gooey;

public class StringInput {

    public static String display(String title, String message) {
        Gooey mainGooey = Gooey.create()
                .fromFXML("/modules/generic/stringinput/string-input.fxml")
                .withScreen(300, 130);

        Stage window = new Stage();
        window.setTitle(title);

        StringInputCtrl ctrl = mainGooey.getController(StringInputCtrl.class);
        ctrl.getMessageField().setText(message);
        ctrl.getCloseBtn().setOnAction(e -> window.close());

        mainGooey.getScreen().setOnKeyPressed(keyPress -> {
            if (keyPress.getCode() == KeyCode.ENTER) {
                window.close();
            }
        });

        window.setScene(mainGooey.getScreen());
        window.showAndWait();

        return ctrl.getInputField().getText();
    }
}
