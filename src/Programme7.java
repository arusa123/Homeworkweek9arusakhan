/*Write a Java program to test if an array list is empty or not.*/

import java.util.ArrayList;

public class Programme7 {
    public static void main(String[] args) {
        carName();
    }
    public static void carName() {

        ArrayList<String> cars = new ArrayList();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mastang");
        cars.add("Honda");
        cars.add("Ford");


        if (cars.isEmpty()) {
            System.out.println("Arraylist is empty");
        } else {
            System.out.println("Arraylist is not empty");
        }

    }



}
