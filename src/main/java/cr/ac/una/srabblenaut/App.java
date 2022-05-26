package cr.ac.una.srabblenaut;

import cr.ac.una.srabblenaut.util.FlowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FlowController.getInstance().goViewInWindow("inicioView");
        
    }

    public static void main(String[] args) {
        launch();
    }

}