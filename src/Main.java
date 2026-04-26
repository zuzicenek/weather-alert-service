public class Main {

    public static void main(String[] args) {

        RegisteredUsers registry = new RegisteredUsers();

        User u1 = new User("Pepa", "Beskydy");
        u1.addNotification(new SMSNotification("775622881"));
        User u2 = new User("Karel", "Krkonoše");
        u2.addNotification(new SMSNotification("678555666"));

        User u3 = new User("Anna", "Jeseníky");
        u3.addNotification(new EmailNotification("anna@email.cz"));

        User u4 = new User("Eva", "Krušné hory");
        u4.addNotification(new EmailNotification("eva@email.cz"));

        User u5 = new User("Lojza", "Beskydy");
        u5.addNotification(new SMSNotification("627598659"));
        u5.addNotification(new SMSNotification("895632587"));
        u5.addNotification(new SMSNotification("721478965"));

        u5.addNotification(new EmailNotification("a@post.cz"));
        u5.addNotification(new EmailNotification("b@seznam.cz"));
        u5.addNotification(new EmailNotification("c@centrum.cz"));


        registry.addUser(u1);
        registry.addUser(u2);
        registry.addUser(u3);
        registry.addUser(u4);
        registry.addUser(u5);

        System.out.println("=== Odesílání alertu pro Beskydy ===");
        registry.sendAlert("Beskydy", "Pozor! Silný déšť!");
    }
}