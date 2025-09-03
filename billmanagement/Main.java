import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Bill Management System ---");
            System.out.println("1. Add Bill");
            System.out.println("2. View Bills");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: BillManager.addBill(sc); break;
                case 2: BillManager.viewBills(); break;
                case 3: System.out.println(" Exiting..."); break;
                default: System.out.println(" Invalid choice!");
            }
        } while (choice != 3);

        sc.close();
    }
}
