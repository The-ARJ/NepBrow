package Testing;

import org.junit.jupiter.api.Test;

import static Testing.historyTest.historySaved;
import static org.junit.jupiter.api.Assertions.*;

class historyTestTest {
    String File1 = ".com";
    String File2 = ".org";
    String File3 = ".edu";

    @Test
    //expecting result False
    public void LinkInsertFalse() {
        assertFalse(historySaved(File1));
        assertFalse(historySaved(File2));
        assertFalse(historySaved(File3));
    }



    @Test
    //expecting result True
    public void LinkInsertTrue() {
        assertTrue(historySaved(File1));
        assertTrue(historySaved(File2));
        assertTrue(historySaved(File3));
    }
}