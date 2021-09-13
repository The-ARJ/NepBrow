package Testing;

import org.junit.jupiter.api.Test;

import static Testing.TabTest.isplusbuttonpressed;
import static org.junit.jupiter.api.Assertions.*;

class TabTestTest {
    String newtab="+";

    @Test
    //expecting false
    public void newtabnotopen(){
        assertFalse(isplusbuttonpressed(newtab));
    }

    @Test
    //expecting true
    public void newtabopens(){
        assertTrue(isplusbuttonpressed(newtab));
    }
}