package browser.nepbrowagain;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class HelloApplication extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);

        primaryStage.setTitle("NepBrow");//title of web  browser
        primaryStage.getIcons().add(new Image("file:Resources/logo1.png"));//inserting icon image
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }

}
