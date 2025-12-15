package service;

import model.document.Document;
import model.document.DocumentType;
import model.taxReturn.TaxReturn;
import model.taxReturn.TaxReturnEstatus;

/**
 * Service responsible for the business logic of tax calculation and deduction optimization.
 * <p>
 * It processes all documents within a {@link taxease.model.TaxReturn}, separates income from
 * [cite_start]deductible expenses, and computes the final tax liability based on a simplified tax rate[cite: 50].
 * </p>
 */
public class TaxCalculator {

    private static final double TAX_RATE = 0.15; // Flat tax rate of 15% for this example

    public void calculateTax(TaxReturn taxReturn) {
        double totalIncome = 0;
        double totalDeductibleExpenses = 0;

        for (Document doc : taxReturn.getDocuments()) {
            if (doc.getType() == DocumentType.PAYSLIP) {
                totalIncome += doc.getAmount();
            } else {
                // We assume Invoices and Receipts are deductible expenses in this model
                totalDeductibleExpenses += doc.getAmount();
            }
        }

        // Logic: You pay taxes on (Income - Deductions)
        double taxableBase = totalIncome - totalDeductibleExpenses;

        // If expenses > income, base is 0 (you don't pay negative tax on base)
        if (taxableBase < 0) taxableBase = 0;

        double taxDue = taxableBase * TAX_RATE;

        // Clean Code: Update the object directly
        taxReturn.setTotalTaxResult(taxDue);
        taxReturn.setStatus(TaxReturnEstatus.PROCESSING);

        System.out.println(">> Calculation complete. Deductions applied: $" + totalDeductibleExpenses);
    }
}
