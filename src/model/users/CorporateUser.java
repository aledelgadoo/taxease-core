package model.users;

/**
 * Represents a corporate client or SME (B2B).
 * <p>
 * This class extends the generic {@link User} to include business-specific details,
 * such as the Company Registration Number. It corresponds to the "TaxEase Pro" module
 * [cite_start]designed for SMEs[cite: 15, 44].
 * </p>
 */
public class CorporateUser extends User {
    private String companyRegNumber; // CIF or Registration Number

    public CorporateUser(String id, String name, String email, String companyRegNumber) {
        super(id, name, email);
        this.companyRegNumber = companyRegNumber;
                }
}
