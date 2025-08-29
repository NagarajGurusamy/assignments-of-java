import java.util.ArrayList;
import java.util.List;

public class RetriveElement {
    public static void main(String[] args) {
        List<String> boxString = new ArrayList<>();

        boxString.add("pencil");
        boxString.add("eraser");
        boxString.add("Sharpner");
        boxString.add("Scale");

        System.out.println("box_Sring: "+boxString);
        System.out.println("Third Element: " + boxString.get(2));
        System.out.println("First Element: " + boxString.get(0));
    }
}
