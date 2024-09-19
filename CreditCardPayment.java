public class CreditCardPayment extends Payment {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Maksājums tiks veikts ar kartes numuru: " + cardNumber);
    }
}