package Testing;

public class TabTest {
    public static void main(String[] args) {
        String NewTab = "+button pressed";

        isplusbuttonpressed(NewTab);

    }

    static boolean isplusbuttonpressed(String newTab) {
        if(newTab.contains("+")){
            return true;
        }
        return false;
    }

}
