/*Declare following two arrylist and compare it.

        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");*/

import java.util.ArrayList;

public class Programme11 {

    public static void main(String[] args) {

        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        if (c1.equals(c2)){
            System.out.println("c1 and c2 are equal ");
        } else {
            System.out.println("c1 and c2 are not equal");
        }
    }
}
