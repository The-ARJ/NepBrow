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
    @FXML
    JFXButton SignIN,SignUP,AlreadyHaveAccount,CreateNewAccount;

    @FXML   // UserLogin
    TextField UserName;

    @FXML   // Registration
    TextField Full_Name,user_name,email;

    @FXML
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
        String full_name = Full_Name.getText();
        String user_Name = user_name.getText();
        String user_email = email.getText();
        String user_password = password.getText();



        //USER REGISTRATION AND SIGN UP BUTTON FUNCTIONS
        SignUP.setOnAction(e ->{
            System.out.println("Button pressed");
            JDBC jdbc = new JDBC();


            if(Full_Name.getText().isBlank()==true && user_name.getText().isBlank()==true && email.getText().isBlank()==true && password.getText().isBlank()==true) {
                signuplabel.setText("Please Enter Credentials");}


            if(Full_Name.getText().isBlank()==false && user_name.getText().isBlank()==false && email.getText().isBlank()==false && password.getText().isBlank()==false) {
                String sql = "Insert Into tbl_registration(FullName,UserName,Email,Password) Values('"+full_name+"','"+user_Name+"','"+user_email+"','"+user_password+"')";
                int ans = jdbc.insert(sql);
                if (ans>0) {
                    signuplabel.setVisible(false);
                    signuplabel2.setText("Sign Up Completed");


                }
            }
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




        if (UserName.getText().isBlank()==true && Password.getText().isBlank()==true){
            LoginMessage.setText("Please Enter User Name And Password");
        }
        else if (UserName.getText().isBlank()==true){
            LoginMessage.setText(("Please Enter Your User Name"));
        }
        else if (Password.getText().isBlank()==true){
            LoginMessage.setText(("Please Enter Your Password"));
        }



    }


}