import javafx.application.Application;
import javafx.stage.Stage;
import modules.KeyboardView;

public class Driver extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        KeyboardView kbView = new KeyboardView();

        primaryStage = kbView.getWindow();
        primaryStage.showAndWait();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
