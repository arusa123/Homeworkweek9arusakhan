import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to retrieve an element (at a specified index) from a given
array list
 */
public class Programme6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number between 1 to 7 to retrieve names :");
        int x = scanner.nextInt();
        elements(x);
        scanner.close();
    }
    public static void elements(int a) {

        ArrayList<String> name = new ArrayList();
        name.add("Arusa");
        name.add("Shreya");
        name.add("Nikunja");
        name.add("Prayank");
        name.add("Nirmal");
        name.add("Rashmita");
        name.add("Sandeep");

        String alpha = name.get(a - 1); // this will start position of the number starting from 1
        System.out.println("The name on position " + a + " is " + alpha);
    }

}
