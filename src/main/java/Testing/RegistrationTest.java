package Testing;

public class RegistrationTest {

    public boolean UserRegister(String FullName, String uname, String Email, String password) {
        boolean result = true;
        if(FullName==null && uname == null && Email==null && password==null) {
            result = false;
        }
        return result;
    }

}

