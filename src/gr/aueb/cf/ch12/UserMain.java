package gr.aueb.cf.ch12;

public class UserMain {
    public static void main(String[] args) {

        User user = new User(1L, "george", "alexander", "george21", "G@5156", true);

        user.setPassword("newPassword");

        System.out.printf("{id: %d, username: %s}", user.getId(), user.getUsername(), user.getPassword());
    }
}
