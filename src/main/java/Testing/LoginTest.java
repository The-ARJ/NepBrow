package Testing;

public class LoginTest {
        String UserName="Aayush";
        String UserPassword = "123";

        public boolean userLogin(String uname,String pass) {
            boolean result = false;
            if(uname==UserName && pass==UserPassword) {
                result = true;
            }
            return result;
        }

}
