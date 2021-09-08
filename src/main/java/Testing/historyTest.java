package Testing;

public class historyTest {
    public static void main(String[] args) {
        String file = ".com .org .edu";//file type

        historySaved(file);
    }

    static boolean historySaved(String file) {
        if(file.contains(".com")||file.contains(".org")||file.contains(".edu")){
            return true;
        }
        return false;
    }
}
