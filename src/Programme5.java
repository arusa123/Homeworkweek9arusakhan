/*Write a Java program to iterate through all elements in an array list using
Iterater. */

import java.util.ArrayList;
import java.util.Iterator;

public class Programme5 {
    public static void main(String[] args) {
iterator();
    }
    public static void iterator(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
