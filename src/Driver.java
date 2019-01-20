import javafx.application.Application;
import javafx.stage.Stage;
import modules.Keyboard;

public class Driver extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Keyboard kbView = new Keyboard();

        primaryStage = kbView.getWindow();
        primaryStage.showAndWait();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
