package model.document;

import java.time.LocalDate;

/**
 * Represents a financial document (e.g., invoice, payslip) scanned by the user.
 * <p>
 * This class stores the data extracted by the OCR engine, including the document type,
 * monetary amount, and date. [cite_start]It is the fundamental unit used for tax calculations[cite: 48].
 * </p>
 */
public class Document {
    private String id;
    private DocumentType type;
    private double amount;
    private LocalDate date;

    public Document(String id, DocumentType type, double amount, LocalDate date) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public DocumentType getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + ": $" + amount + " (" + date + ")";
    }

}
