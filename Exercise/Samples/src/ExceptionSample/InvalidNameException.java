package ExceptionSample;
import java.util.Scanner;

public class InvalidNameException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first and last name: ");
        String name = sc.nextLine().trim();

        try {
            if(!name.contains(" ")) {
                throw new Exception("Error: Please enter first and last name with a space.");
            }
            System.out.println("Valid name: " + name);
            String[] parts = name.split(" ");

            if (parts.length != 2) {
                throw new Exception("Error: Enter only first and last name (not more).");
            }

            String first = parts[0];
            String last = parts[1];

            if (!first.matches("[A-Za-z]+") || !last.matches("[A-Za-z]+")) {
                throw new Exception("Error: Name must contain alphabets only.");
            }

            if (!Character.isUpperCase(first.charAt(0)) || !Character.isUpperCase(last.charAt(0))) {
                throw new Exception("Error: First letter of first and last name must be capital.");
            }
            System.out.println("Valid name: " + first + " " + last);

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Name validation process finished.");
        }
    }
}