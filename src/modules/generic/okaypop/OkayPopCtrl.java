package modules.generic.okaypop;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import sectionfx.GooeyController;

public class OkayPopCtrl extends GooeyController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private GridPane mainPane;

	@FXML
	private Label msg;

	@FXML
	private Button btn;

	@FXML
	void initialize() {
		assert mainPane != null : "fx:id=\"mainPane\" was not injected: check your FXML file 'OkayPop.fxml'.";
		assert msg != null : "fx:id=\"msg\" was not injected: check your FXML file 'OkayPop.fxml'.";
		assert btn != null : "fx:id=\"btn\" was not injected: check your FXML file 'OkayPop.fxml'.";

	}

	public ResourceBundle getResources() {
		return resources;
	}

	public void setResources(ResourceBundle resources) {
		this.resources = resources;
	}

	public URL getLocation() {
		return location;
	}

	public void setLocation(URL location) {
		this.location = location;
	}

	public GridPane getMainPane() {
		return mainPane;
	}

	public void setMainPane(GridPane mainPane) {
		this.mainPane = mainPane;
	}

	public Label getMsg() {
		return msg;
	}

	public void setMsg(Label msg) {
		this.msg = msg;
	}

	public Button getBtn() {
		return btn;
	}

	public void setBtn(Button btn) {
		this.btn = btn;
	}
}
