package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    private double price;

    @BeforeEach
    void setUp() {
        price = 35.5;
    }

    @Test
    void testPay() {
        PayPalPaymentStrategy payment = new PayPalPaymentStrategy();
        assertTrue(payment.pay(price));
    }
}