package genericbox;

public class Mail {
    private final String sender;

    public Mail(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "sender='" + sender + '\'' +
                '}';
    }
}
