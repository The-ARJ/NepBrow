package browser.nepbrowagain;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage implements ActionListener {
    JFrame f;
    Font font1,font2,font3,font4;
    JPanel p;
    ImageIcon image,icon;
    JButton SignUp;

    LoginPage(){
        font1 = new Font("Cambria",Font.BOLD,50);
        font2 = new Font("Californian FB",Font.BOLD,10);
        font3 = new Font("Cambria",Font.PLAIN,20);
        font4 = new Font("Californian FB",Font.BOLD,20);

        icon = new ImageIcon("resource/icon.png");


        //JFrame
        f = new JFrame("Login Page");

        //JPanel
        p = new JPanel();


        //Login Credential
        JLabel Heading= new JLabel("Login Credential");
        Heading.setBounds(200,20,600,60);
        Heading.setFont(font1);
        Heading.setForeground(Color.WHITE);
        p.add(Heading);


        //User Icon
        JLabel UserIcon;
        ImageIcon user = new ImageIcon("resource/user.png");
        UserIcon = new JLabel("",user,JLabel.CENTER);
        UserIcon.setBounds(190,130,80,80);
        p.add(UserIcon);

        //username
        JLabel UserName = new JLabel("User Name");
        UserName.setFont(font2);
        UserName.setBounds(205,205,200,30);
        UserName.setForeground(Color.WHITE);
        p.add(UserName);

        //username text field
        JTextField UName = new JTextField();
        UName.setBounds(290,155,250,30);
        UName.setFont(font3);
        UName.setBackground(Color.lightGray);
        p.add(UName);

        //user password icon
        JLabel UserPass;
        ImageIcon pass = new ImageIcon("resource/pass.png");
        UserPass = new JLabel("",pass,JLabel.CENTER);
        UserPass.setBounds(190,240,80,80);
        p.add(UserPass);

        //user password label
        JLabel Password = new JLabel("Password");
        Password.setFont(font2);
        Password.setBounds(205,315,200,30);
        Password.setForeground(Color.WHITE);
        p.add(Password);

        //user password text field
        JPasswordField password = new JPasswordField();
        password.setBounds(290,260,250,30);
        password.setFont(font3);
        password.setBackground(Color.lightGray);
        p.add(password);

        //Login button
        JButton Login = new JButton("Login");
        Login.setBackground(Color.GREEN);
        Login.setForeground(Color.BLACK);
        Login.setBounds(290,350,100,40);
        Login.setFont(font4);
        p.add(Login);

        //Reset button
        JButton Reset = new JButton("Reset");
        Reset.setBackground(Color.ORANGE);
        Reset.setForeground(Color.BLACK);
        Reset.setBounds(440,350,100,40);
        Reset.setFont(font4);
        p.add(Reset);


        //signup label
        JLabel Account = new JLabel("Create New Account:");
        Account.setFont(font3);
        Account.setBounds(450,500,200,30);
        Account.setForeground(Color.CYAN);
        p.add(Account);

        //signup button
        SignUp = new JButton("Sign Up");
        SignUp.setBackground(Color.cyan);
        SignUp.setForeground(Color.BLACK);
        SignUp.setBounds(630,500,130,30);
        SignUp.setFont(font3);
        SignUp.addActionListener(this);
        p.add(SignUp);

        //background image
        JLabel background;
        image = new ImageIcon("resource/background.jpg");
        background = new JLabel("",image,JLabel.CENTER);
        background.setBounds(0,0,800,600);


        //setting up JPanel
        p.setBounds(0,0,800,600);
        p.setLayout(null);
        p.setVisible(true);
        p.add(background);
        f.add(p);

        //setting up JFrame
        f.setBounds(0,0,800,600);
        f.setIconImage(icon.getImage());
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);



    }

    public static void main(String[] args) {
        new LoginPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==SignUp){
            new RegistrationPage();
            f.dispose();
        }
    }
}
