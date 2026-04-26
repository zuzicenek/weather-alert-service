public class EmailNotification implements Notification {

    private String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void sendAlert(String message) {
        NotificationSender.getInstance().sendEmail(email, message);
    }
}
