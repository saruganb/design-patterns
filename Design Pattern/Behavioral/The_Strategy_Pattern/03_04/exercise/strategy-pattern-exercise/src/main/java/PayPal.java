public class PayPal implements Payment{


    @Override
    public String payment(int amount) {
        return "Payment of " + amount + " Made from Paypal";
    }
}
