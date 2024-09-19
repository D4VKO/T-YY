public class Main {

    public static void processPayment(Payment payment) {
        payment.processPayment();
    }

    // jaunu objektu izveide

    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment("1234-1234-4321-4321");
        Payment creditCardPayment2 = new CreditCardPayment("4444-3333-2222-1111");
        Payment payPalPayment = new PayPalPayment("davismikelsons@paypal.com");
        Payment payPalPayment2 = new PayPalPayment("janisberzins@paypal.com");

        // izsauc processpayment metodi kopaa ar jaunajiem objektiem

        processPayment(creditCardPayment);
        processPayment(creditCardPayment2);
        processPayment(payPalPayment);
        processPayment(payPalPayment2);
    }
}