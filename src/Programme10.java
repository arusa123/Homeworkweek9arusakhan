import java.util.ArrayList;
import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        stations();
    }

    public static void stations() {
        char s = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter station name in Zone 1: ");
        String name = scanner.nextLine().toLowerCase();
        if (name.equalsIgnoreCase("Aldgate")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Metropolitan");
            list.add("Circle");
            for (String tube : list) {
                System.out.println(tube);
            }

        } else if (name.equalsIgnoreCase("Aldgate East")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Hammersmith & City");
            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Angel")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northen");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Baker Street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");
            list.add("Circle");
            list.add("Hammersmith & City");
            list.add("Jubilee");
            list.add("Metropolitan");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Bank")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Central");
            list.add("DLR");
            list.add("Northern");
            list.add("Waterloo & City");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Barbican")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Metropolitan");
            list.add("Circle");
            list.add("Hammersmith & City");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Battersea")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northern");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Bayswater")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Circle");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Blackfriars")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Circle");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Bond Street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Central");
            list.add("jubilee");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Borough")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northern");
            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Cannon Street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Circle");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Chancery lane")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Central");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Charing Cross")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Baker loo");
            list.add("Northern");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Covent Garden")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Piccadily");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Edgware Road")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Elephant Castle")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");
            list.add("Northern");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Embankment")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");
            list.add("Circle");
            list.add("Northern");
            list.add("District");
            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Euston")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Victoria");
            list.add("Northern");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Euston Square")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Metropolitan");
            list.add("Circle");
            list.add("Hammersmith & City");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Farringdon")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Circle");
            list.add("Hammersmith & City");
            list.add("Metropolitan");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Gloucester Street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northern");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else if (name.equalsIgnoreCase("Green Park")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Jubilee");
            list.add("Piccadilly");
            list.add("Victoria");

            for (String tube : list) {
                System.out.println(tube);
            }
        } else
            System.out.println("Please enter another station's name");


    }
}

