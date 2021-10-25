package payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.format("Paid %f via PayPal\n", price);
        return true;
    }
}
