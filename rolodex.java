
import java.util.Scanner;

public class rolodex {
    public static void main(String[] args) {
        boolean repeat = true;
        System.out.println("Wellcome to rolodex");
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("-> Contact's name: ");
        String contactName = scanner.nextLine();
        System.out.print("-> Contact's phone number: ");
        String contactPhone = scanner.nextLine();
        System.out.print("-> Contact's email: ");
        String contactEmail = scanner.nextLine();
        scanner.close();
        System.out.println(contactName + "," + contactPhone + "," + contactEmail);
    }
}