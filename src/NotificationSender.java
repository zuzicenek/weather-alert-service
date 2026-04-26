public class NotificationSender {

    private static NotificationSender instance;

    private NotificationSender() {}

    public static NotificationSender getInstance() {
        if (instance == null) {
            instance = new NotificationSender();
        }
        return instance;
    }

    public void sendSMS(String phoneNumber, String message) {
        System.out.println("SMS odeslaná na číslo: " + phoneNumber + " zpráva: " + message);
    }

    public void sendEmail(String email, String message) {
        System.out.println("Email odeslán na adresu: " + email + " zpráva: " + message);
    }
}
