import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EasyCode {
    public static void main(String[] args) {
        List<String> fruitsList_1 = new ArrayList<String>();

        fruitsList_1.add("Apple");
        fruitsList_1.add("Banana");
        fruitsList_1.add("Pappaya");
        fruitsList_1.add("Grapes");
        System.out.println("\n Before Copy: ");
        System.out.println("fruitsList_1: "+fruitsList_1);

        List<String> fruitsList_2 = new ArrayList<String>();

        fruitsList_2.add("Orange");
        fruitsList_2.add("Dragonfruit");
        fruitsList_2.add("cherry");
        fruitsList_2.add("strawberry");
        System.out.println("fruitList_2: "+fruitsList_2);

        Collections.copy(fruitsList_1,fruitsList_2);
        System.out.println("\n After Copy: ");

        System.out.println("fruitsList_1: "+ fruitsList_1);
        System.out.println("fruitsList_2: "+ fruitsList_2);

    }
}