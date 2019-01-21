package modules.generic.stringinput;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import sectionfx.GooeyController;

public class StringInputCtrl extends GooeyController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private VBox mainPane;

    @FXML
    private Label messageField;

    @FXML
    private TextField inputField;

    @FXML
    private Button closeBtn;

    @FXML
    void initialize() {

    }

    public VBox getMainPane() {
        return mainPane;
    }

    public Label getMessageField() {
        return messageField;
    }

    public TextField getInputField() {
        return inputField;
    }

    public Button getCloseBtn() {
        return closeBtn;
    }
}
