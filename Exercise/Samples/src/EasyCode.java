import java.util.ArrayList;
import java.util.List;

public class EasyCode {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();

        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Pappaya");
        fruitsList.add("Grapes");

        System.out.println("fruitsList: "+ fruitsList);
        //updatinng the third element to orange
        System.out.println(fruitsList.set(2,"Orange"));
        System.out.println(fruitsList);
    }
}
