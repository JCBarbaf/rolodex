
import java.util.Scanner;

public class rolodex {
    public static void main(String[] args) {
        boolean repeat = true;
        System.out.println("Wellcome to rolodex");
        Scanner scanner = new Scanner(System.in);
        while (repeat) { 
            System.out.println("--- Add new contact ---");
            System.out.print("-> Contact's name: ");
            String contactName = scanner.nextLine();
            System.out.print("-> Contact's phone number: ");
            String contactPhone = scanner.nextLine();
            System.out.print("-> Contact's email: ");
            String contactEmail = scanner.nextLine();
            System.out.println(contactName + "," + contactPhone + "," + contactEmail);
            System.out.print("Do you want to add another contact?(Y,n) ");
            String action = scanner.nextLine();
            if (action.toLowerCase().equals("n") || action.toLowerCase().equals("no")) {
                repeat = false;
            }
        }
        System.out.println("Goodbye! ^_^");
        scanner.close();
    }
}