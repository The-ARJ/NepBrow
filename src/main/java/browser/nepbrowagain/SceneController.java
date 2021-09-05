package browser.nepbrowagain;

import javafx.fxml.FXML;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    @FXML
    JFXButton SignIN,SignUP,AlreadyHaveAccount,CreateNewAccount;

    @FXML
    TextField UserName;

    @FXML
    PasswordField Password;

    @FXML
    Label LoginMessage;

    private Stage stage;
    private Scene scene;
    private Parent root;



    //SIGNUP/REGISTRATION BUTTON FUNCTION
    public void handlebutton1() throws IOException {
        SignUP.setOnAction(e ->{
            Alert pop = new Alert(Alert.AlertType.INFORMATION);
            pop.setTitle("Done");
            pop.setHeaderText("SignUp Successful,Click OK");
            pop.show();
        });
    }

    //Create New Account Function
    public void handlebutton2() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("registration.fxml"));
        Stage Window = (Stage) CreateNewAccount.getScene().getWindow();
        Window.setScene(new Scene(root));

    }


    //Already have account Function
    public void handlebutton3() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage Window = (Stage) AlreadyHaveAccount.getScene().getWindow();
        Window.setScene(new Scene(root));

    }

    //Sign In Function in User Login Window
    public void handlebutton4() throws IOException {
        Stage Window = (Stage) SignIN.getScene().getWindow();
        if (UserName.getText().isBlank()==true && Password.getText().isBlank()==true){
            LoginMessage.setText("Please Enter User Name And Password");
        }
        else if (UserName.getText().isBlank()==true){
            LoginMessage.setText(("Please Enter Your User Name"));
        }
        else if (Password.getText().isBlank()==true){
            LoginMessage.setText(("Please Enter Your Password"));
        }

//        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//        Window.setScene(new Scene(root));

    }


}