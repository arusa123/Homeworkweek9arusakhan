/*Create a HashMap object called people that will store String keys and Integer
        values: And use for each loop to iterate the value from Map.*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Programme9 {
    public static void main(String[] args) {
hashMap();
    }
    public static void hashMap(){
        Map<String , Integer> map = new HashMap<>();
        map.put("Charlie", 27);
        map.put("Kam", 29);
        map.put("Ayesha", 18);

        for (Map.Entry<String, Integer> details : map.entrySet()){
            System.out.println(details.getKey() + " " + details.getValue());
        }
        //iterator by iterator
        Iterator<Map.Entry<String, Integer>> details1 = map.entrySet().iterator();
        while (details1.hasNext()){
            System.out.print(details1.next() + " ");
        }
    }
}
