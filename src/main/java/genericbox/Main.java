package genericbox;

public class Main {
    public static void main(String[] args) {
        Box<Product> productBox = new Box<>();
        Product sneakers = new Product("Nike");
        productBox.setT(sneakers);
        System.out.println(productBox.getT());

        Box<Mail> mailBox = new Box<>();
        Mail mail = new Mail("Renegade");
        mailBox.setT(mail);
        System.out.println(mailBox.getT());

    }
}
