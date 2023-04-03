import java.util.ArrayList;

/*Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.*/
public class Programme4 {
    public static void main(String[] args) {
        Programme4 obj = new Programme4();
        obj.arraList();
    }

    public void arraList(){
        //Arraylist
        ArrayList<String> colours = new ArrayList();
        colours.add("Black");
        colours.add("Blue");
        colours.add("Red");
        colours.add("White");
        colours.add("Purple");
        for ( String colourName : colours  ) {
            System.out.println(colourName);
        }
        }
    }




