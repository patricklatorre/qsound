package modules.generic.okaypop;

import javafx.stage.Modality;
import javafx.stage.Stage;
import sectionfx.Gooey;

public class OkayPop
{
	static Stage window = null;
	static String style = ""; /* TODO: Set style of okaypop to app theme */

	public static Stage pop(String title, String message, String btnLabel) {
		window = new Stage();
		window.setTitle(title);
		window.initModality(Modality.APPLICATION_MODAL);

		Gooey section = Gooey.create()
				.fromFXML("/modules/generic/okaypop/Okaypop.fxml")
				.withScreen(400, 150);

		OkayPopCtrl ctrl = section.getController(OkayPopCtrl.class);

		ctrl.getMainPane().setStyle(style);
		ctrl.getMsg().setText(message);
		ctrl.getBtn().setText(btnLabel);
		ctrl.getBtn().setOnAction(e -> window.close());


		window.setScene(section.getScreen());
		window.showAndWait();

		return window;
	}

	public static void setStyle(String cssPath) {
		style = cssPath;
	}
}
