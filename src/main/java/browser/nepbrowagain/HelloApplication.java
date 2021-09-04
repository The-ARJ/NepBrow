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
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("NepBrow");//title of browser
        stage.getIcons().add(new Image("file:Resources/browser.png"));
        stage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }

}
