
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class rolodex {
    public static void main(String[] args) {
        boolean repeat = true;
        System.out.println("\nWellcome to rolodex");
        File csvFile = new File("rolodex.csv");
        if (!csvFile.exists()) {
            System.out.println("\n-> No CSV file detected. Creating a new CSV file.");
            try {
                csvFile.createNewFile();
                System.out.println("CSV file created! ^_^");
            } catch (Exception e) {
                System.out.println("Error creating the file: " + e.getMessage());
            }
        }
        Scanner scanner = new Scanner(System.in);
        while (repeat) { 
            System.out.println("\n--- Add new contact ---");
            System.out.print("-> Contact's name: ");
            String contactName = scanner.nextLine();
            String contactPhone = GetPhone(scanner);
            String contactEmail = GetEmail(scanner);
            try {
                Scanner reader = new Scanner(csvFile);
                String fileContent = reader.nextLine();
                while (reader.hasNextLine()) {
                    fileContent += "\n" + reader.nextLine();
                }
                reader.close();
                FileWriter myWriter = new FileWriter("rolodex.csv");
                fileContent += "\n" + contactName + "," + contactPhone + "," + contactEmail;
                myWriter.write(fileContent);
                myWriter.close();
                System.out.println("\nContact added successfully! ^_^");
            } catch (Exception e) {
                System.out.println("Error adding contact: " + e.getMessage());
            }
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