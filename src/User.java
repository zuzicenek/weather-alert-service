import java.util.List;
import java.util.ArrayList;

public class User {
    private String nickName;
    private String location;
    private List<Notification> notifications;

    public User(String nickName, String location) {
        this.nickName = nickName;
        this.location = location;
        this.notifications = new ArrayList<>();
    }

    public void addNotification(Notification notification) {
        notifications.add(notification);
    }

    public String getLocation() {
        return location;
    }
    public String getNickName() {
        return nickName;
    }

    public void sendAlert(String message) {
        for (Notification n : notifications) {
            n.sendAlert(message);
        }
    }
}