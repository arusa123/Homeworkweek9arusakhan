/*Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
        Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
        else)*/

import java.util.HashSet;
import java.util.Iterator;

public class Programme8 {
    public static void main(String[] args) {
hashSet();
    }
    public static void hashSet(){
        //Hashset declaration
        HashSet <Integer> list = new HashSet<>();
        list.add(4);
        list.add(7);
        list.add(8);
        System.out.println(list);
        for (Integer number : list){
            System.out.println(number);
        }
        Iterator <Integer> list2 = list.iterator();
        while (list2.hasNext()){
            System.out.println(list2.next() + " ");
        }
    }
}
