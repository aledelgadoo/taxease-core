package service;
import model.Document;
import model.DocumentType;

import java.time.LocalDate;
import java.util.Random;

public class OcrService {
    /**
     * Simulates the AI extraction process described in the dossier.
     * It takes a filename and "extracts" structured data.
     */
    public Document extractData(String filename) {
        System.out.println(">> AI Scanning document: " + filename + "...");

        // Simulate processing time (optional, for effect)
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Simple logic to simulate recognition based on filename
        String lowerName = filename.toLowerCase();
        DocumentType type;
        double amount;

        if (lowerName.contains("payslip") || lowerName.contains("nomina")) {
            type = DocumentType.PAYSLIP;
            amount = 2500.00; // Mocked salary
        } else if (lowerName.contains("bill") || lowerName.contains("factura")) {
            type = DocumentType.INVOICE;
            amount = generateRandomAmount(100, 500);
        } else {
            type = DocumentType.RECEIPT;
            amount = generateRandomAmount(10, 50);
        }

        // We assume the AI detects today's date for simplicity
        return new Document(filename, type, amount, LocalDate.now());
    }

    // Helper method to generate realistic random numbers for the demo
    private double generateRandomAmount(double min, double max) {
        Random r = new Random();
        double randomValue = min + (max - min) * r.nextDouble();
        return Math.round(randomValue * 100.0) / 100.0; // Round to 2 decimals
    }
}
