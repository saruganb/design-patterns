public class BankAccount implements Payment{
    @Override
    public String payment(int amount) {
        return "Payment of " + amount + " made from bank account";
    }
}
