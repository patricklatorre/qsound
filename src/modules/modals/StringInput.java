package modules.modals;

import javafx.stage.Stage;
import sectionfx.Gooey;

public class StringInput {

    public static String display(String title, String message) {
        Gooey mainGooey = Gooey.create()
                .fromFXML("/modules/modals/string-input.fxml")
                .withScreen(300, 130);

        Stage window = new Stage();
        window.setTitle(title);

        StringInputCtrl ctrl = mainGooey.getController(StringInputCtrl.class);
        ctrl.getMessageField().setText(message);
        ctrl.getCloseBtn().setOnAction(e -> window.close());

        window.setScene(mainGooey.getScreen());
        window.showAndWait();

        return ctrl.getInputField().getText();
    }
}
