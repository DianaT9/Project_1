import service.UserRegistratorService;

public class Main {

    public static void main(String[] args) {
        UserRegistratorService userRegistratorService = new UserRegistratorService();

        int bobId = userRegistratorService.registerUser("Bob", "bob@bob.com");
        System.out.println("Bob ID must not be -1: " + bobId);

        int blaId = userRegistratorService.updateUserPhone("bla", "123456");
        System.out.println("User not found, expected -1: " + blaId);
    }
}
