package browser.nepbrowagain;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationPage implements ActionListener {
    JFrame f;
    Font font1,font2,font3,font4,font5;
    JPanel p;
    ImageIcon image,icon;
    JButton Btn_SignUp,Login;
    JTextField UFName,ULName,address,emailadd;
    JPasswordField password,Cpassword;

    RegistrationPage(){
        font1 = new Font("Cambria",Font.BOLD,50);
        font2 = new Font("Cambria",Font.BOLD,20);
        font3 = new Font("Cambria",Font.PLAIN,15);
        font4 = new Font("Californian FB",Font.BOLD,20);
        font5 = new Font("Cambria",Font.PLAIN,15);


        icon = new ImageIcon("resources/browser.png");


        //JFrame
        f = new JFrame("USER SIGN UP");

        //JPanel
        p = new JPanel();


        //Login Credential
        JLabel Heading= new JLabel("USER SIGN UP");
        Heading.setBounds(150,20,600,60);
        Heading.setFont(font1);
        Heading.setForeground(Color.WHITE);
        p.add(Heading);



        //username
        JLabel UserFName = new JLabel("First Name");
        UserFName.setFont(font2);
        UserFName.setBounds(100,150,200,30);
        UserFName.setForeground(Color.WHITE);
        p.add(UserFName);

        JLabel UserLName = new JLabel("Last Name");
        UserLName.setFont(font2);
        UserLName.setBounds(380,150,200,30);
        UserLName.setForeground(Color.WHITE);
        p.add(UserLName);

        JLabel UserAddress = new JLabel("Address");
        UserAddress.setFont(font2);
        UserAddress.setBounds(100,200,200,30);
        UserAddress.setForeground(Color.WHITE);
        p.add(UserAddress);

        JLabel Useremail = new JLabel("Email");
        Useremail.setFont(font2);
        Useremail.setBounds(100,250,200,30);
        Useremail.setForeground(Color.WHITE);
        p.add(Useremail);

        //userFirstname text field
        UFName = new JTextField();
        UFName.setBounds(230,150,120,30);
        UFName.setFont(font3);
        UFName.setBackground(Color.lightGray);
        p.add(UFName);


        //user last name text field
        ULName = new JTextField();
        ULName.setBounds(500,150,120,30);
        ULName.setFont(font3);
        ULName.setBackground(Color.lightGray);
        p.add(ULName);



        //user address text field
        address = new JTextField();
        address.setBounds(230,200,250,30);
        address.setFont(font3);
        address.setBackground(Color.lightGray);
        p.add(address);

        //user email address text field
        emailadd = new JTextField();
        emailadd.setBounds(230,250,250,30);
        emailadd.setFont(font3);
        emailadd.setBackground(Color.lightGray);
        p.add(emailadd);

        //user password label
        JLabel Password = new JLabel("Password");
        Password.setFont(font2);
        Password.setBounds(100,300,200,30);
        Password.setForeground(Color.WHITE);
        p.add(Password);

        //user confirm password label
        JLabel CPassword = new JLabel("Confirm Password");
        CPassword.setFont(font5);
        CPassword.setBounds(100,350,200,30);
        CPassword.setForeground(Color.WHITE);
        p.add(CPassword);

        //user password text field
        password = new JPasswordField();
        password.setBounds(230,300,250,30);
        password.setFont(font3);
        password.setBackground(Color.lightGray);
        p.add(password);

        //user confirm password text field
        Cpassword = new JPasswordField();
        Cpassword.setBounds(230,350,250,30);
        Cpassword.setFont(font3);
        Cpassword.setBackground(Color.lightGray);
        p.add(Cpassword);


        //Login button
        Btn_SignUp = new JButton("Sign Up");
        Btn_SignUp.setBackground(Color.GREEN);
        Btn_SignUp.setForeground(Color.BLACK);
        Btn_SignUp.setBounds(230,400,110,40);
        Btn_SignUp.addActionListener(this);
        Btn_SignUp.setFont(font2);
        p.add(Btn_SignUp);

        //Reset button
        JButton Reset = new JButton("Reset");
        Reset.setBackground(Color.ORANGE);
        Reset.setForeground(Color.BLACK);
        Reset.setBounds(380,400,100,40);
        Reset.setFont(font4);
        p.add(Reset);


        //signup label
        JLabel Account = new JLabel("Already Have Account:");
        Account.setFont(font3);
        Account.setBounds(600,250,200,30);
        Account.setForeground(Color.GREEN);
        p.add(Account);

        //signup button
        Login = new JButton("Login");
        Login.setBackground(Color.cyan);
        Login.setForeground(Color.BLACK);
        Login.setBounds(600,290,130,30);
        Login.setFont(font3);
        Login.addActionListener(this);
        p.add(Login);

        //background image
        JLabel background;
        image = new ImageIcon("resources/registrationgif.gif");
        background = new JLabel("",image,JLabel.CENTER);
        background.setBounds(0,0,600,600);


        //setting up JPanel
        p.setBounds(0,0,600,600);
        p.setLayout(null);
        p.setVisible(true);
        p.add(background);
        f.add(p);

        //setting up JFrame
        f.setBounds(0,0,600,600);
        f.setIconImage(icon.getImage());
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);



    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String FirstName = UFName.getText();
        String LastName = ULName.getText();
        String Address = address.getText();
        String email = emailadd.getText();


        if(e.getSource()==Login){
            new LoginPage();
            f.dispose();
        }
        if(e.getSource()==Btn_SignUp){
            System.out.println("Button Pressed");
            JDBC db = new JDBC();
            String query = "insert into register(first name,last name,address,email) values('"+FirstName+"','"+LastName+"','"+Address+"','"+email+"')";

            }
        }

    public static void main(String[] args) {
        new RegistrationPage();
    }
}
