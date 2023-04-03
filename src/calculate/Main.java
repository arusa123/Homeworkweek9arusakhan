package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    static int a, b;
    static char symbol;
    static char choice;

    public static void main(String[] args) {
        //scanner to read input from console
        Scanner scanner = new Scanner(System.in);
        print();         //static method calling
        Main obj = new Main();        //object creation
        obj.calculateResult(a, b, symbol);          //calling parent class
        System.out.println("Would you like to do more calculation, Please enter  " + "\"Y\"" + "or" + "\"N\"");
        choice = scanner.next().charAt(0);
        while (choice == 'Y' || choice == 'y') {
            print();
            obj.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation, Please enter  " + "\"Y\"" + "or" + "\"N\"");
            choice = scanner.next().charAt(0);
        }
        System.out.println("End of calculator: ");
        System.exit(0);  // it will terminate the programme if "N is entered
        scanner.close();
    }

    public static void print() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = scanner.nextInt();
        System.out.println("Enter second number ");
        int b = scanner.nextInt();
        System.out.println("Enter one of symbol");
        char symbol = scanner.next().charAt(0);
    }


}