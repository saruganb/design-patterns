public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.makePayment(100, new BankAccount());
  }

}
