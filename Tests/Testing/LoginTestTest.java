package Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTestTest {
        @Test
        void test() {
            String user = "Aayush";
            String psw = "123";
            LoginTest log = new LoginTest();
            log.userLogin(user,psw);
            Boolean result = log.userLogin(user, psw);

            assertEquals(true,result);
        }

}
