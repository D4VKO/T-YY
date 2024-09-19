class PayPalPayment extends Payment {
    private String email;

    // e-mail lauciņš

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Šis PayPal konts tiks izmantots apmaksai: " + email);
    }
}
