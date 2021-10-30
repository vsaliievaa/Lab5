package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    private double price;
    private boolean status = true;

    @BeforeEach
    void setUp() {
        price = 36.6;
    }

    @Test
    void testPay() {
        CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();
        assertTrue(payment.pay(price));
    }
}