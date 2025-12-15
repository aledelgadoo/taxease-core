package model.users;

/**
 * Abstract base class representing a generic user of the TaxEase platform.
 * <p>
 * It serves as the foundation for both individual (B2C) and corporate (B2B) profiles,
 * storing common attributes such as the unique ID, name, and email address.
 * </p>
 */
public abstract class User {
    private String id;
    private String name;
    private String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " (" + email+")";
    }

}
