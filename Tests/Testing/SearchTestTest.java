package Testing;

import org.junit.jupiter.api.Test;

import static Testing.SearchTest.isSearchboxempty;
import static org.junit.jupiter.api.Assertions.*;

class SearchTestTest {
    String searchbox1=" ";
    String searchbox2="something";

    @Test
    //Should give false whileasserting true
    public void shouldempty(){
        assertTrue(isSearchboxempty(searchbox1));
    }

    @Test
    //Should give true while asserting false
    public void shouldbeempty(){
        assertFalse(isSearchboxempty(searchbox1));
    }
    @Test
    //Should give true while asserting true
    public void shouldnotempty(){
        assertTrue(isSearchboxempty(searchbox2));
    }
    @Test
    //Should give false while asserting false
    public void shouldnotbeempty(){
        assertFalse(isSearchboxempty(searchbox2));
    }

}