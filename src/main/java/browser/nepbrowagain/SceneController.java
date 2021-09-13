package browser.nepbrowagain;


import javafx.fxml.FXML;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.IOException;
import java.sql.ResultSet;

// sceneController operations

public class SceneController {
    // defines buttons
    @FXML
    JFXButton SignIN,SignUP,AlreadyHaveAccount,CreateNewAccount;

    @FXML   // UserLogin
    TextField UserName;

    @FXML   // Registration
    TextField Full_Name,user_name,email;

    @FXML//password
    PasswordField Password,password;

    @FXML
    Label LoginMessage;// SignIn

    @FXML//signup
    Label signuplabel, signuplabel2;

    private Stage stage;
    private Scene scene;
    private Parent root;



    //SIGNUP/REGISTRATION BUTTON FUNCTION
    public void handlebutton1() throws IOException {


        //USER REGISTRATION AND SIGN UP BUTTON FUNCTIONS
        SignUP.setOnAction(e ->{
            String full_name = Full_Name.getText();
            String user_Name = user_name.getText();
            String user_email = email.getText();
            String user_password = password.getText();
            JDBC jdbc = new JDBC();

            // inserting value into tbl_registration
            if(!Full_Name.getText().isBlank() && !user_name.getText().isBlank() && !email.getText().isBlank() && !password.getText().isBlank()) {
                String sql = "Insert Into tbl_registration(FullName,UserName,Email,Password) Values('"+full_name+"','"+user_Name+"','"+user_email+"','"+user_password+"')";
                int ans = jdbc.insert(sql);
                if (ans>0) {
                    signuplabel.setVisible(false);
                    signuplabel2.setText("Sign Up Completed");
                    Full_Name.setText("");
                    user_name.setText("");
                    email.setText("");
                    password.setText("");

                }
            }

            else if(Full_Name.getText().isBlank() || user_name.getText().isBlank() || email.getText().isBlank() || password.getText().isBlank()) {
                signuplabel.setText("Please Enter all the Credentials");}
        });
    }




    //Create New Account Function
    public void handlebutton2() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("registration.fxml"));
        Stage Window = (Stage) CreateNewAccount.getScene().getWindow();
        Window.setScene(new Scene(root));

    }


    // having already account
    public void handlebutton3() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage Window = (Stage) AlreadyHaveAccount.getScene().getWindow();
        Window.setScene(new Scene(root));

    }

    //Sign In Function in User Login Window
    public void handlebutton4() throws IOException {
        JDBC jdbc = new JDBC();
        String userr_Name = UserName.getText();
        String userr_password = Password.getText();

        String verifyLogin ="Select count(1) FROM tbl_registration WHERE UserName = '"+userr_Name+"' AND Password = '"+userr_password+"'";

        try{
            ResultSet queryResult = jdbc.select(verifyLogin);
            while((queryResult.next())){
                if (queryResult.getInt(1)==1){
                    LoginMessage.setText("Login Successful"); // Login message display
                    Stage Window = (Stage) SignIN.getScene().getWindow();
                    Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
                    Window.setScene(new Scene(root));
                }
                else{
                    LoginMessage.setText("User Name or Password do not match");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }



        // checking function value weather the value is true or not
        if (UserName.getText().isBlank() && Password.getText().isBlank()){
            LoginMessage.setText("Please Enter User Name And Password");
        }
        else if (UserName.getText().isBlank()){
            LoginMessage.setText(("Please Enter Your User Name"));
        }
        else if (Password.getText().isBlank()){
            LoginMessage.setText(("Please Enter Your Password"));
        }



    }


}