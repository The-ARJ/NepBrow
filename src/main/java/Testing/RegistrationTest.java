package Testing;

import java.nio.file.attribute.UserPrincipal;

public class RegistrationTest {

    public static void main(String[]args){
        String userName=("AayushRaj");


        isValidUserName(userName);


    }

    static boolean isValidUserName(String userName) {
        if(userName.contains("/")||userName.contains("#")|| userName.contains(" ")||userName.contains("_")||userName.contains("@")){
            return false;
        }
        return true;
    }

}

