package browser.nepbrowagain;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class HelloApplication extends Application {



    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        // name of  browser
        stage.setTitle("NepBrow");
        stage.getIcons().add(new Image("file:Resources/browser.png"));
        stage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }

}
