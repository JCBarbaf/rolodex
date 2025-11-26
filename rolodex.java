
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
            String contactPhone = GetPhone(scanner);
            String contactEmail = GetEmail(scanner);
            System.out.println(contactName + "," + contactPhone + "," + contactEmail);
            System.out.print("\nDo you want to add another contact?(Y,n) ");
            String action = scanner.nextLine();
            if (action.toLowerCase().equals("n") || action.toLowerCase().equals("no")) {
                repeat = false;
            }
        }
        System.out.println("\nGoodbye! ^_^");
        scanner.close();
    }

    public static String GetEmail(Scanner scanner) {
        boolean repeat = true;
        String contactEmail = "";
        while (repeat) {
            System.out.print("-> Contact's email: ");
            contactEmail = scanner.nextLine();
            if (contactEmail.matches("^[\\w.!#$%&'*+/=?`{|}~^-]+@[\\w.-]+$")) {
                repeat = false;
            } else {
                System.out.println("X_X Error: Invalid email");
            }
            
        }
        return contactEmail;
    }

    public static String GetPhone(Scanner scanner) {
        boolean repeat = true;
        String contactPhone = "";
        while (repeat) {
            System.out.print("-> Contact's Phone number: ");
            contactPhone = scanner.nextLine();
            contactPhone = contactPhone.replace(" ", "");
            if (contactPhone.matches("^\\+?[1-9][0-9]{7,14}$")) {
                repeat = false;
            } else {
                System.out.println("X_X Error: Invalid phone number");
            }
            
        }
        return contactPhone;
    }
}