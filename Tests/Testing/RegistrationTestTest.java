package Testing;

import org.junit.jupiter.api.Test;

import static Testing.RegistrationTest.isValidUserName;
import static org.junit.jupiter.api.Assertions.*;

class RegistrationTestTest {
    String userName="AayushRaj";
    String userName1="Aayush Raj";
    String userName2="Aayush@123";
    String userName3="Aayush_Raj";
    String userName4="Aayush/Raj";
    String userName5="Aayush#Raj";
    String userName6 =" ";
    @Test
    //first it should show answer with true /expected=false actual true
    public void shouldAnswerWithTrue(){
        assertTrue(isValidUserName(userName));
        assertTrue(isValidUserName(userName1));
        assertTrue(isValidUserName(userName2));
        assertTrue(isValidUserName(userName3));
        assertTrue(isValidUserName(userName4));
        assertTrue(isValidUserName(userName5));
        assertTrue(isValidUserName(userName6));
    }
    @Test
    //it should show answer false /expected=false actual true
    public void shouldAnswerWithFalse() {
        assertFalse(isValidUserName(userName1));
        assertFalse(isValidUserName(userName2));
        assertFalse(isValidUserName(userName3));
        assertFalse(isValidUserName(userName4));
        assertFalse(isValidUserName(userName5));
        assertFalse(isValidUserName(userName6));
    }
}

