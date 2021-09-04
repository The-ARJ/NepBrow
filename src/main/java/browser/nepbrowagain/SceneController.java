package browser.nepbrowagain;

import javafx.fxml.FXML;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    @FXML
    JFXButton SignIN,SignUP,AlreadyHaveAccount,CreateNewAccount;

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void handlebutton1() throws IOException {
        SignUP.setOnAction(e ->{
            Alert pop = new Alert(Alert.AlertType.INFORMATION);
            pop.setTitle("Done");
            pop.setHeaderText("SignUp Successful,Click OK");
            pop.show();
        });
    }

    public void handlebutton2() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("registration.fxml"));
        Stage Window = (Stage) CreateNewAccount.getScene().getWindow();
        Window.setScene(new Scene(root));

    }


    public void handlebutton3() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage Window = (Stage) AlreadyHaveAccount.getScene().getWindow();
        Window.setScene(new Scene(root));

    }

    public void handlebutton4() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage Window = (Stage) SignIN.getScene().getWindow();
        Window.setScene(new Scene(root));

    }


}