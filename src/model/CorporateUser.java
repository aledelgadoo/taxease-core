package model;

public class CorporateUser extends User {
    private String companyRegNumber; // CIF or Registration Number

    public CorporateUser(String id, String name, String email, String companyRegNumber) {
        super(id, name, email);
        this.companyRegNumber = companyRegNumber;
    }
}
