import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EasyCode {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();

        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Pappaya");
        fruitsList.add("Grapes");

        System.out.println("Before Sorting the List of fruits"+fruitsList);
        Collections.sort(fruitsList);
        System.out.println("After Sorting the List of fruits"+ fruitsList);

    }
}
