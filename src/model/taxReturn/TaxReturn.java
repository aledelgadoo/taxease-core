package model.taxReturn;

import model.document.Document;
import model.users.User;

import java.util.ArrayList;
import java.util.List;


public class TaxReturn {
    private String id;
    private User taxpayer;
    private List<Document> documents;
    private TaxReturnEstatus status;
    private double totalTaxResult; // Positive = To Pay, Negative = To Refund

    public TaxReturn(String id, User taxpayer) {
        this.id = id;
        this.taxpayer = taxpayer;
        this.documents = new ArrayList<>();
        this.status = TaxReturnEstatus.DRAFT;
        this.totalTaxResult = 0.0;
    }

    public void addDocument(Document doc) {
        this.documents.add(doc);
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setTotalTaxResult(double result) {
        this.totalTaxResult = result;
    }

    public double getTotalTaxResult() {
        return totalTaxResult;
    }

    public void setStatus(TaxReturnEstatus status) {
        this.status = status;
    }

    public User getTaxpayer() {
        return taxpayer;
    }

    // Clean Code: Método descriptivo para imprimir el estado
    public String getSummary() {
        return "Tax Return for: " + taxpayer.getName() + " | Status: " + status;
    }

}
