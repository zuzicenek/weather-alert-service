import java.util.List;
import java.util.ArrayList;

public class RegisteredUsers {
    private List<User> users;

    public RegisteredUsers() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void sendAlert(String requiredLocation, String message) {
        for (User user : users) {
            if (user.getLocation().equals(requiredLocation)) {
                user.sendAlert(message);
            }
        }
    }
}