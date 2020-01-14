import java.util.Random;

/**
 * A class that describes a User Model on a Social Media Platform
 */
public class User {

    private int id;

    private String name;

    private String phone;

    private String email;

    /**
     * Creates a new {@link User} with provided name, email and a random ID.
     *
     * @param name  - User's personal name
     * @param email - User's personal email
     */
    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = new Random().nextInt();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

