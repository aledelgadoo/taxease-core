package model.document;

import java.time.LocalDate;


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
