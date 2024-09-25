package practical5Bwek6Postlab1;

public class Client4 {
	public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MyApplication app1 = new MyApplication(emailService);
        app1.send("Hello via Email!");

        MessageService smsService = new SMSService();
        MyApplication app2 = new MyApplication(smsService);
        app2.send("Hello via SMS!");
    }
}
