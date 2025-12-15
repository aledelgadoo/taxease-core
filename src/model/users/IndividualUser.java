package model.users;

/**
 * Represents an individual taxpayer (B2C client).
 * <p>
 * This class extends the generic {@link User} to include specific identification
 * for natural persons, such as the personal Tax ID (e.g., DNI or Social Security Number).
 * [cite_start]It corresponds to the "TaxEase Personal" module described in the project dossier[cite: 15, 42].
 * </p>
 */
public class IndividualUser extends User {
    private String taxId;

    public IndividualUser(String id, String name, String email, String taxId) {
        super(id, name, email);
        this.taxId = taxId;
    }

    public String getTaxId() {
        return taxId;
        }
}
