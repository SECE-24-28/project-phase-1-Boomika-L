import java.io.*;
import java.util.Scanner;

public class BillManager {
    static final String FILE_NAME = "bills.txt";

   
    public static void addBill(Scanner sc) {
        try {
            System.out.print("Enter Bill ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            Bill bill = new Bill(id, name, amount);

            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(bill.toString() + "\n");
            fw.close();

            System.out.println(" Bill Added!");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    
    public static void viewBills() {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                System.out.println(" No bills found!");
                return;
            }

            Scanner fs = new Scanner(file);
            System.out.println("\n--- Bills List ---");
            while (fs.hasNextLine()) {
                String line = fs.nextLine();
                String[] data = line.split(",");
                System.out.println("Bill ID: " + data[0] +
                                   ", Name: " + data[1] +
                                   ", Amount: " + data[2]);
            }
            fs.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
