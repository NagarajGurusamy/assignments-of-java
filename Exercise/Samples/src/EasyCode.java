import java.util.ArrayList;
import java.util.List;

public class EasyCode {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();

        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Pappaya");
        fruitsList.add("Grapes");

        if (fruitsList.contains("Apple")) {
            System.out.println("The fruit was founded");
        } else {
            System.out.println("Fruit was not available");
        }

    }
}
