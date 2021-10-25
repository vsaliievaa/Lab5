package payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.format("Paid %f via credit card\n", price);
        return true;
    }
}
