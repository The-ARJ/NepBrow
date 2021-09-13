package Testing;

public class SearchTest {
    public static void main(String[] args) {
        String SearchBox = " ";

        isSearchboxempty(SearchBox);

    }

    static boolean isSearchboxempty(String searchBox) {
        if(searchBox.contains(" ")){
            return false;
        }
        return true;
    }

}
