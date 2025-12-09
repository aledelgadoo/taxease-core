package model.users;

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
