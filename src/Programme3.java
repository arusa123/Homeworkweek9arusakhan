/*Write a Java program to reverse an array of integer values.*/

public class Programme3 {
    public static void main(String[] args) {
        reverseArray();
    }



    public static void reverseArray(){
        int[] array = {10,20,30,40,50,60};
        System.out.println("Original array");
        for (int i = 0; i<array.length;i++)
            System.out.print(array[i] + " ");
            System.out.println();
            System.out.println("Reverse array");
            for (int i = array.length-1; i>=0; i--)
        System.out.print(array[i]+ " ");
        }


    }


