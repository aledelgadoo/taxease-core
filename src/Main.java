import model.document.Document;
import model.taxReturn.TaxReturn;
import model.users.IndividualUser;
import model.users.User;
import service.OcrService;
import service.TaxCalculator;

import java.util.Scanner;

/**
 * Entry point of the TaxEase application (Lite Version).
 * <p>
 * This class provides a Command Line Interface (CLI) to demonstrate the core functionality
 * required for the project assessment. It handles the user flow: logging in, simulating
 * [cite_start]document scanning, and triggering the tax calculation engine[cite: 371].
 * </p>
 */
public class Main {
    public static void main(String[] args) {
        // Services initialization
        OcrService ocrService = new OcrService();
        TaxCalculator taxCalculator = new TaxCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   Welcome to TaxEase (CLI Version 1.0)   ");
        System.out.println("==========================================");

        // 1. Create a User (Simulating Login)
        // Using the B2C profile as described in the dossier
        User currentUser = new IndividualUser("U001", "Ana Garcia", "ana@example.com", "12345678Z");
        System.out.println(">> Logged in as: " + currentUser.getName());

        // 2. Create a new Tax Return Draft
        TaxReturn myTaxReturn = new TaxReturn("TR-2025-001", currentUser);
        System.out.println(">> Created new Tax Return Draft.");

        // 3. Simple Menu Loop
        boolean running = true;
        while (running) {
            System.out.println("\nSelect an action:");
            System.out.println("1. Scan Document (Simulate OCR)");
            System.out.println("2. Calculate Tax (Deduction Engine)");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("> ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Enter filename (e.g., 'lunch_bill.jpg' or 'june_payslip.pdf'): ");
                    String filename = scanner.nextLine();

                    // Use the Service to extract data
                    Document doc = ocrService.extractData(filename);

                    // Add to the model
                    myTaxReturn.addDocument(doc);
                    System.out.println(">> Added: " + doc);
                    break;

                case "2":
                    // Calculate Logic
                    taxCalculator.calculateTax(myTaxReturn);
                    System.out.println(">> Tax calculation updated based on current documents.");
                    break;

                case "3":
                    // Show results
                    System.out.println("------------------------------------------");
                    System.out.println(myTaxReturn.getSummary());
                    System.out.println("Total Documents: " + myTaxReturn.getDocuments().size());
                    System.out.println("ESTIMATED TAX: " + myTaxReturn.getTotalTaxResult() + "€");
                    System.out.println("------------------------------------------");
                    break;

                case "4":
                    running = false;
                    System.out.println("Exiting TaxEase...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
