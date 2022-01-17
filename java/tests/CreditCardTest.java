import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void shouldReturnApprovedTransaction() {
        CreditCard card = new CreditCard();
        card.setTax(0.05f);
        card.setAmountToPay(10);
        card.setPayment(10.5f);
        assertEquals("Approved", card.verifyTransaction());
    }

    @Test
    void shouldReturnDeniedTransaction() {
        CreditCard card = new CreditCard();
        card.setTax(5.0f);
        card.setAmountToPay(10);
        card.setPayment(10);
        assertEquals("Denied", card.verifyTransaction());
    }

    @Test
    void shouldReturnData() {
        CreditCard card = new CreditCard();
        card.setTax(5.0f);
        card.setAmountToPay(10);
        card.setPayment(10.5f);
        card.setMethod("Mastercard");
        assertEquals("Payment{amount=10.0, method='Mastercard', transaction=Denied, tax=5.0}", card.getData());
    }
}