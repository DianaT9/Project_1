package model;

import java.util.Random;

/**
 * A class that describes a model.User Model on a Social Media Platform
 */
public class User {

    /**
     * A randomly generated user identifier
     */
    private final int id;

    /**
     * Full name of the user
     */
    private String name;

    /**
     * Optional - phone number for user
     */
    private String phone;

    /**
     * User email
     */
    private String email;

    /**
     * Creates a new {@link User} with provided name, email and a random ID.
     *
     * @param name  - model.User's pers. name
     * @param email - model.User's pers. email
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

    public void setName(String name) {
        this.name = name;
    }
}

