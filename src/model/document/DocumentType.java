package model.document;

/**
 * Enumeration defining the specific types of documents the system can recognize.
 * <p>
 * Used to categorize documents as either income (e.g., PAYSLIP) or deductible
 * [cite_start]expenses (e.g., INVOICE, RECEIPT) for the deduction engine[cite: 50].
 * </p>
 */
public enum DocumentType {
    INVOICE,
    PAYSLIP,
    RECEIPT
}
