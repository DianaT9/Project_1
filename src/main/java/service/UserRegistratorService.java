package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * A service class that is used to add/change or remove {@link User} data in the system
 */
public class UserRegistratorService {

    /**
     * A {@link List} of {@link User} data that is currently registered in the system
     */
    private List<User> users = new ArrayList<>();

    /**
     * Registers a new user in the system if it does not already exist
     *
     * @param name  - name of the user
     * @param email - email of the user
     * @return - generated user ID OR -1 if user already exists
     */
    public int registerUser(String name, String email) {
        if (findUser(email) != null) {
            System.out.println("User already exists!");
            return -1;
        }
        User user = new User(name, email);
        users.add(user);
        return user.getId();
    }

    /**
     * Registers a new user in the system if it does not already exist.
     *
     * @param name-  name of the user
     * @param email- email of the user
     * @param phone  - phone of the user
     * @return - generated user ID OR -1 if user already exists
     */
    public int registerUser(String name, String email, String phone) {
        if (findUser(email) != null) {
            System.out.println("User already exists!");
            return -1;
        }
        User user = new User(name, email);
        user.setPhone(phone);
        users.add(user);
        return user.getId();
    }

    /**
     * Updates User name for an existing user.
     *
     * @param email - email by which user is found
     * @param name  - new user name
     * @return - ID of updated user OR -1 if user not found
     */
    public int updateUserName(String email, String name) {
        User user = findUser(email);
        if (user != null) {
            users.remove(user);
            user.setName(name);
            users.add(user);
            return user.getId();
        }
        System.out.println("User not found");
        return -1;
    }

    /**
     * Updates phone for an existing user.
     *
     * @param email - email by which user is found
     * @param phone - new user phone
     * @return - ID of updated user OR -1 if user not found
     */
    public int updateUserPhone(String email, String phone) {
        User user = findUser(email);
        if (user != null) {
            users.remove(user);
            user.setPhone(phone);
            users.add(user);
            return user.getId();
        }
        System.out.println("User not found");
        return -1;
    }

    /**
     * Removes an user from the system.
     *
     * @param email - email by which user is found
     */
    public void deleteUser(String email) {
        User user = findUser(email);
        if (user != null) {
            users.remove(user);
        }
    }

    /**
     * Finds an existing user by unique email address
     *
     * @param email - email by which user is found
     * @return the user with provided email OR null if no user is found
     */
    private User findUser(String email) {
        for (User currentUser : users) {
            if (currentUser.getEmail().equalsIgnoreCase(email)) {
                return currentUser;
            }
        }
        return null;
    }
}
