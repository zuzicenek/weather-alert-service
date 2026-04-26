public class SMSNotification implements Notification {

    private String phoneNumber;

    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendAlert(String message) {
        NotificationSender.getInstance().sendSMS(phoneNumber, message);
    }
}

